$(document).ready(function() {
	$("#editare").click(function() {
		$(".formular_edit").css("display", "inline-block");
		$(".formular_logout").css("display", "none");
	});

	$("#logout").click(function() {
		$(".formular_edit").css("display", "none");
		$(".formular_logout").css("display", "block");
	});

});