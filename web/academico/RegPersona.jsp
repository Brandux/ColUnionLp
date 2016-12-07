<%-- 
    Document   : RePerson
    Created on : 04/12/2016, 10:48:21 AM
    Author     : Notebook-
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../WEB-INF/jspf/jspf_home/head_home.jspf" %>
        <title>Registro de Personal</title>
    </head>
    <body>
        <%@include file="../WEB-INF/jspf/jspf_home/header_vertical.jspf" %>
        <%@include file="../WEB-INF/jspf/jspf_home/navbarhome.jspf" %>
        <div id="todo" class="container" style=" width: 80%; height: 100%; margin:50px; background-color: rgba(255,255,255,.87);margin-left: 150px;">
            <h4 style="text-align: center; padding:10px;">Bienvenido al formulario de registro del</h4>
            <div id="moose" style="text-align: center; padding:1px;">
                <img src="../Imagenes/bannerunion.png" alt="" style="width: 350px;height: 120px;margin-top: 0px;"/>
            </div>
            <h6 style="text-align: center; padding:5px;">Completa tus datos y se parte de esta experiencia</h6>
            <form class="col s12" style="padding: 30px;" method="post" action="a" >
               <%-- FALTA EL CONBOBOX--%>
               
                <div class="row">
                    
                    <div class="input-field col s11">
                        <div class="input-field col s12 m12">
                            <i class="material-icons prefix">accessibility</i>
                            <select class="icons" name ="roles">
                                <option value="" disabled selected>Rol</option>
                                <c:forEach items="${rol}" var="rol">
                                    <option value="<c:out value="${rol.idRoles}"/>" ><c:out value="${rol.descripcion}"/></option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    

                    <div class="input-field col s6">
                        <i class="material-icons prefix">supervisor_account</i>
                        <input id="Nombre" name="nane" type="text" class="validate" pattern="[A-Za-z0]{5,30}" required/>
                        <label for="Nombre">Nombres</label>
                    </div>
                    <div class="input-field col s6">
                        <i class="material-icons prefix">person_add</i>
                        <input id="Apellido" name="apell" type="tel" class="validate" pattern="[A-Za-z0]{5,30}" required/>
                        <input type="hidden" name="op" value="1" class="form-control">
                        <label for="Apellido">Apellido</label>
                    </div>

                     <div class="input-field col s6">
                        <i class="material-icons prefix">account_circle</i>
                        <input id="Usuario" name="usu" type="text" class="validate" pattern="[A-Za-z0]{5,10}" required/>
                        <label for="Usuario">Usuario</label>
                    </div>
                    <div class="input-field col s6">
                        <i class="material-icons prefix">vpn_key</i>
                        <input id="Password" name="pass" type="password" class="validate" pattern="{1-9}" required/>
                        <label for="Password">Password</label>
                    </div>

                    <div class="input-field col s4">
                        <i class="material-icons prefix">compare_arrows</i>
                         <!--<input id="DNI" name="Sexo" type="text" class="validate">
                        <label for="DNI">sexo</label>-->
                       <select name="Sexo">
                            <option  value="C" disabled selected>Sexo</option>
                            <option value="M">M</option>
                            <option value="F">F</option>
                        </select>
                    </div>
                    <div class="input-field col s4">
                        <i class="material-icons prefix">subtitles</i>
                        <input id="DNI" name="dni" type="text" class="validate" pattern="[0-8]{8}" required/>
                        <label for="DNI">DNI</label>
                    </div>
                    <div class="input-field col s4">
                        <i class="material-icons prefix">subtitles</i>
                        <input id="dni" name="cod" type="text" class="validate" pattern="{9}" required/>
                        <label for="Codigo">Codigo</label>
                    </div>
               
                    <div class="input-field col s6">
                        <i class="material-icons prefix">phone</i>
                        <input id="Celular" name="cel" type="text" class="validate" pattern="[0-9]{9}" required/>
                        <label for="Celelar">Celular</label>
                    </div>
                    <div class="input-field col s6">
                        <i class="material-icons prefix">exposure</i>
                        <input id="Edad" name="edad" type="text" class="validate" pattern="[0-9]{1,2}" required/>
                        <label for="Edad">Edad</label>
                    </div>
                    
                            <div class="input-field col s6">
                                <i class="material-icons prefix">chat</i>
                                <input id="email" name="email" type="email" class="validate" >
                                <label for="email" data-error="wrong" data-success="right">Email</label>
                            </div>
                            <div class="input-field col s6">
                                <i class="material-icons prefix">store</i>
                                <input id="Direccion" name="direc" type="text" class="validate">
                                <label for="Direccion">Dirección</label>
                            </div>
                        
                
                    <button  style="background: #232367;margin-left: 230px;" class="btn waves-effect waves-light center" type="submit">¡REGISTRARME!
                        <i class="material-icons right" style="background: #232367">send</i>
                    </button>
                </div>
                   </form>
        </div>
             <div class="fixed-action-btn horizontal">
            <a class="btn-floating btn-large red">
                <i class="large material-icons">clear_all
                </i>
            </a>
            <ul>
                <li><a class="btn-floating red" href="CrearCuenta.jsp"><i class="material-icons">replay</i></a></li>
                <li><a class="btn-floating yellow darken-1" href="Index.jsp"><i class="material-icons">skip_previous</i></a></li>
            </ul>
        </div>
               <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/materialize.min.js" type="text/javascript"></script>
        <script src="js/Operaciones.js" type="text/javascript"></script>
        <%@include file="../WEB-INF/jspf/jspf_home/ScriptHome.jspf" %>
    </body>
</html>
