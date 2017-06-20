<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <s:set var="theme" value="'simple'" scope="page" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Amministrazione: Modifica Quadro</title>
<link href="<s:url value="/css/adminLayoutStyle.css"/>" rel="stylesheet" type="text/css"/>      
</head>
<body>
	<s:form name="quadro" action="updateQuadro" method="POST">
		<s:hidden name="quadro.id" value="%{quadro.id}"/>
		<table>
			<tr>
				<td> 
					<label>Titolo:</label>
					<s:textfield name="quadro.titolo" value="%{quadro.titolo}"/>		
				</td>
				<td>
					<label>Autore: </label>
					<s:select list="navigazione.listaAutori" listKey="%{id}" listValue="%{cognome}" name="quadro.autore.id"/>
				</td>
				<td>
					<label>Tecnica: </label>
					<s:textfield name="quadro.tecnica" value="%{quadro.tecnica}"/>	
				</td>
				<td>
					<label>Dimensioni: </label>
					<s:textfield name="quadro.dimensioni" value="%{quadro.dimensioni}"/>
				</td>
				<td>
					<label>Anno di Realizzazione: </label>
					<s:textfield name="quadro.annoRealizzazione" value="%{quadro.annoRealizzazione}"/>
				</td>
			</tr>
		</table>
		<table>
			<tr>
				<td>
					<label>Descrizione del quadro: </label>
					 <s:textarea name="quadro.descrizione" value="%{quadro.descrizione}" cols="30" rows="8" wrap="physical" maxlength="500"/>
				</td>
			</tr>
			<tr>
				<td>
					 <s:submit value="Modifica"/>
				</td>
			</tr>		
		</table>
	</s:form>
</body>
</html>