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
import pe.colegiounion.edu.dao.CursoDAO;
import pe.colegiounion.edu.dao.EstadoDAO;
import pe.colegiounion.edu.dao.GradoDAO;
import pe.colegiounion.edu.dao.Grado_cursoDAO;
import pe.colegiounion.edu.dao.HorarioDAO;
import pe.colegiounion.edu.dao.MatriculaDAO;
import pe.colegiounion.edu.dao.NotasDAO;
import pe.colegiounion.edu.dao.PagoDAO;
import pe.colegiounion.edu.dao.PersonaDAO;
import pe.colegiounion.edu.dao.ProfesorDAO;
import pe.colegiounion.edu.dao.RolesDAO;
import pe.colegiounion.edu.model.Grado_CursoDTO;
import pe.colegiounion.edu.model.MatriculaDTO;
import pe.colegiounion.edu.model.PagoDTO;
import pe.colegiounion.edu.model.PersonaDTO;

/**
 *
 * @author Brandukosky
 */
@WebServlet(name = "Admin", urlPatterns = {"/a"})
public class Admin extends HttpServlet {
        int op =0;
        String pagina ;
        private RequestDispatcher dispatcher;
        private Grado_cursoDAO gc = new Grado_cursoDAO();
        private EstadoDAO e = new EstadoDAO();
        private PersonaDAO p = new PersonaDAO();
        private HorarioDAO h = new HorarioDAO();
        private NotasDAO n = new NotasDAO();
        private MatriculaDAO m = new MatriculaDAO();
        private PagoDAO pa = new PagoDAO();
        private AlumnoDAO al = new AlumnoDAO();
        private ProfesorDAO pf = new ProfesorDAO();
        private RolesDAO ro = new RolesDAO();
        private GradoDAO go = new GradoDAO();
        private CursoDAO co = new CursoDAO();
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
                request.setAttribute("lista", n.listar());
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
            case 3:
                pagina = "/academico/Matricula.jsp";
                request.setAttribute("grado",go.listar() );
                request.setAttribute("estado", e.listar());
                request.setAttribute("al",al.listarAl());
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
            case 4:
                pagina = "/academico/Pago.jsp";
                request.setAttribute("matri", m.listar());
                request.setAttribute("estado", e.listar());
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
            case 5: 
                pagina ="/academico/Alumno.jsp";
                request.setAttribute("lista", al.listarAl());
                request.setAttribute("ali", al.listar());
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
            case 6:
                pagina = "/academico/Profesores.jsp";
                request.setAttribute("Lista", pf.listarPf());
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
            case 7:
                pagina = "/academico/FormCurso.jsp";
                request.setAttribute("profe", pf.listarPf());
                request.setAttribute("grado",go.listar() );
                request.setAttribute("curso", co.listar());
                request.setAttribute("hora", h.listar());
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
                //datos para eliminar datos de alumno
            case 8 :
                int d1 = Integer.parseInt(request.getParameter("id"));
                pagina = "/a?op=5";
                if (p.delete(d1) > 0) {
                    pagina = "/a?op=5";
                } else {
                    pagina = "/a?op=5";
                }
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
            case 9:
                int d = Integer.parseInt(request.getParameter("id"));
                pagina = "/vista/Update.jsp";
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
                //casos para eliminar datos de profesores
            case 10 : 
                int d2 = Integer.parseInt(request.getParameter("id"));
                pagina = "/a?op=5";
                if (p.delete(d2) > 0) {
                    pagina = "/a?op=5";
                } else {
                    pagina = "/a?op=5";
                }
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
             case 11:
                int d3 = Integer.parseInt(request.getParameter("id"));
                pagina = "/vista/Update.jsp";
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
                 
                 //adaministrativo
             case 12: 
                 pagina = "/academico/Personal.jsp";
                 request.setAttribute("lista", p.listarDir());
                 request.setAttribute("Secre", p.listarSec());
                 request.setAttribute("Lin", p.listarLim());
                 dispatcher = getServletContext().getRequestDispatcher(pagina);
                 dispatcher.forward(request, response);
                 break;
             case 13 :
                 int dire = Integer.parseInt(request.getParameter("id"));
                pagina = "/a?op=12";
                if (p.delete(dire) > 0) {
                    pagina = "/a?op=12";
                } else {
                    pagina = "/a?op=12";
                }
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
             case 14:
                 //aqui ira el upadte de director
                 break;
                 
