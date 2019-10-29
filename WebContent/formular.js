
$(document).ready(function(){
	$("#register").click(function(){
		$(".form1").css("display", "none");
		$(".form2").css("display", "inline-block");
		});
		
	$("#login").click(function(){
		$(".form2").css("display", "none");
		$(".form1").css("display", "inline-block");
	});
	
	
});


