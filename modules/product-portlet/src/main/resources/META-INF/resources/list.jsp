<%@page import="edu.ecopharmacy.nttdata.bean.ProductBean"%>
<%@ include file="/init.jsp"%>


<%
	List<ProductBean> list = (List<ProductBean>) renderRequest.getAttribute("productList");
%>

<liferay-portlet:renderURL varImpl="paginationURL">
	<portlet:param name="mvcRenderCommandName" value="productRender" />
	<portlet:param name="option" value="lista" />

	<liferay-portlet:renderURL varImpl="productRenderURL">
		<portlet:param name="mvcRenderCommandName" value="productRender" />
		<portlet:param name="option" value="back" />
	</liferay-portlet:renderURL>


	<liferay-portlet:renderURL varImpl="inventoryRenderURL">
		<portlet:param name="mvcRenderCommandName" value="productRender" />
		<portlet:param name="option" value="inventory" />
	</liferay-portlet:renderURL>


</liferay-portlet:renderURL>
<h1>PRODUCTOS REGISTRADOS</h1>
<br />
<div class="closed container-fluid-1280 sidenav-container sidenav-rigth">
	<div class="sidenav-content">
		<liferay-ui:search-container iteratorURL="${paginationURL}"
			total="${count}" id="products">
			<liferay-ui:search-container-results
				results="<%=ListUtil.subList(list, searchContainer.getStart(), searchContainer.getEnd())%>" />

			<liferay-ui:search-container-row className="ProductBean"
				keyProperty="id" modelVar="product">

				<liferay-ui:search-container-column-text name="Nombre"
					property="nombre" />
				<liferay-ui:search-container-column-text name="Descripcion"
					property="descripcion" />
				<liferay-ui:search-container-column-text name="Precio"
					property="precio" />
				<liferay-ui:search-container-column-text name="Categoria"
					property="nameCategoria" />
				<liferay-ui:search-container-column-text name="Detalle">
					<aui:button value="Agregar Inventario" type="button" />
				</liferay-ui:search-container-column-text>

			</liferay-ui:search-container-row>


			<liferay-ui:search-iterator markupView="lexicon" />
		</liferay-ui:search-container>
	</div>
</div>
<aui:button-row>
	<aui:button value="Volver" href="${productRenderURL}" type="button" />
	<aui:button value="Registrar Inventario" href="${inventoryRenderURL}"
		type="button" />
</aui:button-row>
