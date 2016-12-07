<%-- 
    Document   : FormCurso
    Created on : 04/12/2016, 04:27:31 PM
    Author     : Brandukosky
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../WEB-INF/jspf/jspf_home/head_home.jspf" %>
            <title>Registrar Cursos</title>
    </head>
    <body>
        <%@include file="../WEB-INF/jspf/jspf_home/header_vertical.jspf" %>
        <%@include file="../WEB-INF/jspf/jspf_home/navbarhome.jspf" %>
        
                    <h4 style="text-align: center; padding:10px;">Bienvenido al formulario de registro del</h4>
            <div id="moose" style="text-align: center; padding:1px;">
                <img src="Imagenes/bannerunion.png" alt="" style="width: 350px;height: 120px;margin-top: 0px;"/>
            </div>
            <h6 style="text-align: center; padding:5px;">Completa tus datos y se parte de esta experiencia</h6>
            <form method="post" action="a">
            <div class="row">
              
                    <div class="input-field col s11">
                        <div class="input-field col s12 m12">
                            <i class="material-icons prefix">contacts</i>
                            <select class="icons" name="profesores">
                              <option value="" disabled selected>Profesor</option>
                              <c:forEach items="${profe}" var="pf">
                               <option value="<c:out value="${pf.idPersona}"/>"><c:out value="${pf.nombre}"/> <c:out value="${pf.apellido}"/></option>
                              </c:forEach>
                            </select>
                        </div>
                    </div>
                
                    <div class="input-field col s11">
                        <div class="input-field col s12 m12">
                            <i class="material-icons prefix">recent_actors</i>
                            <select class="icons" name="grado">
                              <option value="" disabled selected>Grado</option>
                              <c:forEach items="${grado}" var="g">
                                  <option value="<c:out value="${g.idGrado}"/>" >  <c:out value="${g.anoescolar}"/>año , Seccion: <c:out value="${g.secciones}"/></option>
                              </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="input-field col s11">
                        <div class="input-field col s12 m12">
                            <i class="material-icons prefix">assignment_ind</i>
                            <select class="icons" name="curso">
                              <option value="" disabled selected>Curso</option>
                              <c:forEach items="${curso}" var="c">
                                  <option value="<c:out value="${c.idCurso}"/>"><c:out value="${c.descripcion}"/></option>
                              </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="input-field col s11">
                        <div class="input-field col s12 m12">
                            <i class="material-icons prefix">work</i>
                            <select class="icons" name="hora">
                              <option value="" disabled selected>Horario</option>
                              <c:forEach items="${hora}" var="h">
                                  <option value="<c:out value="${h.idHorario}"/>" ><c:out value="${h.hora_inicio}"/> a <c:out value="${h.hora_fin}"/></option>
                              </c:forEach>
                            </select>
                        </div>
                    </div>
                
                    <div class="row">
                        <button  style="background: #232367;margin-left: 230px;" class="btn waves-effect waves-light center" type="submit" name="action">¡REGISTRARME!
                        <i class="material-icons right" style="background: #232367">send</i>
                        <input type="hidden" name="op" value="2" class="form-control">
                        </button>
                </div>
            </div>
            
            </form>
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/materialize.min.js" type="text/javascript"></script>
        <script src="js/Operaciones.js" type="text/javascript"></script>
        <%@include file="../WEB-INF/jspf/jspf_home/ScriptHome.jspf" %>
    </body>
</html>
