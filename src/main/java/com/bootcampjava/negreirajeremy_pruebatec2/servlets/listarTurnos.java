package com.bootcampjava.negreirajeremy_pruebatec2.servlets;

import com.bootcampjava.negreirajeremy_pruebatec2.logica.ControladoraTurno;
import com.bootcampjava.negreirajeremy_pruebatec2.logica.Turno;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "listarTurnos", urlPatterns = {"/listarTurnos"})
public class listarTurnos extends HttpServlet {

    ControladoraTurno controlador = new ControladoraTurno();

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Turno> listaTurnos = controlador.traerTurnos();
        
        request.setAttribute("listaTurnos", listaTurnos);
        request.getRequestDispatcher("lista.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Devuelve todos los turnos";
    }
}
