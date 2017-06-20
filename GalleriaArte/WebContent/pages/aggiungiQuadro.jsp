<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Amministrazione: Nuovo Quadro</title>
<link href="<s:url value="/css/adminLayoutStyle.css"/>" rel="stylesheet" type="text/css"/>      
</head>
<body>
	<s:form name="quadro" action="insertQuadro" method="POST">
		<table>
			<tr>
				<td>
					<label>Titolo: </label> <s:textfield name="quadro.titolo"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>Autore: </label>	<s:select list="navigazione.listaAutori" listKey="%{id}" listValue="%{cognome}" name="quadro.autore.id"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>Percorso Immagine: </label> <s:textfield name="quadro.path" value="/images/[nomeQuadro]"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>Tecnica: </label> <s:textfield name="quadro.tecnica"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>Dimensioni: </label> <s:textfield name="quadro.dimensioni"/>
				</td>
			</tr>
			<tr>
				<td style="width:100%">
					<label>Descrizione: </label><s:textarea name="quadro.descrizione" cols="30" rows="8" wrap="physical" maxlength="500"></s:textarea>
				</td>
			<tr>
			<tr>
				<td>
					<label>Anno di Realizzazione: </label><s:textfield name="quadro.annoRealizzazione"/>
				</td>
			<tr>
				<td>
					<s:submit value="Aggiungi"/>
				</td>
			</tr>
		</table>
	</s:form>
</body>
</html>