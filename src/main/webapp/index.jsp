<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="recursos/css/bootstrap.min.css" media="all" />
</head>
<body>
	<div class="container" style="max-width: 500px; margin-top: 120px; border: 1px solid #C00; padding: 20px;">
		<h1>Portal del Alumno</h1>
		<hr />
		<div class="form-group">
			<input type="text" class="form-control" name="nombre" id="nombre"
				placeholder="Nombre" />
		</div>
		<div class="form-group">
			<input type="text" class="form-control" name="telefono" id="telefono"
				placeholder="Telefono" />
		</div>
		<div class="form-group">
			<input type="text" class="form-control" name="correo" id="correo"
				placeholder="Correo Electrónico" />
		</div>
		<div class="row">
			<div class="col-3">
				<div class="form-group">
					<button class="btn btn-primary" onclick="registrar()">Registrar</button>
				</div>
			</div>

			<div class="col-9">
				<div class="form-group">
					<button class="btn btn-danger" onclick="listar()">Listar</button>
				</div>
			</div>
		</div>
	</div>
	<div class="container" id="resultado" style="max-width: 500px"></div>

	<script src="recursos/js/jquery.js"></script>
	<script src="recursos/js/bootstrap.min.js"></script>
	<script src="recursos/js/script.js"></script>
</body>
</html>