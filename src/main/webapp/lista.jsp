<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.bootcampjava.negreirajeremy_pruebatec2.logica.Turno"%>
<%@page import="com.bootcampjava.negreirajeremy_pruebatec2.logica.Ciudadano"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Turnos</title>
    </head>
    <body>
        <h1>Turnos:</h1><br>
        <% if (request.getAttribute("listaTurnos") != null && !((List<Turno>) request.getAttribute("listaTurnos")).isEmpty()) { %>
        <h3>Resultados:</h3>
        <table>
            <thead>
                <tr>
                    <th>Número de turno</th>
                    <th>Ciudadano</th>
                    <th>Fecha</th>
                    <th>Descripcion</th>
                    <th>Estado</th>
                </tr>
            </thead>
            <tbody>
                <% for (Turno turno : (List<Turno>) request.getAttribute("listaTurnos")) {%>
                <tr>
                    <td><%= turno.getId()%></td>
                    <td><%= turno.getCiudadano().getDni()+ " " + turno.getCiudadano().getNombre()%></td>
                    <td><%= turno.getFecha()%></td>
                    <td><%= turno.getTramite()%></td>
                    <td><%= turno.getEstado()%></td>
                </tr>
                <% } %>
            </tbody>
        </table>
        <% } else { %>
        <p>No hay resultados</p>
        <% }%>
    </body>
</html>

