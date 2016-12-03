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
import pe.colegiounion.edu.dao.AlumnoDAO;
import pe.colegiounion.edu.dao.HorarioDAO;
import pe.colegiounion.edu.dao.MatriculaDAO;
import pe.colegiounion.edu.dao.NotasDAO;
import pe.colegiounion.edu.dao.PagoDAO;
import pe.colegiounion.edu.dao.PersonaDAO;

/**
 *
 * @author Brandukosky
 */
@WebServlet(name = "Admin", urlPatterns = {"/a"})
public class Admin extends HttpServlet {
        int op =0;
        String pagina ;
        private RequestDispatcher dispatcher;
        private PersonaDAO p = new PersonaDAO();
        private HorarioDAO h = new HorarioDAO();
        private NotasDAO n = new NotasDAO();
        private MatriculaDAO m = new MatriculaDAO();
        private PagoDAO pa = new PagoDAO();
        private AlumnoDAO al = new AlumnoDAO();

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
            out.println("<title>Servlet Admin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Admin at " + request.getContextPath() + "</h1>");
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
     //  processRequest(request, response);
        op = Integer.parseInt(request.getParameter("op"));
        switch (op) {
            case 0:
                pagina = "/academico/Admin.jsp";
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
            case 1:
                pagina = "/academico/RgHorario.jsp";
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
            case 2:
                pagina = "/academico/Notas.jsp";
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
            case 3:
                pagina = "/academico/Matricula.jsp";
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
            case 4:
                pagina = "/academico/Pago.jsp";
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
            case 5: 
                pagina ="/academico/Alumno.jsp";
                request.setAttribute("lista", al.listarAl());
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
            case 6:
                pagina = "/academico/Profesores.jsp";
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
            case 7:
                pagina = "/academico/RgCursos.jsp";
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
       // processRequest(request, response);
        
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