<%-- 
    Document   : Admin
    Created on : 25/11/2016, 3:28:17 AM
    Author     : Brandukosky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../WEB-INF/jspf/jspf_home/head_home.jspf" %>
        <title>Administración</title>
    </head>
    <body>
        <%@include file="../WEB-INF/jspf/jspf_home/header_vertical.jspf" %>
        <%@include file="../WEB-INF/jspf/jspf_home/navbarhome.jspf" %>
        <!-- panel principal-->
            <div class="container">
                <div class="row">
                    <article class="col s12">
                        <div class="full-width center-align" style="margin: 40px 0;">
                           
                            <br><br><br>
                            <div class="row">
                                <div class="col s4">
                                    <div class="card">
                                        <div class="card-image">
                                            <img src="../Imagenes/user.png">
                                            <span class="card-title black-text ">Alumnos</span>
                                        </div>
                                        <div class="card-action">
                                            <a href="h?op=1">Registrar</a>
                                        </div>
                                        <div class="card-action">
                                            <a href="#">Listar</a>
                                        </div>

                                    </div>
                                </div>
                                
                                <div class="col s4">
                                    <div class="card">
                                        <div class="card-image">
                                            <img src="../Imagenes/icoprofesor.png">
                                            <span class="card-title black-text">Profesores</span>
                                        </div>
                                        
                                        <div class="card-action">
                                            <a href="Profesores.jsp">Registrar</a>
                                        </div>
                                        <div class="card-action">
                                            <a href="#">Asignar Curso</a>
                                        </div>
                                    </div>
                                </div>
                                
                                <div class="col s4">
                                    <div class="card">
                                        <div class="card-image">
                                            <img src="../Imagenes/iconAdmin.jpg">
                                            <span class="card-title black-text">Personal Administrativo</span>
                                        </div>
                                        <div class="card-action">
                                            <a href="#">Registrar</a>
                                        </div>
                                        <div class="card-action">
                                            <a href="#">Listar</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                       
                    </article>
                </div>
            </div>

            <!-- boton flotante-->

            <div class="fixed-action-btn horizontal">
                <a class="btn-floating btn-large red">
                    <i class="large material-icons">clear_all
                    </i>
                </a>
                <ul>
                    <li><a class="btn-floating yellow darken-1" href="Home.jsp"><i class="material-icons">skip_previous</i></a></li>
                </ul>
            </div>
            <%@include file="../WEB-INF/jspf/jspf_home/ScriptHome.jspf" %>
    </body>
</html>
