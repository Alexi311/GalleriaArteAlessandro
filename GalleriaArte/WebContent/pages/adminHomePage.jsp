<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Amministrazione: HomePage</title>
<link href="<s:url value="/css/adminLayoutStyle.css"/>" rel="stylesheet" type="text/css"/>      

</head>
<body>
	<a id="collegamento" href="gestioneAutori.action" >
		<div id="contenitore" style="background-color:navy;">
			Gestione Autori
		</div>
	</a>
	<br/>
	<a id="collegamento" href="gestioneQuadri.action">
		<div id="contenitore" style="background-color:blue;">
			Gestione Quadri
		</div>
	</a>
	<br/>
	<a id="collegamento" href="gestioneAdmin.action">
		<div id="contenitore" style="background-color:#00bcd4">
			Gestione Amministratori
		</div>
	</a>
	<br/>
	<a id="collegamento" href="welcome.action">Torna alla Home</a>
</body>
</html>