<%@ include file="/init.jsp"%>

<p>
	<b><liferay-ui:message key="product.caption" /></b>
</p>

<!-- Se le asigna un nombre el cual será de la fase Action e identificamos que sera un actionURL -->
<portlet:actionURL name="productForm" var="productFormURL">
</portlet:actionURL>

<!-- Creamos un formulario de tipo POST y asignamos la accion que va realizar -->
<aui:form method="post" action="${productFormURL }">

	<aui:input type="text" name="nombre"></aui:input>
	<aui:input type="text" name="descripcion"></aui:input>
	<aui:input type="text" name="categoria"></aui:input>
	<aui:input type="number" name="precio"></aui:input>
	<aui:input type="text" name="imagen"></aui:input>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
</aui:form>