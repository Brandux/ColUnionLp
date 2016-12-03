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
            <div class="row">
                <article class="col s12">
                    <div class="full-width center-align" style="margin: 40px 0;">
                        <h1>Aqui ira un formulario para loos horarios</h1>

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
