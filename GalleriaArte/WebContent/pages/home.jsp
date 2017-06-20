<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
   <link href="<s:url value="/css/layoutStyle.css"/>" rel="stylesheet" type="text/css"/>      

<s:set var="theme" value="'simple'" scope="page" />

<body id="body" style="min-width:100%; min-height:100%; border: 1px solid white">
	<div id="container">
		<table>
			<tr>
				<td>
					<h1 style="color:aqua">BENVENUTI NELLA GALLERIA D'ARTE DEL MIO PROGETTO</h1>
				</td>
			</tr>
			<tr>
				<td>
					<p style="color:aqua">
						Si clicchi su:<br/>
						Quadri: per visualizzare l'elenco dei quadri della galleria;<br/>
						Autori per visualizzare l'elenco degli autori dei quadri;<br/>
						Galleria per avere informazioni riguardo la galleria;<br/>
						Eventi per avere informazioni sui prossimi eventi e promozioni<br/>
					</p>
					<h3> Buona Visita</h3>
				</td>
		</table>
	</div>
</body>
