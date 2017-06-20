<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib uri="/struts-tags" prefix="s"%>

<!doctype html>

<html>
    <head>   
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">  
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <link href="<s:url value="/css/layoutStyle.css"/>" rel="stylesheet" type="text/css"/>      
   
   
            <title><tiles:insertAttribute name="title" ignore="true"></tiles:insertAttribute></title>
    </head>
 
   
    <body>
    	<div  style="min-height:98%; min-width:98%;">
        <table>
        	<tr>
                <td  id="header" width="100%">
                    <tiles:insertAttribute name="header" />
                </td>
            </tr>
            <tr>
                <td>
                    <tiles:insertAttribute name="body" />
                </td>
            </tr>
             <tr>
                <td height="30" style="border:1px:">
                    <tiles:insertAttribute name="footer" ignore="true"/>
                </td>
            </tr>
        </table>
      </div>
    </body>
    
    
<script type="text/javascript">






/*
$("#attivita").change(function(e){
    var value = $(this).val();
    //submit a form or make ajax call or use window.location
});


/*$(function() {
	$( "#datepicker" ).datepicker();
});



function handleChange(value){
	  window.location="callMyAction?ValueToSubmit="+value; //or you can submit a form from here or make an ajax call
}



$(function() {
  $( "#dataP" ).datepicker({
	  inline: true,
		nextText: '&rarr;',
		prevText: '&larr;',
		showOn: "button",
		buttonImage: "/TopShare/image/calendar-blue2.png",
		buttonImageOnly: true,
		dateFormat: 'dd-mm-yy'
});
});*/


</script>    
</html>
