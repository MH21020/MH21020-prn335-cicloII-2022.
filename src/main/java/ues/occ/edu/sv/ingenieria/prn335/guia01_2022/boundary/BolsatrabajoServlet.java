/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ues.occ.edu.sv.ingenieria.prn335.guia01_2022.boundary;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ues.occ.edu.sv.ingenieria.prn335.guia01_2022.entity.Persona;

/**
 *
 * @author Account1
 */
public class BolsatrabajoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
           out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            String title="";
            if (request.getParameter("buscarNombre") != null){
                title="Buscar por nombre";
            }else{
            title="Personas";
            }
            out.println("<title>"+title+"</title>");
            out.println("</head>");

            out.println("<body>");
            out.println("<a href='index.html' style='text-decoration: none; border: 1px solid black; border-radius: 3px; color: black; background: #F7F2F2; padding: 2px'>Regresar index</a>");
            out.println("<br><br>");
            out.println("<table border='1' style= 'text-align:center'>");
            out.println("<thead>");
            out.println("<tr>");
            out.println("<th>Id</th><th>Nombre</th><th>Apellido</th>");
            out.println("<th>Capacidades Especiales</th><th>Estado civil</th><th>Genero</th><th>Jubilado</th>");
            out.println("<th>Direccion</th><th>Conocido Por</th>");
            out.println("</tr");
            out.println("</thead>");
            out.println("<tbody>");
            //Recorrer Arralist
            ArrayList<Persona> arrayLi = new ArrayList<Persona>();
            if (request.getParameter("buscarNombre") != null) {
                String nombreBuscar = request.getParameter("buscarNombre");
                arrayLi = bs.BuscarPersonas(nombreBuscar);
            } else {
                arrayLi=bs.getPersona();
            }
            for (int i = 0; i < arrayLi.size(); i++) {
                out.println("<tr>");
                out.println("<td>" + bs.getPersona().get(i).getId_persona() + "</td>");
                out.println("<td>" + bs.getPersona().get(i).getNombres() + "</td>");
                out.println("<td>" + bs.getPersona().get(i).getApellidos() + "</td>");
                out.println("<td>" + bs.getPersona().get(i).getCapacidadesEspeciales() + "</td>");
                out.println("<td>" + bs.getPersona().get(i).getEstadoCivil() + "</td>");
                out.println("<td>" + bs.getPersona().get(i).getGenero() + "</td>");
                out.println("<td>" + bs.getPersona().get(i).getJubilado() + "</td>");
                out.println("<td>" + bs.getPersona().get(i).getDireccion() + "</td>");
                out.println("<td>" + bs.getPersona().get(i).getConocido_por() + "</td>");
                out.println("</tr>");
            }

            out.println("</tbody>");
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
            
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