                 //para secretaria
             case 15:
                 int Secre = Integer.parseInt(request.getParameter("id"));
                pagina = "/a?op=5";
                if (p.delete(Secre) > 0) {
                    pagina = "/a?op=5";
                } else {
                    pagina = "/a?op=5";
                }
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
             case 16:
                 // aqui ira el update
                 break;
                 
                 //Para Limpiera 
             case 17 :
                 int lim = Integer.parseInt(request.getParameter("id"));
                 pagina = "/a?op=5";
                 if (p.delete(lim) > 0) {
                     pagina = "/a?op=5";
                 } else {
                     pagina = "/a?op=5";
                 }
                 dispatcher = getServletContext().getRequestDispatcher(pagina);
                 dispatcher.forward(request, response);
                 break;
             case 18:
                 //aqui ira el update para editar  limpieza
                 break;
             case 19:
                 pagina = "/academico/ListHorario.jsp";
                 request.setAttribute("hor", h.listar());
                 dispatcher = getServletContext().getRequestDispatcher(pagina);
                 dispatcher.forward(request, response);
                break;
             case 20:
                 //aqui va RegPersona 
                pagina = "/academico/RegPersona.jsp";
                request.setAttribute("rol", ro.listar());
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
             case 21:    
                 //aqui va ListPago
                 pagina = "/academico/ListPago.jsp";
                 request.setAttribute("pag", pa.listar());
                 request.setAttribute("pag", pa.listar());
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
        op = Integer.parseInt(request.getParameter("op"));
        switch (op) {
            case 0:
                pagina = "/academico/Admin.jsp";
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
            case 1 :
              int rol = Integer.parseInt(request.getParameter("roles"));
              
              String name = request.getParameter("nane");
              String apell = request.getParameter("apell");
              String dni = request.getParameter("dni");
              String sex = request.getParameter("Sexo");
              String celu = request.getParameter("cel");
              String edad = request.getParameter("edad");
              String email = request.getParameter("email");
              String dire = request.getParameter("direc");
              String usu = request.getParameter("usu");
              String pass = request.getParameter("pass");
              String cod = request.getParameter("cod");
              PersonaDTO pe = new PersonaDTO(rol, name, apell, dni, sex, celu, edad,email, dire, usu, pass, cod);
                if (p.create(pe)>0) {
                    pagina ="/a?op=0";
                }else{
                    pagina = "/h?op=0";
                }
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
              break;
            case 2: 
                int prof = Integer.parseInt(request.getParameter("profesores"));
                int grado =Integer.parseInt(request.getParameter("grado"));
                int curso =Integer.parseInt(request.getParameter("curso"));
                int hora =Integer.parseInt(request.getParameter("hora"));
                Grado_CursoDTO g = new Grado_CursoDTO(prof, hora, grado, curso);
                if (gc.create(g)>0) {
                    pagina = "/a?op=0";
                }else{
                    pagina ="/h?op=0";
                }
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
            case 3:
                int gra = Integer.parseInt(request.getParameter("grado"));
                int estado = Integer.parseInt(request.getParameter("estado"));
                int alum = Integer.parseInt(request.getParameter("alumno"));
                String fecha = request.getParameter("fecha");
                MatriculaDTO ma = new MatriculaDTO(gra, estado, alum, fecha);
                if (m.create(ma)>0){
                    pagina = "/a?op=0";
                }else{
                    pagina ="/h?op=0";
                }
                 dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
                break;
                
            case 4 : 
                int matri = Integer.parseInt(request.getParameter("matri"));
                int estdo = Integer.parseInt(request.getParameter("estado"));
                double precio = Double.parseDouble(request.getParameter("precio"));
                String fec =  request.getParameter("fecha");
                PagoDTO pag = new PagoDTO(matri, estdo, precio,fec);
                if(pa.create(pag)>0){
                     pagina = "/a?op=0";
                }else{
                     pagina = "/h?op=0";
                }
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
