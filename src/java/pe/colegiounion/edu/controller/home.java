/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.colegiounion.edu.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pe.colegiounion.edu.dao.PersonaDAO;

/**
 *
 * @author Brandukosky
 */
@WebServlet(name = "home", urlPatterns = {"/h"})
public class home extends HttpServlet {
    private int op;
    String pagina;
    private RequestDispatcher dispatcher ;
    private PersonaDAO ao = new PersonaDAO();
    

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
        //    processRequest(request, response);
        
        
        
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
    
        op = Integer.parseInt(request.getParameter("op"));
        switch (op){
            case 0 : 
                pagina = "/index.jsp";
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
            case 1: 
                pagina = "/academico/login.jsp";
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
            case 2: 
                pagina = "/Inicial.jsp";
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
            
            case 3:
                pagina = "/Primaria.jsp";
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
            case 4:
                pagina = "/Secundaria.jsp";
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
            case 5:
                pagina = "/Contactenos.jsp";
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
        }
    
    
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
        //processRequest(request, response);
    op = Integer.parseInt(request.getParameter("op"));
    switch (op){
        case 1: 
            pagina = "/academico/Admin.jsp";
            dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
            break;
       case 2:
           
           PersonaDAO op = new PersonaDAO();
                HttpSession sesion = request.getSession();

           if(request.getParameter("ingresa")!=null){
                String user =  request.getParameter("user");
                String pass = request.getParameter("clave");
                switch (op.validar(user, pass)){
                    case 1: 
                        sesion.setAttribute("user", user);
                        sesion.setAttribute("role", "1");
                        pagina = "/h?op=3";
                        dispatcher = getServletContext().getRequestDispatcher(pagina);
                         dispatcher.forward(request, response);
                        break; 
                    case 2: 
                        sesion.setAttribute("user", user);
                        sesion.setAttribute("role", "2");
                        pagina = "/h?op=4";
                        dispatcher = getServletContext().getRequestDispatcher(pagina);
                         dispatcher.forward(request, response);
                        break; 
                        
                    case 21: 
                        sesion.setAttribute("user", user);
                        sesion.setAttribute("role", "21");
                        pagina = "/h?op=1";
                        dispatcher = getServletContext().getRequestDispatcher(pagina);
                         dispatcher.forward(request, response);
                        break; 
                        }
           }else{
               pagina = "/h?op=5";
                        dispatcher = getServletContext().getRequestDispatcher(pagina);
                         dispatcher.forward(request, response);
                 
           }
           
           break;
       case 3 : 
           pagina = "/academico/AcademicoAlumno/Alumno_H.jsp";
            dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
            break;
        case 4 : 
           pagina = "/academico/AcademicoProfesor/profesor_H.jsp";
            dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
            break;
            
        case 5: 
           pagina = "/academico/login.jsp";
            dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
            break;
    }
    
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
