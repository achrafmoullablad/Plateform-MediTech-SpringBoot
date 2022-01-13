function eliminer(id){
	swal({
  title: "Are you sure?",
  text: "do you really want to delete this doctor?",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((willDelete) => {
	if(willDelete){
		$.ajax({
			url:"/sup/"+id,
			success : function(res){
				console.log(res);
			},
			
		});
		
		
	}
  if (willDelete) {
    swal("Poof! the doctor has been deleted!", {
      icon: "success",
    }).then((ok)=>{
		    	if(ok){
		    		location.href="/lister";
		    	}
		    });
  } else {
    swal("the doctor is safe!");
  }
});
}
function eliminepat(id){
	swal({
  title: "Are you sure?",
  text: "do you really want to delete this patient?",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((willDelete) => {
	if(willDelete){
		$.ajax({
			url:"/supr/"+id,
			success : function(res){
				console.log(res);
			},
			
		});
		
		
	}
  if (willDelete) {
    swal("Poof! the patient has been deleted!", {
      icon: "success",
    }).then((ok)=>{
		    	if(ok){
		    		location.href="/listerpa";
		    	}
		    });
  } else {
    swal("the patient is safe!");
  }
});
}
function eliminemedi(id){
	swal({
  title: "Are you sure?",
  text: "do you really want to delete this medication?",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((willDelete) => {
	if(willDelete){
		$.ajax({
			url:"/supMe/"+id,
			success : function(res){
				console.log(res);
			},
			
		});
		
		
	}
  if (willDelete) {
    swal("Poof! the medication has been deleted!", {
      icon: "success",
    }).then((ok)=>{
		    	if(ok){
		    		location.href="/listermedic";
		    	}
		    });
  } else {
    swal("the medication is safe!");
  }
});
}
function save(){
	$.ajax({
			url:"/saveme",
			success :swal({
  title: "Good job!",
  text: "doctor has added",
  icon: "success",
  button: "ok",
  
}).then((ok)=>{
		    	if(ok){
		    		location.href="/lister";
		    	}
		    }),
		 erreur :swal({
			title: "Good job!",
  text: "doctor has added",
  icon: "success",
  button: "ok",
			  
			}).then((ok)=>{
					    	if(ok){
					    		location.href="/lister";
					    	}
					    }),
						
					});
 
}
function save2(){
	$.ajax({
			url:"/saveme",
			success :swal({
  title: "Good job!",
  text: "medication has added",
  icon: "success",
  button: "ok",
  
}).then((ok)=>{
		    	if(ok){
		    		location.href="/listermedic";
		    	}
		    }),
		 erreur :swal({
  title: "Good job!",
  text: " medication has added",
  icon: "success",
  button: "ok",
  
}).then((ok)=>{
					    	if(ok){
					    		location.href="/listermedic";
					    	}
					    }),
						
					});
 
}
function save1(){
	$.ajax({
			url:"/savepa",
			success :swal({
  title: "Good job!",
  text: "patient has added",
  icon: "success",
  button: "ok",
  
}).then((ok)=>{
		    	if(ok){
		    		location.href="/listerpa";
		    	}
		    }),
		 erreur :swal({
			title: "Good job!",
  text: "patient has added",
  icon: "success",
  button: "ok",
			  
			}).then((ok)=>{
					    	if(ok){
					    		location.href="/listerpa";
					    	}
					    }),
						
					});
 
}
function savec(){
	$.ajax({
			url:"/savecons",
			success :swal({
  title: "Good job!",
  text: "consultation was added",
  icon: "success",
  button: "ok",
  
}).then((ok)=>{
		    	if(ok){
		    		location.href="/listercon";
		    	}
		    }),
		 erreur :swal({
			title: "Good job!",
  text: "consultation has added",
  icon: "success",
  button: "ok",
			  
			}).then((ok)=>{
					    	if(ok){
					    		location.href="/listercon";
					    	}
					    }),
						
					});
	
}


