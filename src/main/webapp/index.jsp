<%@page import="com.bootcampjava.negreirajeremy_pruebatec2.logica.Turno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Turnero</title>
</head>
<body>
    <h2>Lista de Turnos</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Fecha y hora</th>
            <th>Estado</th>
        </tr>
        <% List<Turno> turnos = (List<Turno>) request.getAttribute("turnos"); %>
        <% for (Turno turno : turnos) { %>
            <tr>
                <td><%= turno.getId()%></td>
                <td><%= turno.getHora() %></td>
                <td><%= turno.getEstado() %></td>
            </tr>
        <% } %>
    </table>
</body>
</html>

