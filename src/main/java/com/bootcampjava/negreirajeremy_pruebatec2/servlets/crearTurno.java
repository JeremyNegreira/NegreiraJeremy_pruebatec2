package com.bootcampjava.negreirajeremy_pruebatec2.servlets;

import com.bootcampjava.negreirajeremy_pruebatec2.logica.Ciudadano;
import com.bootcampjava.negreirajeremy_pruebatec2.logica.ControladoraTurno;
import com.bootcampjava.negreirajeremy_pruebatec2.logica.Turno;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "crearTurno", urlPatterns = {"/crearTurno"}, initParams = {
    @WebInitParam(name = "Name", value = "Value")})
public class crearTurno extends HttpServlet {

    ControladoraTurno controlador = new ControladoraTurno();

    /**
     * Obtiene los parámetros requeridos para crear un Turno.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        LocalDate fecha = LocalDate.parse(request.getParameter("fecha")) ;
        String tramite = request.getParameter("tramite");
        String estado = request.getParameter("estado");
        String dni = request.getParameter("dni");
        
        Ciudadano ciudadanoEncontradoPorDni = controlador.traerCiudadanoPorDNI(dni);
        
        if (ciudadanoEncontradoPorDni == null) {
            return;
        }
        
        controlador.crearTurno(new Turno(fecha, tramite, estado, ciudadanoEncontradoPorDni));
        request.getRequestDispatcher("nuevoTurno.jsp").forward(request, response);
    }
}
