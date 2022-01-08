$(document).ready(function(){
	
	$('#table .medd .ooo').on('click',function(event){
		event.preventDefault();
		
		var href=$(this).attr('href');
		console.log(href);
		$.get(href,function(medecin,status){
		
			$('#name1').val(medecin.nom);
			$('#exampleModalmo .myform #prenom1').val(medecin.prenom);
			$('#exampleModalmo .myform #adr1').val(medecin.adresse);
			$('#exampleModalmo .myform #tel1').val(medecin.telephone);
			$('#exampleModalmo .myform #em1').val(medecin.email);
			$('#exampleModalmo .myform #h1').val(medecin.status);
		});
		$('#exampleModalmo').modal();
	});
		$('#table .medd1 .ook').on('click',function(event){
		event.preventDefault();
		
		var href1='findone/?id='+$(this).attr('href');
		console.log(href1);
		$.get(href1,function(medecin1,status){
		 console.log(medecin1);
	
			$('#tname').html(medecin1.nom);
			$('#tprenom').html(medecin1.prenom);
			$('#tadresse').html(medecin1.adresse);
			$('#ttel').html(medecin1.telephone);
			$('#temail').html(medecin1.email);
			$('#tstat').html(medecin1.status);
			console.log(medecin1.nom);
			console.log(status);
		});
		$('#eye11').modal();
	});
	$('.patt .oov').on('click',function(event){
		event.preventDefault();
		
		var href=$(this).attr('href');
		console.log(href);
		$.get(href,function(patients,status){
		
			$('#name2').val(patients.nom);
			$('#exampleModalpa .myform #prenom2').val(patients.prenom);
			$('#exampleModalpa .myform #adr2').val(patients.adresse);
			$('#exampleModalpa .myform #tel2').val(patients.telephone);
			$('#exampleModalpa .myform #em2').val(patients.email);
			
		});
		$('#exampleModalpa').modal();
	});
		$('.moh .ood').on('click',function(event){
		event.preventDefault();
		
		var href1='findp/?id='+$(this).attr('href');
		console.log(href1);
		$.get(href1,function(patient,status){
		 console.log(patient);
	
			$('#tpat').html(patient.nom);
			$('#tpat1').html(patient.prenom);
			$('#tpat2').html(patient.adresse);
			$('#tpat3').html(patient.telephone);
			$('#tpat4').html(patient.email);
		
			console.log(patient.nom);
			console.log(status);
		});
		$('#eye12').modal();
	});
	$('.mohi .bod').on('click',function(event){
		event.preventDefault();
		
		var href1='findM/?id='+$(this).attr('href');
		console.log(href1);
		$.get(href1,function(medicament,status){
		 console.log(medicament);
	
			$('#n1').html(medicament.nom);
			$('#n2').html(medicament.laboratoire);
			$('#n3').html(medicament.maladie);
			
			
		
			console.log(medicament.nom);
			console.log(status);
		});
		$('#eye13').modal();
	});
	$('.medii .bov').on('click',function(event){
		event.preventDefault();
		
		var href=$(this).attr('href');
		console.log(href);
		$.get(href,function(medicament,status){
		
		
			$('#exampleModalmedi .myform #nm').val(medicament.nom);
			$('#exampleModalmedi .myform #labo').val(medicament.laboratoire);
			$('#exampleModalmedi .myform #mal').val(medicament.maladie);
			
			
		});
		$('#exampleModalmedi').modal();
	});
});