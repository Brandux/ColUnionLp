

window.addEventListener ('load', function (){
    document.getElementById("btniniciar").addEventListener('click', function (){
                var name = document.getElementById('txtuse').value;
                var contraseña = document.getElementById('txtclave').value;
                var bandera = false;
                
            if (name.length > 0 && contraseña.length > 0){

                        bandera = true;
                }

                if (bandera){
                document.getElemetById('forminicio').submit();
                } else{
                aler('Llenar todos los campos');
                }
                });
        });
