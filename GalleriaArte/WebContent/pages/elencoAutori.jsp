<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<s:url value="/css/layoutStyle.css"/>" rel="stylesheet" type="text/css"/>      
</head>
<body id="body">
	<table>
		<tr>
			<th> Indice </th>
			<th> Nome </th>
			<th> Cognome </th>
			<th> Data di Nascita </th>
			<th> Data di Morte </th>
			<th> Nazionalità </th>
		</tr>
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
			</tr>
		</s:iterator>
		<tr>
			<td>
				Ordina per <a id="ordine" href="autoriOrdineAlfabetico.action">ordine alfabetico </a> Ordina per <a id="ordine" href="autoriOrdineDataNascita.action">data di nascita </a>
			</td>
		</tr>
	</table>
</body>
</html>