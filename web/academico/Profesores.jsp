<%-- 
    Document   : Profesores
    Created on : 11/11/2016, 12:34:41 PM
    Author     : Brandukosky
--%>

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

        
        <div class="container">
                <div class="row">
                    <article class="col s12">
                         <h2>Lista de Profesores</h2>  
                        <a class="btn-floating btn-flat waves-effect waves-light red"><i class="material-icons">add</i></a>
                        <div class="full-width center-align" style="margin: 40px 0;">


                            <table class="striped col s12">
                                <thead>
                                    <tr>
                                        <th data-field="nom">Nombre</th>
                                        <th data-field="apellido">Apellido</th>
                                        <th data-field="dni">DNI</th>
                                        <th data-field="sexo">Sexo</th>
                                        <th data-field="cel">Celular</th>
                                        <th data-field="edad">Edad</th>
                                        <th data-field="correo">Correo</th>
                                        <th data-field="direc">Dirección</th>
                                        <th data-field="oper">Opciones</th>
                                    </tr>
                                </thead>

                                <tbody>
                                    <tr>
                                        <td>Brandux</td>
                                        <td>Juarez</td>
                                        <td>72370779</td>
                                        <td>M</td>
                                        <td>931858464</td>
                                        <td>17</td>
                                        <td>branduxjuarez@upeu.edu.pe</td>
                                        <td>Alameda Ñaña</td>
                                        <td><a class="waves-effect waves-light btn-flat"><i class="material-icons">mode_edit
                                                </i></a><a class="waves-effect waves-light btn-flat"><i class="material-icons">close    
                                                </i></a></td>
                                    </tr>
                                    <tr>
                                        <td>Alan</td>
                                        <td>Jellybean</td>
                                        <td>$3.76</td>
                                    </tr>
                                    <tr>
                                        <td>Jonathan</td>
                                        <td>Lollipop</td>
                                        <td>$7.00</td>
                                    </tr>
                                </tbody>
                            </table>    

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
                <li><a class="btn-floating yellow darken-1" href="#"><i class="material-icons">skip_previous</i></a></li>
            </ul>
        </div>
        
        <%@include file="../WEB-INF/jspf/jspf_home/ScriptHome.jspf" %>
        
    </body>
</html>
