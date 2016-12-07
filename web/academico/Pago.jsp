<%-- 
    Document   : Pago
    Created on : 03/12/2016, 12:51:35 AM
    Author     : Brandukosky
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../WEB-INF/jspf/jspf_home/head_home.jspf" %>
        <title>Pagos</title>
    </head>
    <body>
        <%@include file="../WEB-INF/jspf/jspf_home/header_vertical.jspf" %>
        <%@include file="../WEB-INF/jspf/jspf_home/navbarhome.jspf" %>
      
        <div class="container">
            <h4 style="text-align: center; padding:10px;">Bienvenido al formulario de registro del</h4>
            <div id="moose" style="text-align: center; padding:1px;">
                <img src="Imagenes/bannerunion.png" alt="" style="width: 350px;height: 120px;margin-top: 0px;"/>
            </div>
            <h6 style="text-align: center; padding:5px;">Completa tus datos y se parte de esta experiencia</h6>
            <form method="post" action="a">
            <div class="row">
                    
                    <div class="input-field col s9">
                        <div class="input-field col s12 m12">
                            <i class="material-icons prefix">contacts</i>
                            <select class="icons" name="matri">
                              <option value="" disabled selected>Matricula</option>
                              <c:forEach items="${matri}" var="d">
                                  <option value="<c:out value='${d.idMatricula}'/>" ><c:out value="${d.idAlumno}"/> </option>
                              </c:forEach>
                            </select>
                        </div>
                    </div>
                
                    <div class="input-field col s9">
                        <div class="input-field col s12 m12">
                            <i class="material-icons prefix">recent_actors</i>
                            <select class="icons" name="estado">
                              <option value="" disabled selected>Estado</option>
                              <c:forEach items="${estado}" var="e">
                                  <option value="<c:out value='${e.idEstado}'/>" ><c:out value="${e.tipoestado}"/> </option>
                              </c:forEach>
                            </select>
                        </div>
                    </div>
                                   
                    <div class="input-field col s9">
                        <i class="material-icons prefix">offline_pin</i>
                        <input id="Nombre" type="text" name="precio" class="validate" pattern="[0-9]{1,9}" required/>
                        <input type="hidden" name="op"  value="4" class="form-control">
                        <label for="Nombre">Precio</label>
                    </div>
                
                    <div class="input-field col s9">
                        <i class="material-icons prefix">perm_contact_calendar</i>
                        <input id="Nombre" name="fecha" type="date" class="datepicker">
                        <label for="Nombre">Fecha</label>
                    </div>
                
                    <div class="row">
                        <button  style="background: #232367;margin-left: 230px;" class="btn waves-effect waves-light center" type="submit" name="action">¡REGISTRARME!
                        <i class="material-icons right" style="background: #232367">send</i>
                    </button>
                    </div>
            </div>
            </form>
        </div>

        <div class="fixed-action-btn horizontal">
            <a class="btn-floating btn-large red">
                <i class="large material-icons">clear_all
                </i>
            </a>
            <ul>
                <li><a class="btn-floating yellow darken-1" href="Home.jsp"><i class="material-icons">skip_previous</i></a></li>
            </ul>
        </div>
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/materialize.min.js" type="text/javascript"></script>
        <script src="js/Operaciones.js" type="text/javascript"></script>
        <%@include file="../WEB-INF/jspf/jspf_home/ScriptHome.jspf" %>
    </body>
</html>
