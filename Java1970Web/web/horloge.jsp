<%-- 
    Document   : horloge en jsp
    Created on : 05-juin-2018, 21:17:34
    Author     : jedepaepe
--%>

<%-- profitez de Netbeans pour créer les import, avec ctrl-espace quand vous tapez les noms des classes --%>
<%@page import="java.time.LocalTime"%>
<%@page import="java.time.Duration"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%
    LocalTime now = LocalTime.now();
    LocalTime start = (LocalTime) session.getAttribute("start");
    if (start == null) {
        start = now;
        session.setAttribute("start", start);
    }
    Duration duration = Duration.between(start, now);
    long seconds = duration.toMillis() / 1000;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Horloge</title>
        <!-- force refresh toutes les 5 secondes (pour le fun) -->
        <meta http-equiv="refresh" content="5" />
    </head>
    <body>
        <!-- un peu de style à la mode hacking (ce n'est pas les bonnes pratiques) -->
        <div style="margin: 20px auto; max-width: 500px;">
            <header>
                <h1>JSP Horloge</h1>
                <!-- hr est une ligne horizontale -->
                <hr>
            </header>
            <main>
                <!-- ul : unordered list,
                    fonctionne avec les li : list item
                -->
                <ul>
                    <li><%= start.format(formatter)%> - heure de chargement de la page</li>
                    <li><%= now.format(formatter)%> - heure courante</li>
                    <li><%= seconds%> - nombre de secondes écoulées</li>
                </ul>
            </main>
            <footer>
                <hr>
                <p>copyright epfc - author jedepaepe</p>
            </footer>
        </div>
    </body>
</html>
