<%@ include file="/init.jsp"%>


<aui:form method="post">

	<aui:input type="text" name="Name">
		<aui:validator name="required" errorMessage="errorMessage" />
		<aui:validator name="alpha" errorMessage="Se permiten solo letras" />
	</aui:input>
	<aui:input type="text" name="Email">
		<aui:validator name="required" errorMessage="errorMessage" />
		<aui:validator name="alpha" errorMessage="Se permiten solo letras" />
	</aui:input>
	<aui:input type="number" name="Phone">
		<aui:validator name="required" errorMessage="errorMessage" />
		<aui:validator name="alphanum" errorMessage="Se permiten solo numeros" />
	</aui:input>
	<aui:input type="textarea" name="Message">
		<aui:validator name="required" errorMessage="errorMessage" />
		<aui:validator name="alpha" errorMessage="Se permiten solo letras" />
	</aui:input>

	<aui:button-row>
		<aui:button value="Enviar" type="button" />
	</aui:button-row>
</aui:form>
