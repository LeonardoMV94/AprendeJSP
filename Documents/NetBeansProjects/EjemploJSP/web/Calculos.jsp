<%-- 
    Document   : Calculos
    Created on : 24-04-2019, 2:03:10
    Author     : Leonardo
--%>

<%-- 

	para exportar clases se agrega la sigueinte linea
	<%@page import="cl.calculos.Calculos"%>
--%>

<%@page import="cl.calculos.Calculos"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Uso de llamada de codigo Java</h1>

		la suma de 5 y 7 es: <%= Calculos.metodoSuma(5, 7)%>
		<br>
		la resta de 10 y 7 es: <%= Calculos.metodoResta(10, 7)%>
		<br>
		la multiplicacion de 10 y 7 es: <%= Calculos.metodoMultiplicar(10, 7)%>



    </body>
</html>
