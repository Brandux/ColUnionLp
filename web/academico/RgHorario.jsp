<%-- 
    Document   : RgHorario
    Created on : 03/12/2016, 12:49:53 AM
    Author     : Brandukosky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <%@include file="../WEB-INF/jspf/jspf_home/head_home.jspf" %>
            <title>Horarios</title>
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
            <div class="row">
                    
                    <div class="input-field col s11">
                        <div class="input-field col s12 m12">
                            <i class="material-icons prefix">contacts</i>
                            <select class="icons">
                              <option value="" disabled selected>Profesor</option>
                              <option value="" data-icon="Imagenes/banner1.png" class="left circle">Alumno</option>
                              <option value="" data-icon="Imagenes/banner4.png" class="left circle">Docente</option>
                              <option value="" data-icon="Imagenes/banner3.png" class="left circle">Personal Administrativo</option>
                            </select>
                        </div>
                    </div>
                
                    <div class="input-field col s11">
                        <div class="input-field col s12 m12">
                            <i class="material-icons prefix">recent_actors</i>
                            <select class="icons">
                              <option value="" disabled selected>Grado</option>
                              <option value="" data-icon="Imagenes/banner1.png" class="left circle">Alumno</option>
                              <option value="" data-icon="Imagenes/banner4.png" class="left circle">Docente</option>
                              <option value="" data-icon="Imagenes/banner3.png" class="left circle">Personal Administrativo</option>
                            </select>
                        </div>
                    </div>

                    <div class="input-field col s11">
                        <div class="input-field col s12 m12">
                            <i class="material-icons prefix">assignment_ind</i>
                            <select class="icons">
                              <option value="" disabled selected>Curso</option>
                              <option value="" data-icon="Imagenes/banner1.png" class="left circle">Alumno</option>
                              <option value="" data-icon="Imagenes/banner4.png" class="left circle">Docente</option>
                              <option value="" data-icon="Imagenes/banner3.png" class="left circle">Personal Administrativo</option>
                            </select>
                        </div>
                    </div>

                    <div class="input-field col s11">
                        <div class="input-field col s12 m12">
                            <i class="material-icons prefix">work</i>
                            <select class="icons">
                              <option value="" disabled selected>Horario</option>
                              <option value="" data-icon="Imagenes/banner1.png" class="left circle">Alumno</option>
                              <option value="" data-icon="Imagenes/banner4.png" class="left circle">Docente</option>
                              <option value="" data-icon="Imagenes/banner3.png" class="left circle">Personal Administrativo</option>
                            </select>
                        </div>
                    </div>
            </div>
            
            <div class="row">
                    <button  style="background: #232367;margin-left: 230px;" class="btn waves-effect waves-light center" type="button" name="action">¡REGISTRARME!
                        <i class="material-icons right" style="background: #232367">send</i>
                    </button>
                </div>
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
