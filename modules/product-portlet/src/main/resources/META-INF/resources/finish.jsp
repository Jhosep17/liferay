<%@ include file="/init.jsp"%>

<liferay-portlet:renderURL varImpl="productRenderURL">
	<portlet:param name="mvcRenderCommandName" value="productRender" />
	<portlet:param name="option" value="back" />
</liferay-portlet:renderURL>


<aui:button-row>
	<p>
		<b><liferay-ui:message key="thanks.message" /></b>
	</p>
	<aui:button value="Volver" href="${productRenderURL}" type="button" />
</aui:button-row>
