<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Amministrazione: Gestione Amministratori</title>
<link href="<s:url value="/css/adminLayoutStyle.css"/>" rel="stylesheet" type="text/css"/>     
</head>
<body>
<s:form name="amministratore" method="GET">
	<a href="aggiungiAmministratore.action"><button>Nuovo Amministratore</button></a>
	<table>
		<tr>
			<th> Nome </th>
			<th> Cognome </th>
			<th> Matricola </th>
			<th> Username </th>
		</tr>
		<s:hidden name="amministratore.nome" id="nome" value="%{nome}"/>
		<s:hidden name="amministratore.cognome" id="cognome" value="%{cognome}"/>
		<s:hidden name="amministratore.matricola" id="matricola" value="%{matricola}"/>
		<s:hidden name="amministratore.username" id="username" value="%{username}"/>
		<s:iterator value="navigazione.listaAmministratori" status="p">
			<tr>
				<td>
					<s:text name="%{nome}"/>
				</td>
				<td>
					<s:text name="%{cognome}"/>
				</td>
				<td>
					<s:text name="%{matricola}"/>
				</td>
				<td>
					<s:text name="%{username}"/>
				</td>
				<td>
					<a id="collegamento" href="#" onclick="modificaAmministratore('<s:property value="%{nome}"/>', '<s:property value="%{cognome}"/>', '<s:property value="%{matricola}"/>', '<s:property value="%{username}"/>')">Modifica</a> <a id="collegamento" href="#" onclick="cancellaAmministratore('<s:property value="%{username}"/>')">Cancella</a>
				</td>
			</tr>
		</s:iterator>
		<tr>
			<td>
				<a id="collegamento" href="welcome.action">Torna alla Home</a>
		 		<a id="collegamento" href="adminRitorno.action">Torna alla Home da Amministratore</a> 
		 	</td>
		</tr>
	</table>
</s:form>
	
	<script>
	function modificaAmministratore(nome, cognome, matricola, username)
	{
		document.getElementById("nome").value = nome;
		document.getElementById("cognome").value = cognome;
		document.getElementById("matricola").value = matricola;
		document.getElementById("username").value = username;
		document.forms['amministratore'].action = "modificaAmministratore";
		document.forms['amministratore'].submit();
	}

	function cancellaAmministratore(username)
	{
		var sicuro = confirm("Sicuro di voler cancellare l'amministratore ? (L'azione è irreversibile)");
		if(sicuro)
		{
			document.getElementById("username").value = username;
			document.forms['amministratore'].action = "cancellaAmministratore";
			document.forms['amministratore'].submit();
		}
	}
	
	</script>
</body>
</html>