<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<script lenguaje="JavaScript" type="text/javascript"
	src="<c:url value="/resources/javascript/jquery-3.2.1.js" />"></script>
<script lenguaje="JavaScript" type="text/javascript"
	src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js"></script>
<script lenguaje="JavaScript" type="text/javascript"
    src="<c:url value="/resources/javascript/Script_alumnos.js"/>"></script>
    	
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>PROYECTO</title>
</head>
<body>
<div>
<table class="table" id="tablaalumnos">
<thead>

<tr>
<th scope="col">IDALUMNO</th>
<th scope="col">APELLIDO</th>
<th scope="col">NOMBRE</th>
<th scope="col">SEXO</th>
<th scope="col">EDAD</th>
<th scope="col">TELEFONO</th>
<th scope="col">ELIMINAR</th>
<th scope="col">EDITAR</th>

</tr>
</thead>

</table>
</div>
<!-- Button trigger modal -->
<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
  Agregar Alumno
</button>

<!--------------------------------------------------------------------------->
<!-- Modal 1-->
<div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="staticBackdropLabel"> Agregar Alumno</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body" id="contenido">
      <label for="">Apellido:</label>
        <input type="text" class="form-control" id="apellido" placeholder="Apellido del alumno">
        <label for="">Nombre:</label>
        <input type="text" class="form-control" id="nombre" placeholder="Nombre del alumno">
        <label for="">Sexo:</label>
        <input type="text" class="form-control" id="sexo" placeholder="Masculino o Femenino">
        <label for="">Edad:</label>
        <input type="text" class="form-control" id="edad" placeholder="Edad del alumno">
        <label for="">Telefono:</label>
        <input type="text" class="form-control" id="telefono" placeholder="Numero del alumno">
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>
        <button type="button" class="btn btn-primary" id="boton_guardar" onclick="click" >Guardar cambios</button>
      </div>
    </div>
  </div>
</div>
<!--------------------------------------------------------------------------->
<!-- Modal 2-->
<div class="modal" tabindex="-1" role="dialog" id="modalactualizaralumno">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title">Actualizar alumno</h5>
				</div>
				<input type="hidden" id="idalumno_actualizar">
					<div class="modal-body">
                  <label for="">Apellido: </label>
                  <input type="text" class="form-control" id="apellido_actualizar" placeholder="Apellido del alumno">
						<br>
						<label for="">Nombre: </label>
                  <input type="text" class="form-control" id="nombre_actualizar" placeholder="Nombre del alumno"/>
						<br>
						<label for="">sexo: </label>
                  <input type="text" class="form-control" id="sexo_actualizar" placeholder="Sexo del alumno"/>
                        <br>
                  <label for="">Edad: </label>
                  <input type="text" class="form-control" id="edad_actualizar" placeholder="Edad  del alumno"/>
						<br>
						<label for="">Telefono: </label>
                  <input type="text" class="form-control" id="telefono_actualizar" placeholder="Telefono del alumno"/>
						<br>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal" id="Boton_cerrar"
							onclick="document.getElementById('modalactualizaralumno').style.display='none'">Cerrar</button>
						<button type="submit" class="btn btn-primary" id="Botactualizar" onclick="document.getElementById('modalactualizaralumno').style.display='none'">Actualizar alumno</button>
					</div>
			</div>
		</div>
	</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>

</body>
</html>