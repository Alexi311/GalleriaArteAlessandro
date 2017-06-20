<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<link href="<s:url value="/css/layoutStyle.css"/>" rel="stylesheet" type="text/css"/>      
<s:text name="%{amministratore.erroreLogin}"/>
<s:form name="amministratore" action="admin" method="POST">
Accesso Amministratore
	<s:textfield name="amministratore.username" label="Username"/> <s:password name="amministratore.password" label="password"/> <s:submit value="Accedi"/> 
</s:form>
