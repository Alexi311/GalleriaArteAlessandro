<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Amministrazione: Gestione Quadri</title>
<link href="<s:url value="/css/adminLayoutStyle.css"/>" rel="stylesheet" type="text/css"/>      
</head>
<body>
	<a href="aggiungiQuadro.action"><button>Nuovo Quadro</button></a>
	<s:form name="quadro" method="GET">
		<table>
			<tr>
				<th> Indice </th>
				<th> Titolo </th>
				<th> Descrizione </th>
				<th> Autore </th>
				<th> Tecnica </th>
				<th> Dimensioni </th>
				<th> Anno di Realizzazione </th>
			</tr>
			<s:hidden name="quadro.id" id="idQuadro" value="%{id}"/>
			<s:hidden name="quadro.titolo" id="titolo" value="%{titolo}"/>
			<s:hidden name="quadro.descrizione" id="descrizione" value="%{descrizione}"/>
			<s:hidden name="quadro.autore.id" id="idAutore" value="%{autore.id}"/>
			<s:hidden name="quadro.tecnica" id="tecnica" value="%{tecnica}"/>
			<s:hidden name="quadro.dimensioni" id="dimensioni" value="%{dimensioni}"/>
			<s:hidden name="quadro.annoRealizzazione" id="annoRealizzazione" value="%{annoRealizzazione}"/>
			<s:iterator value="navigazione.listaQuadri" status="p">
				<tr>
					<td>
						<s:text name="%{id}"/>
					</td>
					<td>
						<s:text name="%{titolo}"/>
					</td>
					<td>
						<s:text name="%{descrizione}"/>
					</td>
					<td>
						<s:text name="%{autore.cognome}"/>
					</td>
					<td>
						<s:text name="%{tecnica}"/>
					</td>
					<td>
						<s:text name="%{dimensioni}"/>
					</td>
					<td>
						<s:text name="%{annoRealizzazione}"/>
					</td>
					<td>
						<a id="collegamento" href="#" onclick="modificaQuadro('<s:property value="%{id}"/>', '<s:property value="%{titolo}"/>', '<s:property value="%{descrizione}"/>', '<s:property value="%{autore.id}"/>', '<s:property value="%{tecnica}"/>', '<s:property value="%{dimensioni}"/>', '<s:property value="%{annoRealizzazione}"/>')">Modifica</a> <a id="collegamento" href="#" onclick="cancellaQuadro('<s:property value="%{id}"/>')">Cancella</a>
					</td>
				</tr>
			</s:iterator>
			<tr>
				<td>
					<a id="collegamento" href="welcome.action">Torna alla Home</a>  <a id="collegamento" href="adminRitorno.action">Torna alla Home da Amministratore</a> 
			 		
			 	</td>
			</tr>
		</table>
	</s:form>
	
	<script>
	function modificaQuadro(idQuadro, titolo, descrizione, idAutore, tecnica, dimensioni, annoRealizzazione)
	{
		document.getElementById("idQuadro").value = idQuadro;
		document.getElementById("titolo").value = titolo;
		document.getElementById("descrizione").value = descrizione;
		document.getElementById("idAutore").value = idAutore;
		document.getElementById("tecnica").value = tecnica;
		document.getElementById("dimensioni").value = dimensioni;
		document.getElementById("annoRealizzazione").value = annoRealizzazione;
		document.forms['quadro'].action = "modificaQuadro";
		document.forms['quadro'].submit();
	}

	function cancellaQuadro(id)
	{
		var sicuro = confirm("Sicuro di voler cancellare l'autore ? (L'azione è irreversibile)");
		if(sicuro)
		{
			document.getElementById("id").value = id;
			document.forms['quadro'].action = "cancellaQuadro";
			document.forms['quadro'].submit();
		}
	}

	</script>
</body>
</html>