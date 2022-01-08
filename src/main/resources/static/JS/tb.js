$(document).ready(function() {
   
    $.ajax({
           url:  "/med",
           type:     "GET",
           dataType: "json",
           success:  function (data) {
             var $select = $('#cp')

             $select.find('option').remove();

             $.each(data, function (key, value) {
               $select.append(`<option  value=${value.id}>${value.nom} ${value.prenom}</option>`);
               
            });
        }
      });
    
    
    
    
    
    });
    $(document).ready(function() {
   
    $.ajax({
           url:  "/patt",
           type:     "GET",
           dataType: "json",
           success:  function (data) {
             var $select = $('#cd')

             $select.find('option').remove();

             $.each(data, function (key, value) {
               $select.append(`<option  value=${value.id}>${value.nom} ${value.prenom}</option>`);
               
            });
        }
      });
    
    
    
    
    
    });
    $(document).ready(function() {
   
    $.ajax({
           url:  "/medic",
           type:     "GET",
           dataType: "json",
           success:  function (data) {
             var $select = $('#cs')

             $select.find('option').remove();

             $.each(data, function (key, value) {
               $select.append(`<option value=${value.id}>${value.nom}</option>`);
               
            });
        }
      });
    
    
    
    
    
    });