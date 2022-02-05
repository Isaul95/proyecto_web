$(document).ready(function(){
	llenartablaalumnos();
});
function llenartablaalumnos(){
	var table = $('#tablaalumnos').DataTable();
	table.destroy();
	$.ajax({
		type: "get",
		url: '/proyectoweb/Obteneralumnos',
		dataType: "json",
		success: function(response){
			$("#tablaalumnos").DataTable({
				data: response,
				resposive: true,
				columns:[
					{
					data: "id_alumno",
					"searchable": false,
					"visible": false,	
					},
					{
						data: "apellido",
					},
					{
						data: "nombre",
					},
					{
						data: "sexo",
					},
					{
						data: "edad",
					},
					{
						data: "telefono",
					},
					{
                    className: "text-center",
                    data: function (row, type, set) {
                        var a;
                         a= `  
                         <a href="#" id="eliminar_alumno" class="btn btn-danger btn-remove" value="${row.id_alumno}"><i class="fas fa-trash-alt"></i></a>
                         `;
                        
                        return a;
                    },
                  },
                   {
                    className: "text-center",
                    data: function (row, type, set) {
                        var a;
                         a= `  
                         <a href="#" id="actualizar_alumno" class="btn btn-danger btn-remove" value="${row.id_alumno}"><i class="fas fa-trash-alt"></i></a>
                         `;
                        
                        return a;
                    },
                  }
                  
				]
				 
			});
		},					
	});
}
$(document).on("click","#boton_guardar",function(e){
	e.preventDefault();
	var apellido = $('#apellido').val();
	var nombre = $('#nombre').val();
	var sexo = $('#sexo').val();
	var edad = $('#edad').val();
	var telefono = $('#telefono').val();
	$.ajax({
		type: "post",
		url: "/proyectoweb/Agregaralumnos",
		data: {
			apellido: apellido,
			nombre : nombre,
			sexo : sexo,
			edad: edad,
			telefono : telefono,
		},
		dataType: "json",
		success: function(respuestadelcontrolador){
			if (respuestadelcontrolador==1){
				alert("Alumno agregado");
				llenartablaalumnos();
				
			}
			else{alert("Alumno no agregado");}
		}
});

});

$(document).on("click","#eliminar_alumno",function(e){
	e.preventDefault();
	var idalumno = $(this).attr("value");
	$.ajax({
		type: "post",
		url: "/proyectoweb/Eliminaralumno",
		data: {
			id_alumno: idalumno,//el valor de la izquierda hace referencia a mi modelo o clase alumnos
		},
		dataType: "json",
		success: function(respuestadelcontrolador){
			if (respuestadelcontrolador==1){
				alert("Alumno eliminado");
				llenartablaalumnos();
				
			}
			else{alert("Alumno no eliminado");}
		}
});

});

$(document).on("click","#actualizar_alumno",function(e){
	e.preventDefault();
	var idalumno = $(this).attr("value");
	$.ajax({
		type: "post",
		url: "/proyectoweb/ObtenerAlumno",
		data: {
			id_alumno: idalumno,//el valor de la izquierda hace referencia a mi modelo o clase alumnos
		},
		dataType: "json",
		success: function(data){
		 document.getElementById('modalactualizaralumno').style.display='block'
	       $('#idalumno_actualizar').val(data.id_alumno);
           $('#apellido_actualizar').val(data.apellido);
           $('#nombre_actualizar').val(data.nombre);
           $('#sexo_actualizar').val(data.sexo);
           $('#edad_actualizar').val(data.edad);
           $('#telefono_actualizar').val(data.telefono);
		}
});

});

$(document).on("click","#Botactualizar",function(e){
	e.preventDefault();
	/*debugger;*/
	var idalumno = $('#idalumno_actualizar').val();
	var apellido = $('#apellido_actualizar').val();
	var nombre = $('#nombre_actualizar').val();
	var sexo = $('#sexo_actualizar').val();
	var edad = $('#edad_actualizar').val();
	var telefono = $('#telefono_actualizar').val();
	
	$.ajax({
		type: "post",
		url: "/proyectoweb/ActualizarAlumno",
		data: {
			id_alumno: idalumno,//el valor de la izquierda hace referencia a mi modelo o clase alumnos
			apellido: apellido,
			nombre: nombre,
			sexo: sexo,
			edad: edad,
			telefono: telefono,
		},
		dataType: "json",
		success: function(respuestadelcontrolador){
			if (respuestadelcontrolador==1){
				alert("Alumno actualizado");
				llenartablaalumnos();
				
			}
			else{alert("Alumno no actualizado");}
		}
});

});

