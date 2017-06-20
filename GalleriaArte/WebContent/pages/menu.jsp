<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<link href="<s:url value="/css/main.css"/>" rel="stylesheet" type="text/css"/>
<link href="<s:url value="/css/stylesMenu.css"/>" rel="stylesheet" type="text/css"/>
<%-- <script src="<s:url value="/js/jquery-3.1.1.min.js"></s:url>" type="text/javascript"></script>
<script src="<s:url value="/js/script.js"></s:url>" type="text/javascript"></script>--%>
<div id='cssmenu'>
<ul>
   <li class='active'><a href='<s:url action="welcome"/>'>Home</a></li>
   	<li class='has-sub'><a href='#"/>'><span>Attività Utente</span></a>
      <ul>
   		<li><a href='<s:url action="calendario"/>'><span>Foglio di Lavoro</span></a></li>
        <li><a href='<s:url action="resources"/>'><span>Gruppo di Lavoro</span></a></li>
        <li><a href='<s:url action="riepilogoOrePersonale"/>'><span>Riepilogo Ore</span></a></li>
        <li><a href='<s:url action="cambioPsw"/>'><span>Cambio Password</span></a></li>
      </ul>
   </li>
</ul>
</div>


