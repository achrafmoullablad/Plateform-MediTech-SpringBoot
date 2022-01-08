
$(function(){
    let bars = $("#bars");
    let idhome =$("#idhome");
    let idpicture =$("#idpicture");
    let idmedicament=$("#idmedicament");
    let idconsultaion = $("#idconsultaion");
    let idpatient = $("#idpatient");
    let idsettings = $("#idsettings");
    let nav = $("nav");
    let main = $("main");
    let windows = $(window);
    let adddoctor = $("#adddoctor");
    let seedoctor = $("#seedoctor");
    let divadddoctor = $(".layout main .doctor .adddoctor");
    let divseealldoctor = $(".layout main .doctor .listdoctor");
    let iddoctor = $("#iddoctor");
    let divchart = $(".layout main .chart");
    let divdoctor = $(".layout main .doctor");
    let divmedicament = $(".layout main .medicament");
    let divconsultaion = $(".layout main .Consultaion");
    let divpatient = $(".layout main .patient");
    let addmedicament = $("#addmedicament");
    let seemedicament = $("#seemedicament");
    let divaddmedicament = $(".layout main .medicament .addmedicament");
    let divseemedicament = $(".layout main .medicament .listmedicament");
    let addconsultaion = $("#addConsultaion");
    let seeconsultaion = $("#seeConsultaion");
    let divaddconsultaion = $(".layout main .Consultaion .addConsultaion");
    let divseeconsultaion = $(".layout main .Consultaion .listConsultaion");
    let divsettings = $(".layout main .settings");
    let addpatient = $("#addpatient");
    let seepatient = $("#seepatient");
    let divaddpatient = $(".layout main .patient .addpatient");
    let divseepatient = $(".layout main .patient .listpatient");
   
    let inputcode = $("#inputcode");
    let addcode = $("#addcode");


    let sessionreload = "none";




    addcode.click(function(){

      inputcode.slideToggle(1);

    });




    $("#searchinput").on("keyup", function() {
      var value = $(this).val().toLowerCase();
      $("#table tr").filter(function() {
        $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
      });
    });


    $("#searchmedicament").on("keyup", function() {
      var value = $(this).val().toLowerCase();
      $("#tablemedicament tr").filter(function() {
        $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
      });
    });


    $("#searchConsultaion").on("keyup", function() {
      var value = $(this).val().toLowerCase();
      $("#tableConsultaion tr ").filter(function() {
        $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
      });
    });


    $("#searchpatient").on("keyup", function() {
      var value = $(this).val().toLowerCase();
      $("#tablepatient tr").filter(function() {
        $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
      });
    });


    adddoctor.click(function(){
      divseealldoctor.slideUp(1000);
      divadddoctor.slideDown(1000);
    });

    seedoctor.click(function(){
      divadddoctor.slideUp(1000);
      divseealldoctor.slideDown(1000);
    });


    addmedicament.click(function(){
      divseemedicament.slideUp(1000);
       divaddmedicament.slideDown(1000);
   
    });

    seemedicament.click(function(){
      divaddmedicament.slideUp(1000);
      divseemedicament.slideDown(1000);
    
    });




    addconsultaion.click(function(){
      divseeconsultaion.slideUp(1000);
       divaddconsultaion.slideDown(1000);
   
    });

    seeconsultaion.click(function(){
      divaddconsultaion.slideUp(1000);
      divseeconsultaion.slideDown(1000);
    
    });




    addpatient.click(function(){
      divseepatient.slideUp(1000);
       divaddpatient.slideDown(1000);
   
    });

    seepatient.click(function(){
      divaddpatient.slideUp(1000);
      divseepatient.slideDown(1000);
    
    });



    bars.click(function(){
        if(windows.width()>900){

            nav.toggleClass("width");
            main.toggleClass("width");


        }
        else{
           nav.removeClass("width");
           main.removeClass("width");
            nav.toggleClass("show");
        }
    });

    windows.resize(function(){
        if(windows.width()>900){
            nav.addClass("show");


        }
        else{
            nav.removeClass("show");
        }
    });
   


    iddoctor.click(function(){
      nav.removeClass("show");
      divchart.addClass("annimateremove");
      divchart.fadeOut();

      divconsultaion.addClass("annimateremove");
      divconsultaion.fadeOut();

      divpatient.addClass("annimateremove");
      divpatient.fadeOut();

      divmedicament.addClass("annimateremove");
      divmedicament.fadeOut();

      divsettings.addClass("annimateremove");
      divsettings.fadeOut();

      divdoctor.addClass("annimateadd");
      divdoctor.fadeIn();
      sessionStorage.setItem('rel', 'divdoctor');
    });

    idhome.click(function(){
      nav.removeClass("show");
     
      divdoctor.addClass("annimateremove");
      divdoctor.fadeOut();

      divconsultaion.addClass("annimateremove");
      divconsultaion.fadeOut();

      divpatient.addClass("annimateremove");
      divpatient.fadeOut();

      divmedicament.addClass("annimateremove");
      divmedicament.fadeOut();

      divsettings.addClass("annimateremove");
      divsettings.fadeOut();

      divchart.addClass("annimateadd");
      divchart.fadeIn();
      sessionStorage.setItem('rel', 'divhome');
    });

    idpicture.click(function(){
      nav.removeClass("show");
     
      divdoctor.addClass("annimateremove");
      divdoctor.fadeOut();

      divconsultaion.addClass("annimateremove");
      divconsultaion.fadeOut();

      divpatient.addClass("annimateremove");
      divpatient.fadeOut();

      divmedicament.addClass("annimateremove");
      divmedicament.fadeOut();

      divsettings.addClass("annimateremove");
      divsettings.fadeOut();

      divchart.addClass("annimateadd");
      divchart.fadeIn();

     sessionStorage.setItem('rel', 'divhome');
    });




    idmedicament.click(function(){
	
      nav.removeClass("show");
     
      divdoctor.addClass("annimateremove");
      divdoctor.fadeOut();
    
      divconsultaion.addClass("annimateremove");
      divconsultaion.fadeOut();
    
      divpatient.addClass("annimateremove");
      divpatient.fadeOut();
  
    
      divchart.addClass("annimateremove");
      divchart.fadeOut();

      divsettings.addClass("annimateremove");
      divsettings.fadeOut();

      divmedicament.addClass("annimateadd");
      divmedicament.fadeIn();

     sessionStorage.setItem('rel', 'divmedicament');
    });




    idconsultaion.click(function(){
      nav.removeClass("show");
     
      divdoctor.addClass("annimateremove");
      divdoctor.fadeOut();
    
      divmedicament.addClass("annimateremove");
      divmedicament.fadeOut();
    
      divpatient.addClass("annimateremove");
      divpatient.fadeOut();
  
    
      divchart.addClass("annimateremove");
      divchart.fadeOut();

      divsettings.addClass("annimateremove");
      divsettings.fadeOut();

      divconsultaion.addClass("annimateadd");
      divconsultaion.fadeIn();

      sessionStorage.setItem('rel', 'divconsultation');
    });



    idpatient.click(function(){
      nav.removeClass("show");
     
      divdoctor.addClass("annimateremove");
      divdoctor.fadeOut();
    
      divmedicament.addClass("annimateremove");
      divmedicament.fadeOut();
    
      divconsultaion.addClass("annimateremove");
      divconsultaion.fadeOut();
  
    
      divchart.addClass("annimateremove");
      divchart.fadeOut();

      divsettings.addClass("annimateremove");
      divsettings.fadeOut();

      divpatient.addClass("annimateadd");
      divpatient.fadeIn();

      sessionStorage.setItem('rel', 'divpatient');
    });



    idsettings.click(function(){
      nav.removeClass("show");
     
      divdoctor.addClass("annimateremove");
      divdoctor.fadeOut();
    
      divmedicament.addClass("annimateremove");
      divmedicament.fadeOut();
    
      divconsultaion.addClass("annimateremove");
      divconsultaion.fadeOut();
  
    
      divchart.addClass("annimateremove");
      divchart.fadeOut();

      divpatient.addClass("annimateremove");
      divpatient.fadeOut();

      divsettings.addClass("annimateadd");
      divsettings.fadeIn();

       sessionStorage.setItem('rel', 'divsettings');
   
    });





     sessionreload = sessionStorage.getItem('rel');
    if(sessionreload=="divhome"){
      nav.removeClass("show");
     
      divdoctor.addClass("annimateremove");
      divdoctor.fadeOut();
    
      divmedicament.addClass("annimateremove");
      divmedicament.fadeOut();
    
      divconsultaion.addClass("annimateremove");
      divconsultaion.fadeOut();

      divpatient.addClass("annimateremove");
      divpatient.fadeOut();

      divsettings.addClass("annimateremove");
      divsettings.fadeOut();

      divchart.addClass("annimateadd");
      divchart.fadeIn();
    }
    else if(sessionreload=="divsettings"){
      nav.removeClass("show");
     
      divdoctor.addClass("annimateremove");
      divdoctor.fadeOut();
    
      divmedicament.addClass("annimateremove");
      divmedicament.fadeOut();
    
      divconsultaion.addClass("annimateremove");
      divconsultaion.fadeOut();
  
    
      divchart.addClass("annimateremove");
      divchart.fadeOut();

      divpatient.addClass("annimateremove");
      divpatient.fadeOut();

      divsettings.addClass("annimateadd");
      divsettings.fadeIn();
    }
    else if(sessionreload=="divdoctor"){
      nav.removeClass("show");
      divchart.addClass("annimateremove");
      divchart.fadeOut();

      divconsultaion.addClass("annimateremove");
      divconsultaion.fadeOut();

      divpatient.addClass("annimateremove");
      divpatient.fadeOut();

      divmedicament.addClass("annimateremove");
      divmedicament.fadeOut();

      divsettings.addClass("annimateremove");
      divsettings.fadeOut();

      divdoctor.addClass("annimateadd");
      divdoctor.fadeIn();
    }
    else if(sessionreload=="divconsultation"){
      nav.removeClass("show");
     
      divdoctor.addClass("annimateremove");
      divdoctor.fadeOut();
    
      divmedicament.addClass("annimateremove");
      divmedicament.fadeOut();
    
      divpatient.addClass("annimateremove");
      divpatient.fadeOut();
  
    
      divchart.addClass("annimateremove");
      divchart.fadeOut();

      divsettings.addClass("annimateremove");
      divsettings.fadeOut();

      divconsultaion.addClass("annimateadd");
      divconsultaion.fadeIn();
    }
    else if(sessionreload=="divpatient"){
      nav.removeClass("show");
     
      divdoctor.addClass("annimateremove");
      divdoctor.fadeOut();

      divconsultaion.addClass("annimateremove");
      divconsultaion.fadeOut();

      divchart.addClass("annimateremove");
      divchart.fadeOut();

      divmedicament.addClass("annimateremove");
      divmedicament.fadeOut();

      divsettings.addClass("annimateremove");
      divsettings.fadeOut();

    
      divpatient.addClass("annimateadd");
      divpatient.fadeIn();
    }
    else if(sessionreload=="divmedicament"){
      nav.removeClass("show");
     
      divdoctor.addClass("annimateremove");
      divdoctor.fadeOut();

      divconsultaion.addClass("annimateremove");
      divconsultaion.fadeOut();

      divchart.addClass("annimateremove");
      divchart.fadeOut();


      divsettings.addClass("annimateremove");
      divsettings.fadeOut();

    
      divpatient.addClass("annimateremove");
      divpatient.fadeOut();

      
      divmedicament.addClass("annimateadd");
      divmedicament.fadeIn();
    }




});













var data = {
    labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul"],
    datasets: [{
      label: "Dataset #1",
      backgroundColor: "rgba(11,83,9)",
      borderColor: "rgba(255,255,255)",
      borderWidth: 2,
      hoverBackgroundColor: "rgba(255,99,132,0.4)",
      hoverBorderColor: "rgba(255,99,132,1)",
      data: [65, 59, 20, 81, 56, 55, 40],
    }]
  };
  
  var options = {
    maintainAspectRatio: false,
    scales: {
      y: {
        stacked: true,
        grid: {
          display: true,
          color: "rgba(255,255,255,0.2)"
        }
      },
      x: {
        grid: {
          display: false
        }
      }
    }
  };
  
  new Chart('chart', {
    type: 'bar',
    options: options,
    data: data
  });