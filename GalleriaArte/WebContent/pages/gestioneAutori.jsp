<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Amministrazione: Gestione Autori</title>
<link href="<s:url value="/css/adminLayoutStyle.css"/>" rel="stylesheet" type="text/css"/>      
</head>
<body>
<a href="aggiungiAutore.action"><button>Nuovo Autore</button></a>
<s:form name="autore" method="GET">
	<table>
		<tr>
			<th> Indice </th>	
			<th> Nome </th>
			<th> Cognome </th>
			<th> Data di Nascita </th>
			<th> Data di Morte </th>
			<th> Nazionalità </th>
		</tr>
		<s:hidden name="autore.id" id="id" value="%{id}"/>
		<s:hidden name="autore.nome" id="nome" value="%{nome}"/>
		<s:hidden name="autore.cognome" id="cognome" value="%{cognome}"/>
		<s:hidden name="autore.dataNascita" id="dataNascita" value="%{dataNascita}"/>
		<s:hidden name="autore.dataMorte" id="dataMorte" value="%{dataMorte}"/>
		<s:hidden name="autore.nazionalita" id="nazionalita" value="%{nazionalita}"/>
		<s:iterator value="navigazione.listaAutori" status="p">
				<tr>
					<td>
						<s:text name="%{id}"/>
					</td>
					<td>
						<s:text name="%{nome}"/>
					</td>
					<td>
						<s:text name="%{cognome}"/>
					</td>
					<td>
						<s:date name="%{dataNascita}" format="dd/MM/yyyy"/>
					</td>
					<td>
						<s:date name="%{dataMorte}" format="dd/MM/yyyy"/>
					</td>
					<td>
						<s:text name="%{nazionalita}"/>
					</td>
					<td>
						<a id="collegamento" href="#" onclick="modificaAutore('<s:property value="%{id}"/>', '<s:property value="%{nome}"/>', '<s:property value="%{cognome}"/>', '<s:property value="%{dataNascita}"/>', '<s:property value="%{dataMorte}"/>', '<s:property value="%{nazionalita}"/>')">Modifica</a> <a id="collegamento" href="#" onclick="cancellaAutore('<s:property value="%{id}"/>')">Cancella</a>
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
	function modificaAutore(id, nome, cognome, dataNascita, dataMorte, nazionalita)
	{
		document.getElementById("id").value= id;
		document.getElementById("nome").value = nome;
		document.getElementById("cognome").value = cognome;
		document.getElementById("dataNascita").value = dataNascita;
		document.getElementById("dataMorte").value = dataMorte;
		document.getElementById("nazionalita").value = nazionalita;
		document.forms['autore'].action = "modificaAutore";
		document.forms['autore'].submit();
	}

	function cancellaAutore(id)
	{
		var sicuro = confirm("Sicuro di voler cancellare l'autore ? (L'azione è irreversibile)");
		if(sicuro)
		{
			document.getElementById("id").value = id;
			document.forms['autore'].action = "cancellaAutore";
			document.forms['autore'].submit();
		}
	}
	
	</script>
	</body>