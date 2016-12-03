<%-- 
    Document   : Proyeccion
    Created on : 25/11/2016, 03:28:03 PM
    Author     : Brandukosky
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../WEB-INF/jspf/jspf_home/head_home.jspf" %>
        <title>Alumno</title>
    </head>
    <body>
        
        <%@include file="../WEB-INF/jspf/jspf_home/header_vertical.jspf" %>
        <%@include file="../WEB-INF/jspf/jspf_home/navbarhome.jspf" %>
        
            
                <div class="row">
                    <article class="col s12">
                        <h2>Lista de Alumnos</h2>  
                        <a href="<%= request.getContextPath()%>/h?op=2" role="button" class="btn-floating btn-flat waves-effect waves-light red"><i class="material-icons">add</i></a>
                        <div class="full-width center-align" style="margin: 40px 0;">
                            <table class="striped col s12">
                                <thead>
                                    <tr>
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
                                <c:forEach items="${lista}" var="datos">                

                                    <tr>
                                        <td><c:out value="${datos.nombre}"/></td>
                                        <td><c:out value="${datos.apellido}"/></td>
                                        <td><c:out value="${datos.dni}"/></td>
                                        <td><c:out value="${datos.sexo}"/></td>
                                        <td><c:out value="${datos.celular}"/></td>
                                        <td><c:out value="${datos.edad}"/></td>
                                        <td><c:out value="${datos.correo}"/></td>
                                        <td><c:out value="${datos.direccion}"/></td>
                                        <td><c:out value="${datos.user}"/></td>
                                        <td><c:out value="${datos.pass}"/></td>
                                        <td><c:out value="${datos.codigo}"/></td>

                                        <td><a class="waves-effect waves-light btn-flat"><i class="material-icons">mode_edit</i></a>
                                            <a class="waves-effect waves-light btn-flat"><i class="material-icons">close </i></a></td>

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
