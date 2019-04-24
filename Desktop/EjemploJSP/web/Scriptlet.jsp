<%-- 
    Document   : Scriptlet
    Created on : 24-04-2019, 1:41:37
    Author     : Leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Scriptlet</h1>
		
		Ejemplo de Scriptlet
		<br>
		<%
		
			for (int i = 0; i < 10; i++) {
					
				out.println("<br>Este es el mensaje:" + i);
				
				}
		
			
			
			
			%>
			
    </body>
</html>
