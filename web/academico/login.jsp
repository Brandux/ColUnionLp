<%-- 
    Document   : login
    Created on : 25/11/2016, 12:10:29 PM
    Author     : Brandukosky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Intranet</title>
        <%@include file="../WEB-INF/jspf/jspf_home/headLogin.jspf" %>
        <script src="../js/validarRegister.js" type="text/javascript"></script>
    </head>
    <body style="background-image: url(../Imagenes/cards.jpg); background-repeat: no-repeat; background-size: cover; background-attachment: fixed;">

    <body class="font-cover" id="login">

        <div class="container-login center-align">
            <div style="margin:15px 0;">
                <i class="zmdi zmdi-account-circle zmdi-hc-5x"></i>
                <p>Inicia sesión con tu cuenta</p>   
            </div>
            <form  method="post" action="h" id="forminicio">
                <div class="input-field">
                    <input id="user"  name="user" type="text" class="validate" id="txtuser">
                    <label for="UserName"><i class="zmdi zmdi-account"></i>&nbsp; Usuario</label>
                </div>

                <div class="input-field col s12">
                    <input id="clave" name="clave" type="password" class="validate" id="txtclave">
                    <label for="Password"><i class="zmdi zmdi-lock"></i>&nbsp; Contraseña</label>
                    <!--<input type="hidden" name="op" value="1">
                    -->
                </div>

                <button  id="btniniciar" name="boton"  class="waves-effect waves-teal btn-flat">Ingresar &nbsp; <i class="zmdi zmdi-mail-send"></i></button>

                </a>      
                
            </form>

        </div>

        <div class="fixed-action-btn horizontal">
            <a class="btn-floating btn-large red">
                <i class="large material-icons">clear_all
                </i>
            </a>
            <ul>
                <li><a class="btn-floating red" href="login.jsp"><i class="material-icons">replay</i></a></li>
                <li><a class="btn-floating yellow darken-1" href="h?op=0"><i class="material-icons">skip_previous</i></a></li>
            </ul>

        </div>
        
        
        <%@include file="../WEB-INF/jspf/jspf_home/ScriptLogin.jspf" %>
    </body>
</html>
