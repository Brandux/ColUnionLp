<%-- 
    Document   : Profesores
    Created on : 11/11/2016, 12:34:41 PM
    Author     : Brandukosky
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../WEB-INF/jspf/jspf_home/head_home.jspf" %>
        <title>Profesor</title>
    </head>
    <body>
        <%@include file="../WEB-INF/jspf/jspf_home/header_vertical.jspf" %>
        <%@include file="../WEB-INF/jspf/jspf_home/navbarhome.jspf" %>
                <div class="row">
                    <article class="col s12">
                         <h2>Lista de Profesores</h2>  
                        <a href="<%= request.getContextPath()%>/a?op=20" role="button" class="btn-floating btn-flat waves-effect waves-light red"><i class="material-icons">add</i></a>
                        <div class="full-width center-align" style="margin: 40px 0;">
                            <table class="striped col s12">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Nombre</th>
                                        <th>Apellido</th>
                                        <th>DNI</th>
                                        <th>Sexo</th>
                                        <th>Celular</th>
                                        <th>Edad</th>
                                        <th>Correo</th>
                                        <th>Dirección</th>
                                        <th>Usuarios</th>
                                        <th>Contraseñas</th>
                                        <th>Código</th>
                                        <th colspan="2">Opciones</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${Lista}" var="datos">
                                    <tr>
                                        <th><c:out value="${datos.idPersona}" /></th>
                                        <th><c:out value="${datos.nombre}"/></th>
                                        <th><c:out value="${datos.apellido}"/></th>
                                        <th><c:out value="${datos.dni}"/></th>
                                        <th><c:out value="${datos.sexo}"/></th>
                                        <th><c:out value="${datos.celular}"/></th>
                                        <th><c:out value="${datos.edad}"/></th>
                                        <th><c:out value="${datos.correo}"/></th>
                                        <th><c:out value="${datos.direccion}"/></th>
                                        <th><c:out value="${datos.user}"/></th>
                                        <th><c:out value="${datos.pass}"/></th>
                                        <th><c:out value="${datos.codigo}"/></th>
                                        <td><a href="a?op=11&id=<c:out value="${datos.idPersona}"/>" class="waves-effect waves-light btn-flat"><i class="material-icons">mode_edit</i></a>
                                            <a href="a?op=10&id=<c:out value="${datos.idPersona}"/>" class="waves-effect waves-light btn-flat"><i class="material-icons">close </i></a></td>
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
                <li><a class="btn-floating yellow darken-1" href="#"><i class="material-icons">skip_previous</i></a></li>
            </ul>
        </div>
        <%@include file="../WEB-INF/jspf/jspf_home/ScriptHome.jspf" %>
    </body>
</html>
