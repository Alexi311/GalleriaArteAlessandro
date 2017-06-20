<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Amministrazione: Nuovo Amministratore</title>
<link href="<s:url value="/css/adminLayoutStyle.css"/>" rel="stylesheet" type="text/css"/>      
</head>
<body>
	<s:form name="amministratore" action="insertAmministratore" method="POST">
		<table>
			<tr>
				<td>
					<label>Nome: </label> <s:textfield name="amministratore.nome"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>Cognome: </label> <s:textfield name="amministratore.cognome"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>Matricola: </label> <s:textfield name="amministratore.matricola"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>Username: </label> <s:textfield name="amministratore.username"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>Password: </label> <s:password name="amministratore.password"/>
				</td>
			</tr>
			<tr>
				<td>
					<s:submit value="Aggiungi"/>
				</td>
			</tr>
		</table>
	</s:form>
</body>
</html>