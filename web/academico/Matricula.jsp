<%-- 
    Document   : Matricula
    Created on : 25/11/2016, 03:47:30 PM
    Author     : Brandukosky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
         <%@include file="../WEB-INF/jspf/jspf_home/head_home.jspf" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Matriculas</title>
    </head>
    <body>
        <%@include file="../WEB-INF/jspf/jspf_home/header_vertical.jspf" %>
        <%@include file="../WEB-INF/jspf/jspf_home/navbarhome.jspf" %>

        <div class="container">
            <div class="row">
                <article class="col s12">
                    <div class="full-width center-align" style="margin: 40px 0;">
                        <h1>Bienvenidos..!!</h1>

                    </div>
                    <div class="parallax-container">
                        <div class="parallax"><img src="Imagenes/Paralaxhome.jpg"></div>
                    </div>
                </article>
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
        
        <%@include file="../WEB-INF/jspf/jspf_home/ScriptHome.jspf" %>
    </body>
</html>
