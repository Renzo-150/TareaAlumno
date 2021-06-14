$(document).ready(function() {

})

function registrar() {
	alert("registrar");
	var datos = { "user": $("#nombre").val(), "telf": $("#telefono").val(), "corr": $("#correo").val(), "opc": 1};
	$.ajax({
		beforeSend: function() {
			$('#resultado').html('Esperando...!');
		},
		data: datos,
		url: 'uc',
		type: 'POST',
		success: function(response) {
			if (response == 1) {
				$('#resultado').html("<div class='alert alert-success' role='alert'>Registro guardado correctamente...!</div>");
			} else {
				$('#resultado').html("<div class='alert alert-danger' role='alert'>Error al guardar el registro...!</div>");
			}

		},
		error: function(jqXHR, estado, error) {
			console.log(estado)
			console.log(error)
		},
		complete: function(jqXHR, estado) {
			console.log(estado)
		}
	});
}

function listar() {
	var param = {"opc": 2};

	$.ajax({
		beforeSend: function(){
			$('#resultado').html('Esperando...!');
		},
		data: param,
		url: 'uc',
		type: 'POST',
		success: function(response){
			$('#resultado').html(response);
		},
		error: function(jqXHR, estado, error){
		console.log(estado)
		console.log(error)
		},
		complete: function (jqXHR, estado){
			console.log(estado)
		}		
	});


}
