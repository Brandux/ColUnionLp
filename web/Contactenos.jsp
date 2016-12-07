<%-- 
    Document   : Contactenos
    Created on : 04/11/2016, 10:47:59 PM
    Author     : Brandukosky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/jspf/head.jspf" %>
        <!-- estilos especiales para el Mapa-->
        <link href="css/estilos_1.css" rel="stylesheet" type="text/css"/>
        <script src="js/mapa.js" type="text/javascript"></script>
        <script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false"> </script>
        <!-- -->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Colegio Unión</title>
    </head>
    <body id="bodygrande">
        
        <%@include file="WEB-INF/jspf/header.jspf" %>
        
        <div id="todo" class="container" style=" width: 50%; height: 50%; margin:50px; float:left; 
             border: 1px solid black;background-color: rgba(255,255,255,.87);border-radius: 20px 20px 20px 20px">
            <h4 style="text-align: center; padding:30px;">Contactanos</h4>
               
            <form class="col s12" style="padding: 30px;">
                <div class="row">

                    <div class="input-field col s6">
                        <i class="material-icons prefix">account_circle</i>
                        <input id="Nombre" type="text" class="validate" pattern="[a-z]" required/>
                        <label for="Nombre">Nombres</label>
                    </div>
                    <div class="input-field col s6">
                        <i class="material-icons prefix">star</i>
                        <input id="Apellido" type="tel" class="validate" pattern="[a-z]{9}" required/>
                        <label for="Apellido">Apellido</label>
                    </div>
                </div>
                
                <div class="row">
                    <form class="col s12">
                        <div class="row">
                            <div class="input-field col s12">
                                <i class="material-icons prefix">chat</i>
                                <input id="email" type="email" class="validate" >
                                <label for="email" data-error="wrong" data-success="right">Email</label>
                            </div>
                           
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <i class="material-icons prefix">store</i>
                                <textarea id="comentario" class="materialize-textarea"></textarea>
                                <label for="Direccion">Comentario</label>
                            </div>  
                        </div>
                    </form>
                    <button  class="btn waves-effect waves-light center" type="button" name="action" style="background: #232367">Enviar
                        <i class="material-icons right">send</i>
                    </button>
                </div>

            </form>


        </div >
        <!--<div id="todo" class="container col s4" style=" width: 40%; height: 50%; 
              margin-left: 1%; display: block; margin-top: 50px; float:left; 
             border: 1px solid black;background: white;border-radius: 20px 20px 20px 20px"> 
        
        
        <div id="map">-->
        <iframe style="margin-top: 100px;" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3902.803570100541!2d-76.8416216856188!3d-11.988089744074719!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9105c2628dba8a63%3A0xf792d124c9bd5580!2zQ29sZWdpbyBVbmnDs24gZGUgw5Fhw7Fh!5e0!3m2!1ses!2ses!4v1480968180421" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
        </div>
            
            <div class="fixed-action-btn horizontal">
                <a class="btn-floating btn-large red">
                    <i class="large material-icons">clear_all
                    </i>
                </a>
                <ul>
                    <li><a class="btn-floating red" href="Contactenos.jsp"><i class="material-icons">replay</i></a></li>
                    <li><a class="btn-floating yellow darken-1" href="h?op=0"><i class="material-icons">skip_previous</i></a></li>
                </ul>
            </div>
        
            <%@include file="WEB-INF/jspf/Scripts.jspf" %>
    </body>
</html>
