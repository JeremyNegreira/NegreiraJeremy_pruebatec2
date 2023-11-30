/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
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

/**
 *
 * @author jerem
 */
@WebServlet(name = "listarTurnosFiltrados", urlPatterns = {"/listarTurnosFiltrados"})
public class listarTurnosFiltrados extends HttpServlet {

    ControladoraTurno controlador = new ControladoraTurno();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String fechaMinimaFiltrado = request.getParameter("fechaMinimaFiltrado");
        String estado = request.getParameter("estado");
        
        List<Turno> listaTurnoFiltrado = controlador.traerTurnosFiltrado(LocalDate.parse(fechaMinimaFiltrado), estado);
        
        request.setAttribute("listaTurnosFiltrados", listaTurnoFiltrado);
        request.getRequestDispatcher("listado.jsp").forward(request, response);
    }
    
        /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Devuelve todos los turnos a partir de la fecha pasada por parámetro y según el estado";
    }
}
