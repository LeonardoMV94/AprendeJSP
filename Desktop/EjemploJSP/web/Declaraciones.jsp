<%-- 
    Document   : Declaraciones
    Created on : 24-04-2019, 1:45:13
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
        <h1 style="text-align: center">Ejemplo de declaraciones</h1>

		<%!
			private int resultado;

			public int metodoSuma(int num1, int num2) {
				resultado = num1 + num2;

				return resultado;
			}
		%>

		<%!
			
			public int metodoResta(int num1, int num2) {
				resultado = num1 - num2;

				return resultado;
			}
		%>

		<%!
			
			public int metodoMultiplicar(int num1, int num2) {
				resultado = num1 * num2;

				return resultado;
			}
		%>
		
		El resultado de la suma es: <%= metodoSuma(7,8)%>
		<br>
		El resultado de la resta es: <%= metodoResta(10,8)%>
		<br>
		El resultado de la multiplicacion es: <%= metodoMultiplicar(7,8)%>
		<br>

		<!-- Es una buena practica no incluir mucho codigo java en un jsp
			No abusar de los Scriptlers
			Lo mejor es separar en modulos el codigo java
			como el modelo MVC (Modelo-Vista-COntrolador)
		
		-->

    </body>
</html>
