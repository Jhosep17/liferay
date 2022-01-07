<%@ include file="/init.jsp"%>


<!-- Se le asigna un nombre el cual será de la fase Action e identificamos que sera un actionURL -->
<portlet:actionURL name="inventoryForm" var="inventoryFormURL">
</portlet:actionURL>

<liferay-portlet:renderURL varImpl="productRenderURL">
	<portlet:param name="mvcRenderCommandName" value="productRender" />
	<portlet:param name="option" value="back" />
</liferay-portlet:renderURL>

<liferay-portlet:renderURL varImpl="returnListRenderURL">
		<portlet:param name="mvcRenderCommandName" value="productRender" />
		<portlet:param name="option" value="regresarlista" />
	</liferay-portlet:renderURL>

<h1>REGISTRAR PRODUCTO EN INVENTARIO</h1>
<!-- Creamos un formulario de tipo POST y asignamos la accion que va realizar -->
<aui:form method="post" action="${inventoryFormURL }">

	<aui:input type="text" name="nombre">
		<aui:validator name="required" errorMessage="errorMessage"/>
		<aui:validator name="alpha" errorMessage="Se permiten solo letras"/>
	</aui:input>
	
	<aui:select name="selecciona-sede">
		<aui:option value="1">Monterrico</aui:option>
		<aui:option value="2">San Miguel</aui:option>
		<aui:option value="3">Independencia</aui:option>
		<aui:option value="4">Callao</aui:option>
		<aui:option value="5">Lima</aui:option>
		<aui:validator name="required" errorMessage="errorMessage"/>
	</aui:select>
	<aui:input type="number" name="stock">
		<aui:validator name="required" errorMessage="errorMessage" />
		<aui:validator name="alphanum" errorMessage="Se permiten solo numeros" />
	</aui:input>


	<aui:button-row>
		<aui:button type="submit"></aui:button>
		<aui:button value="Volver" href="${productRenderURL}" type="button" />
	</aui:button-row>
</aui:form>