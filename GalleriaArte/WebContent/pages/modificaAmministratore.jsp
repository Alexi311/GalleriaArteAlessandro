<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <s:set var="theme" value="'simple'" scope="page" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Amministrazione: Modifica Autore</title>
<link href="<s:url value="/css/adminLayoutStyle.css"/>" rel="stylesheet" type="text/css"/>      
</head>
<body>
	<s:form name="amministratore" action="updateAmministratore" method="POST">
		<s:hidden name="amministratore.usernameRiferimento" value="%{amministratore.username}"/>
		<table>
			<tr>
				<td> 
					<label>Nome: </label>
					<s:textfield name="amministratore.nome" value="%{amministratore.nome}"/>		
				</td>
				<td>
					<label>Cognome: </label>
					<s:textfield name="amministratore.cognome" value="%{amministratore.cognome}"/>
				</td>
				<td>
					<label>Matricola: </label>
					<s:textfield name="amministratore.matricola" value="%{amministratore.matricola}"/>	
				</td>
				<td>
					<label>Username: </label>
					<s:textfield name="amministratore.username" value="%{amministratore.username}"/>
				</td>
				<td>
					<s:submit value="Modifica"/>
				</td>
			</tr>	
		</table>
	</s:form>
</body>
</html>