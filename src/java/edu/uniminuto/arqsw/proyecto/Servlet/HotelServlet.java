/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniminuto.arqsw.proyecto.Servlet;

import edu.uniminuto.arqsw.proyecto.DAO.CategoriaDAO;
import edu.uniminuto.arqsw.proyecto.DAO.CiudadDAO;
import edu.uniminuto.arqsw.proyecto.DAO.HotelDAO;
import edu.uniminuto.arqsw.proyecto.DAO.UsuarioDAO;
import edu.uniminuto.arqsw.proyecto.Hibernate.Categoria;
import edu.uniminuto.arqsw.proyecto.Hibernate.Ciudad;
import edu.uniminuto.arqsw.proyecto.Hibernate.Hotel;
import edu.uniminuto.arqsw.proyecto.Hibernate.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "HotelServlet", urlPatterns = {"/HotelServlet"})
public class HotelServlet extends HttpServlet {

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
            out.println("<title>Servlet HotelServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HotelServlet at " + request.getContextPath() + "</h1>");
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
        
        
        String nombre = request.getParameter("nombre").toUpperCase();
        int categoriaId = Integer.parseInt(request.getParameter("categoria"));
        int ciudadId = Integer.parseInt(request.getParameter("ciudad"));
        
        
        UsuarioDAO userDao = new UsuarioDAO();
        Usuario usuario = userDao.getUserByRol("ADMIN");     
        
        CategoriaDAO catDao = new CategoriaDAO();
        Categoria categoria = catDao.getCategoriaById(categoriaId);
        
        CiudadDAO ciudadDao = new CiudadDAO();
        Ciudad ciudad = ciudadDao.getCiudadById(ciudadId);
        
        HashSet hotelCity = new HashSet();
        hotelCity.add(ciudad);
                
        Hotel hotel = new Hotel(categoria, usuario, nombre);
        hotel.setCiudads(hotelCity);
        
        HotelDAO hotelDao = new HotelDAO();
        hotelDao.addHotel(hotel);
        
        
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
