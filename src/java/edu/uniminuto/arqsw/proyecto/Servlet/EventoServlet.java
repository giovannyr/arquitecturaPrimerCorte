/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniminuto.arqsw.proyecto.Servlet;

import edu.uniminuto.arqsw.proyecto.DAO.CiudadDAO;
import edu.uniminuto.arqsw.proyecto.DAO.EventoDAO;
import edu.uniminuto.arqsw.proyecto.DAO.UsuarioDAO;
import edu.uniminuto.arqsw.proyecto.Hibernate.Ciudad;
import edu.uniminuto.arqsw.proyecto.Hibernate.Evento;
import edu.uniminuto.arqsw.proyecto.Hibernate.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GIOVANNY
 */
@WebServlet(name = "EventoServlet", urlPatterns = {"/EventoServlet"})
public class EventoServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EventoServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Evento creado</h1>");
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

        //  usuario
        UsuarioDAO userDao = new UsuarioDAO();
        Usuario usuario = userDao.getUserByRol("ADMIN");        
        
        EventoDAO eventoDao = new EventoDAO();

        String nombre = request.getParameter("nombre");
        String tipo = request.getParameter("tipo");
        int idCiudad = Integer.parseInt(request.getParameter("ciudad"));
        
        //  ciudad
        CiudadDAO ciudadDao = new CiudadDAO();
        Ciudad ciudad = ciudadDao.getCiudadById(idCiudad);

        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha_inicio = null;
        try {
            fecha_inicio = formatoDelTexto.parse(request.getParameter("fecha_inicio"));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        Date fecha_fin = null;
        try {
            fecha_fin = formatoDelTexto.parse(request.getParameter("fecha_fin"));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        Evento evento = new Evento(usuario, nombre, tipo, fecha_inicio, fecha_fin);
        
        HashSet evCiu = new HashSet();
        evCiu.add(ciudad);
        
        eventoDao.addEvento(evento, evCiu);

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
