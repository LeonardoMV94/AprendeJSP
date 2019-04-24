<%-- 
    Document   : ejemploExpresiones
    Created on : 24-04-2019, 1:33:46
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
        <h1>Expresiones JSP</h1>
		
		Convirtiendo a mayusculas: <%= new String("Leonardo").toUpperCase()%>
		<br>

		la suma de 5 y 7 es : <%=5+7%>

		<br>
		
		la multiplicacion entre 10 y 7 es: <%= 10*7%>
		
		
    </body>
</html>
