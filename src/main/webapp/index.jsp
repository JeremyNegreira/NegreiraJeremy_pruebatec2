<%@page import="com.bootcampjava.negreirajeremy_pruebatec2.logica.Turno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<html>
    <head>
        <title>Turnero</title>
    </head>
    <body>
        <h1>Turnero</h1><br>
        <form action="crearTurno" method="post">
            <label for="hora">Hora:</label>
            <input type="date" id="fecha" name="fecha" required><br>

            <label for="estado">Estado:</label>
            <select id="estado" name="estado" required>
                <option value="En espera">En espera</option>
                <option value="Ya atendido">Ya atendido</option>
            </select><br>

            <label for="dni" required>Descripción: </label>
            <input type="text" id="tramite" name="tramite" required><br>

            <label for="dni" required>DNI:</label>
            <input type="text" id="dni" name="dni" required><br>

            <input type="submit" value="Crear Turno">
        </form>

        <form action="listarTurnos" method="get">
            <input type="submit" value="Listar Turnos">
        </form>

        <form action="listarTurnosFiltrados" method="post">
            <label for="fechaMinimaFiltrado">Fecha mínima:</label>
            <input type="date" id="fechaMinimaFiltrado" name="fechaMinimaFiltrado" required><br>

            <label for="estadoFiltrado">Estado:</label>
            <select id="estadoFiltrado" name="estadoFiltrado" required>
                <option value="En espera">En espera</option>
                <option value="Ya atendido">Ya atendido</option>
            </select><br>

            <input type="submit" value="Listar Turnos Con Filtros">
        </form>
    </body>
</html>

