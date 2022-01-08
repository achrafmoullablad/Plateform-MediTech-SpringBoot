$(function(){
    let image = $("#image");
    image.mouseover(function(){

        image.addClass("ddd");

    });

    image.mouseout(function(){

        image.removeClass("ddd");

    });
});