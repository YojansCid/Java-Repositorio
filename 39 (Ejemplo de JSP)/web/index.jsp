<%-- 
    Document   : index
    Created on : 20-11-2017, 17:43:44
    Author     : Yojans Cid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ejemplo de JSP</h1>
        <h2><%="Ciclo FOR hecho en un JSP "%></h2>
        <% for (int i = 0; i < 10; i++) {%>
                
        <p><h3><%="Ejemmplo de Iteracion N° " + i%></p></h3>
            
        <%}%>
    </body>
</html>


<%--Notacion de Comentario
Se puede mezclar (al igual que PHP y Html) el Lenguaje JAVA con Html, gracias 
a las notaciones disponibles (<% [Logica, ciclos etc] %>)
--%>

