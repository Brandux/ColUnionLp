//Activacion del menu
$(document).ready(function (){
     $(".button-collapse").sideNav();
     $(".dropdown-button").dropdown();
     $(".datepicker").pickadate();
     
  
     
});

$(document).ready(function (){
   
    $('.slider').slider({
      
    });
});

$(document).ready(function(){
      $('.parallax').parallax();
    });
    
    
    
    
  $(document).ready(function(){
    $('.collapsible').collapsible();
  });
        
        
        
        
        
       $(document).ready(function () {
    $('.carousel').carousel();
});
        
        // Next slide
$('.carousel').carousel('next');
$('.carousel').carousel('next', 3); // Move next n times.
// Previous slide
$('.carousel').carousel('prev');
$('.carousel').carousel('prev', 4); // Move prev n times.
// Set to nth slide
$('.carousel').carousel('set', 4);

//seleector login


$(document).ready(function () {
    $('select').material_select();
    
    
    $('#textarea1').val('New Text');
    $('#textarea1').trigger('autoresize');
});