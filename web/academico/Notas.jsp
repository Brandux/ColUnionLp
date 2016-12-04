<%-- 
    Document   : Notas
    Created on : 03/12/2016, 12:51:09 AM
    Author     : Brandukosky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../WEB-INF/jspf/jspf_home/head_home.jspf" %>
        <title>Notas</title>
    </head>
    <body>
        <%@include file="../WEB-INF/jspf/jspf_home/header_vertical.jspf" %>
        <%@include file="../WEB-INF/jspf/jspf_home/navbarhome.jspf" %>
        
            <div class="row">
                <article class="col s12">
                    <br>
                    <h2 style="text-align: center;">Notas del Alumno</h2>  
                    <a href="<%= request.getContextPath()%>/h?op=2" role="button" class="btn-floating btn-flat waves-effect waves-light red"><i class="material-icons">add</i></a>
                    <div class="full-width center-align" style="margin: 40px 0;">
                        <table class="striped col s12">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th >Grado Curso</th>
                                    <th >Alumno</th>
                                    <th>Primer Bimestre</th>
                                    <th>Segundo Bimestre</th>
                                    <th>Tercer Bimestre</th>
                                    <th>Escuela de Padres</th>
                                    <th>Promedio General</th>
                                    <th>Estado</th>
                                    <th colspan="2">Opciones</th>
                                </tr>
                            </thead>

                            <tbody>
                            <c:forEach items="${lista}" var="des">                
                                <tr>
                                <td><c:out value="${des.idNotas}"/></td>
                                <td><c:out value="${des.idGradocurso}"/></td>
                                <td><c:out value="${des.idAlumno}"/></td>
                                <td><c:out value="${des.nota01}"/></td>
                                <td><c:out value="${des.nota02}"/></td>
                                <td><c:out value="${des.nota03}"/></td>
                                <td><c:out value="${des.nota04}"/></td>
                                <td><c:out value="${des.promedio}"/></td>
                                <td><c:out value="${des.estado}"/></td>
                                <td><a href="a?op=18&id=<c:out value='${datos.idPersona}'/>" class="waves-effect waves-light btn-flat"><i class="material-icons">mode_edit</i></a>
                                    <a href="a?op=17&id=<c:out value='${datos.idPersona}'/>" class="waves-effect waves-light btn-flat"><i class="material-icons">close </i></a></td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>    
                    </div>
                </article>
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
