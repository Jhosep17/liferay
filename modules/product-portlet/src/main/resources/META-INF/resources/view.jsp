<%@page import="edu.ecopharmacy.nttdata.model.Product"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp"%>

<h1>REGISTRAR UN NUEVO PRODUCTO</h1>

<!-- Se le asigna un nombre el cual será de la fase Action e identificamos que sera un actionURL -->
<portlet:actionURL name="productForm" var="productFormURL">
</portlet:actionURL>

<liferay-portlet:renderURL varImpl="productRenderURL">
	<portlet:param name="mvcRenderCommandName" value="productRender" />
	<portlet:param name="option" value="lista" />
</liferay-portlet:renderURL>

<!-- Creamos un formulario de tipo POST y asignamos la accion que va realizar -->
<aui:form method="post" action="${productFormURL }">

	<aui:input type="text" name="nombre">
		<aui:validator name="required" errorMessage="errorMessage"/>
		<aui:validator name="alpha" errorMessage="Se permiten solo letras"/>
	</aui:input>
	<aui:input type="text" name="descripcion">
		<aui:validator name="required" errorMessage="errorMessage"/>
		<aui:validator name="alpha" errorMessage="Se permiten solo letras"/>
	</aui:input>
	<aui:select name="selecciona-categoria">
		<aui:option value="1">Generico</aui:option>
		<aui:option value="2">Receta Medica</aui:option>
		<aui:option value="3">Online</aui:option>
		<aui:validator name="required" errorMessage="errorMessage"/>
	</aui:select>
	<aui:input type="number" name="precio">
	<aui:validator name="required" errorMessage="errorMessage"/>
	<aui:validator name="alphanum" errorMessage="Se permiten solo numeros"/>
	</aui:input>
	<aui:input type="text" name="imagen">
		<aui:validator name="required" errorMessage="errorMessage"/>
		<aui:validator name="alpha" errorMessage="Se permiten solo letras"/>
	</aui:input>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
		<aui:button value="Lista" href="${productRenderURL}" type="button" />
	</aui:button-row>
</aui:form>

