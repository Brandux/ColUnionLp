window.onload = function () {
    var options1 = {
        enableHighAccuracy: true,
        maximumAge: 60000,
        timeout: 45000
    };
    var lantlong = {
        lat: "",
        lon: ""
    };
    if (window.navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(exito, falla, options1);
        //getCurrentPosition
    } else {
        //alert("tu broswer no soporta geolocation");
        return;
    }
    function exito(cordenadas) {
        var lat = cordenadas.coords.latitude;
        var lon = cordenadas.coords.longitude;
        lantlong.lat = lat;
        lantlong.lon = lon;
        cambio();
    }

    function falla() {
        // do algo
    }
    function cambio() {
      /*  var tmp = document.getElementById("geo").innerHTML
                = "Latitud:" + lantlong.lat + "<br/>" + "longitud:" + lantlong.lon;*/
        var mapDiv = document.getElementById("map");
        var latlng = new google.maps.LatLng(lantlong.lat, lantlong.lon);
        var options = {
            center: latlng,
            zoom: 15,
            mapTypeId: google.maps.MapTypeId.ROADMAP
        };
        var map = new google.maps.Map(mapDiv, options);
    }
}