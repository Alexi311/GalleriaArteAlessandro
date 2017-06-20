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
	<s:form name="autore" action="updateAutore" method="POST">
		<s:hidden name="autore.id" value="%{autore.id}"/>
		<table>
			<tr>
				<td> 
					<label>Nome: </label>
					<s:textfield name="autore.nome" value="%{autore.nome}"/>		
				</td>
				<td>
					<label>Cognome: </label>
					<s:textfield name="autore.cognome" value="%{autore.cognome}"/>
				</td>
				<td>
					<label>Data di Nascita: </label>
					<s:textfield name="autore.dataNascita" value="%{autore.dataNascita}"/>	
				</td>
				<td>
					<label>Data di Morte: </label>
					<s:textfield name="autore.dataMorte" value="%{autore.dataMorte}"/>
				</td>
				<td>
					<label>Nazionalità: </label>
					<s:textfield name="autore.nazionalita" value="%{autore.nazionalita}"/>
				</td>
				<td>
					<s:submit value="Modifica"/>
				</td>
			</tr>	
		</table>
	</s:form>
</body>
</html>