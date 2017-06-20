<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<link href="<s:url value="/css/layoutStyle.css"/>" rel="stylesheet" type="text/css"/>      

<s:set var="theme" value="'simple'" scope="page" />

<h1 style="color:#ffffff;"><b>PROGETTO GALLERIA D'ARTE </b></h1>

<div id="header">
<a href="<s:url action="welcome"/>"><span id="tastoMenu"><b>Home</b></span></a>
<a href="<s:url action="opere"/>"><span id="tastoMenu"><b>Opere</b></span></a>
<a href="<s:url action="autori"/>"><span id="tastoMenu"><b>Autori</b></span></a>
<a href="<s:url action="galleria"/>"><span id="tastoMenu"><b>Galleria</b></span></a>
<a href="<s:url action="eventi"/>"><span id="tastoMenu"><b>Eventi</b></span></a>
</div>
  <%-- <table id="tabellaHeader" width="100%">
  
        <tbody>	
          <tr>
            <td class="bordoSinistro" style="font-size: 16px; color: #FFFFFF;background-color: #038dca; width:170px;">TOPSHARE WEB 1.0</td>
			<td><span>Le Opere</span></td>
			<td><span>Gli Autori</span></td>
			<td><span>La Galleria</span></td>         	
           </tr>
          
          </tbody>
        </table>
      
--%>