<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.bootcampjava.negreirajeremy_pruebatec2.logica.Turno"%>
<%@page import="com.bootcampjava.negreirajeremy_pruebatec2.logica.Ciudadano"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Turnos</title>
    </head>
    <body>
        <h1>Turnos:</h1><br>
        <% if (request.getAttribute("turnosFiltrado") != null && !((List<Turno>) request.getAttribute("turnosFiltrado")).isEmpty()) { %>
        <h3>Resultados:</h3>
        <!-- Tabla para mostrar los resultados filtrados -->
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th>Numero de turno</th>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Apellidos</th>
                    <th>DNI</th>
                    <th>Fecha</th>
                    <th>Hora</th>
                    <th>Tramite</th>
                    <th>Estado</th>
                </tr>
            </thead>
            <tbody>
                <!-- Iterar sobre la lista de turnos filtrados -->
                <% for (Turno turno : (List<Turno>) request.getAttribute("turnosFiltrado")) {%>
                <tr>
                    <td><%= turno.getId()%></td>
                    <td><%= turno.getCiudadano().getId()%></td>
                    <td><%= turno.getCiudadano().getNombre()%></td>
                    <td><%= turno.getCiudadano().getApellido()%></td>
                    <td><%= turno.getCiudadano().getDni()%></td>
                    <td><%= turno.getFecha().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))%></td>
                    <td><%= turno.getHora().format(DateTimeFormatter.ofPattern("HH:mm"))%></td>
                    <td><%= turno.getDescripcion()%></td>
                    <td><%= turno.getEstado()%></td>
                </tr>
                <% } %>
            </tbody>
        </table>
        <% } else { %>
        <p>No hay resultados.</p>
        <% }%>
    </body>
</html>

