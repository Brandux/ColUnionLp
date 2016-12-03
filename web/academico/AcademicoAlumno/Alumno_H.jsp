<%-- 
    Document   : Alumno_H
    Created on : 26/11/2016, 03:04:19 PM
    Author     : Brandukosky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../WEB-INF/jspf/jspf_home/head_al.jspf" %>
        <title>Portal del Alumno </title>
        
    </head>
    <body>
        <%@include file="../../WEB-INF/jspf/jspf_home/header_Al.jspf" %>
        <%@include file="../../WEB-INF/jspf/jspf_home/navbarhome.jspf" %>
        <h1>Soy Alumno</h1>
        
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
                                        <span class="card-title black-text ">Cursos</span>
                                    </div>
                                    <div class="card-action">
                                        <a href="#">Revisar</a>
                                    </div>
                                </div>
                            </div>

                            <div class="col s4">
                                <div class="card">
                                    <div class="card-image">
                                        <img src="../Imagenes/icoprofesor.png">
                                        <span class="card-title black-text">Notar</span>
                                    </div>

                                    <div class="card-action">
                                        <a href="#">Revisar</a>
                                    </div>
                                </div>
                            </div>

                            <div class="col s4">
                                <div class="card">
                                    <div class="card-image">
                                        <img src="../Imagenes/iconAdmin.jpg">
                                        <span class="card-title black-text">Horarios</span>
                                    </div>
                                    <div class="card-action">
                                        <a href="#">Revisar</a>
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
        
       <%@include file="../../WEB-INF/jspf/jspf_home/ScriptHome.jspf" %>
    </body>
</html>
