<%-- 
    Document   : ListHorario
    Created on : 05/12/2016, 08:36:07 AM
    Author     : Brandukosky
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../WEB-INF/jspf/jspf_home/head_home.jspf" %>
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="../WEB-INF/jspf/jspf_home/header_vertical.jspf" %>
        <%@include file="../WEB-INF/jspf/jspf_home/navbarhome.jspf" %>
        <div class="row">
            <article class="col s12">
                <h2>Lista Horario</h2>
                <a href="<%= request.getContextPath()%>/a?op=7" role="button" class="btn-floating btn-flat waves-effect waves-light red"><i class="material-icons">add</i></a>
                        <div class="full-width center-align" style="margin: 40px 0;">
                            <table class="striped col s10">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>HORA_INICIO</th>
                                        <th>HORA_FIN</th>
                                        <th>ESTADO</th>
                                    </tr>
                                </thead>

                                <tbody>
                                <c:forEach items="${hor}" var="datos">                

                                    <tr>
                                        <td><c:out value="${datos.idHorario}"/></td>
                                        <td><c:out value="${datos.hora_inicio}"/></td>
                                        <td><c:out value="${datos.hora_fin}"/></td>
                                        <td><c:out value="${datos.estado}"/></td>
                                        <td><a href="a?op=9&id=<c:out value="${datos.idHorario}"/>" class="waves-effect waves-light btn-flat"><i class="material-icons">mode_edit</i></a>
                                            <a href="a?op=8&id=<c:out value="${datos.idHorario}"/>" class="waves-effect waves-light btn-flat"><i class="material-icons">close </i></a></td>
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
            </article>
        </div>
    </body>
</html>
