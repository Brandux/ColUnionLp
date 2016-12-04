<%-- 
    Document   : Personal
    Created on : 25/11/2016, 03:43:12 PM
    Author     : Brandukosky
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../WEB-INF/jspf/jspf_home/head_home.jspf" %>
        <title>Personal</title>
    </head>
    <body>
        <%@include file="../WEB-INF/jspf/jspf_home/header_vertical.jspf" %>
        <%@include file="../WEB-INF/jspf/jspf_home/navbarhome.jspf" %>

            <div class="row">
                <article class="col s12">
                    <br>
                    <h2 style="text-align: center;">Lista de Directores</h2>  
                    <a href="<%= request.getContextPath()%>/h?op=2" role="button" class="btn-floating btn-flat waves-effect waves-light red"><i class="material-icons">add</i></a>
                    <div class="full-width center-align" style="margin: 40px 0;">
                        <table class="striped col s12">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th >Nombre</th>
                                    <th >Apellido</th>
                                    <th >DNI</th>
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
                            <c:forEach items="${lista}" var="d">                
                                <tr>
                                    <td><c:out value="${d.idPersona}"/></td>
                                        <td><c:out value="${d.nombre}"/></td>
                                        <td><c:out value="${d.apellido}"/></td>
                                        <td><c:out value="${d.dni}"/></td>
                                        <td><c:out value="${d.sexo}"/></td>
                                        <td><c:out value="${d.celular}"/></td>
                                        <td><c:out value="${d.edad}"/></td>
                                        <td><c:out value="${d.correo}"/></td>
                                        <td><c:out value="${d.direccion}"/></td>
                                        <td><c:out value="${d.user}"/></td>
                                        <th><c:out value="${d.pass}"/></td>
                                        <td><c:out value="${d.codigo}"/></td>
                                        <td><a href="a?op=14&id=<c:out value='${datos.idPersona}'/>" class="waves-effect waves-light btn-flat"><i class="material-icons">mode_edit</i></a>
                                            <a href="a?op=13&id=<c:out value='${datos.idPersona}'/>" class="waves-effect waves-light btn-flat"><i class="material-icons">close </i></a></td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>    
                    </div>
                </article>
                    
                    <%-- tabla para Secretarias --%>
                    <article class="col s12">
                    <br>
                    <h2 style="text-align: center;">Lista de Secretarias</h2>  
                    <a href="<%= request.getContextPath()%>/h?op=2" role="button" class="btn-floating btn-flat waves-effect waves-light red"><i class="material-icons">add</i></a>
                    <div class="full-width center-align" style="margin: 40px 0;">
                        <table class="striped col s12">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th >Nombre</th>
                                    <th >Apellido</th>
                                    <th >DNI</th>
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
                            <c:forEach items="${Secre}" var="de">                
                                <tr>
                                        <td><c:out value="${de.idPersona}"/></td>
                                        <td><c:out value="${de.nombre}"/></td>
                                        <td><c:out value="${de.apellido}"/></td>
                                        <td><c:out value="${de.dni}"/></td>
                                        <td><c:out value="${de.sexo}"/></td>
                                        <td><c:out value="${de.celular}"/></td>
                                        <td><c:out value="${de.edad}"/></td>
                                        <td><c:out value="${de.correo}"/></td>
                                        <td><c:out value="${de.direccion}"/></td>
                                        <td><c:out value="${de.user}"/></td>
                                        <th><c:out value="${de.pass}"/></td>
                                        <td><c:out value="${de.codigo}"/></td>
                                        <td><a href="a?op=16&id=<c:out value='${datos.idPersona}'/>" class="waves-effect waves-light btn-flat"><i class="material-icons">mode_edit</i></a>
                                            <a href="a?op=15&id=<c:out value='${datos.idPersona}'/>" class="waves-effect waves-light btn-flat"><i class="material-icons">close </i></a></td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>    
                    </div>
                </article>
                    
                    
                    <%-- tabla para limpieza--%>
                    
                    <article class="col s12">
                        <br>
                        <h2 style="text-align: center;">Personal de Limpieza</h2>  
                        <a href="<%= request.getContextPath()%>/h?op=2" role="button" class="btn-floating btn-flat waves-effect waves-light red"><i class="material-icons">add</i></a>
                        <div class="full-width center-align" style="margin: 40px 0;">
                            <table class="striped col s12">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th >Nombre</th>
                                        <th >Apellido</th>
                                        <th >DNI</th>
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
                                    <c:forEach items="${Lin}" var="des">                
                                        <tr>
                                            <td><c:out value="${des.idPersona}"/></td>
                                            <td><c:out value="${des.nombre}"/></td>
                                            <td><c:out value="${des.apellido}"/></td>
                                            <td><c:out value="${des.dni}"/></td>
                                            <td><c:out value="${des.sexo}"/></td>
                                            <td><c:out value="${des.celular}"/></td>
                                            <td><c:out value="${des.edad}"/></td>
                                            <td><c:out value="${des.correo}"/></td>
                                            <td><c:out value="${des.direccion}"/></td>
                                            <td><c:out value="${des.user}"/></td>
                                            <th><c:out value="${des.pass}"/></td>
                                            <td><c:out value="${des.codigo}"/></td>
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
                <li><a class="btn-floating yellow darken-1" href="#"><i class="material-icons">skip_previous</i></a></li>
            </ul>
        </div>                             
                                    
        <%@include file="../WEB-INF/jspf/jspf_home/ScriptHome.jspf" %>
    </body>
</html>
