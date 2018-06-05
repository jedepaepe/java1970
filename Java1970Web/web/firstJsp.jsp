<%-- 
    "commentaire java"
    Document   : firstJsp
    Created on : 05-juin-2018, 20:43:02
    Author     : jedepaepe
--%>

<%
    // code java
    String name = "Albert";
    Integer counter = (Integer) session.getAttribute("jsp-counter");
    if (counter == null) {
        counter = 1;
    }
%>

<%-- directive --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%-- début du code HTML --%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>First JSP</title>
    </head>
    <body>
        <!-- insertion de code java dans la ligne HTML -->
        <h2>Hello <% out.println(name);%></h2>
        <!-- notion courte -->
        <h2>Hello <%= name%> (version courte)</h2>
        <!-- afficher le compteur -->
        <% if (counter == 1) { %>
        <h2>Première vue</h2>
        <% } else {%>
        <h2>Nr page view est <%= counter%></h2>
        <% } %>
    </body>
</html>
<%
    counter++;
    session.setAttribute("jsp-counter", counter);
%>
