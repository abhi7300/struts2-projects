<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
	<h1>Struts 2 App - Registration Page</h1>

	<div>
		<s:if test="hasActionErrors()">
			<div class="errors">
				<s:actionerror />
			</div>
		</s:if>

		<s:if test="hasActionMessages()">
			<div class="welcome">
				<s:actionmessage />
			</div>
		</s:if>

	</div>

	<s:form action="register">
		<s:textfield name="userId" label="Username" />
		<s:password name="password" label="Password" />
		<s:textfield name="reEnteredPassword" label="Password" />
		<s:textfield name="firstname" label="firstname" />
		<s:textfield name="lastname" label="lastname" />
		<s:textfield name="email" label="email" />
		<s:textfield name="phone" label="phone" />
		<s:submit />
	</s:form>

</body>
</html>