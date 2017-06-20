<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Amministrazione: Nuovo Autore</title>
<link href="<s:url value="/css/adminLayoutStyle.css"/>" rel="stylesheet" type="text/css"/>      
</head>
<body>
	<s:form name="autore" action="insertAutore" method="POST">
		<table>
			<tr>
				<td>
					<label>Nome: </label> <s:textfield name="autore.nome"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>Cognome: </label> <s:textfield name="autore.cognome"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>Data di Nascita: </label> <s:textfield name="autore.dataNascita"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>Data di Morte: </label> <s:textfield name="autore.dataMorte"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>Nazionalità: </label> <s:textfield name="autore.nazionalita"/>
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