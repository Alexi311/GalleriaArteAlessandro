<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<link href="<s:url value="/css/layoutStyle.css"/>" rel="stylesheet" type="text/css"/>      
<body id="body">
<table>
	<tr>
		<th> Indice </th>
		<th> Titolo </th>
		<th> Descrizione </th>
		<th> Autore </th>
		<th> Tecnica </th>
		<th> Dimensioni </th>
		<th> Anno di Realizzazione </th>
		<th> Immagine </th>
	</tr>
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
					<img id="immagineQuadro" src="<s:url value="%{path}"/>"/>
				</td>
			</tr>
		</s:iterator>
		<tr>
			<td>
				Ordina per <a id="ordine" href="quadriOrdineAlfabetico.action">ordine alfabetico </a> Ordina per <a id="ordine" href="quadriOrdineAnnoRealizzazione.action">anno realizzazione </a>
			</td>
		</tr>
</table>
</body>