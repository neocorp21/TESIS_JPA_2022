$('body').on('click','.editar',function(){
$('#id').val($(this).attr('id'));
 


let elementoModificado = document.querySelector(".fa-cube > span")
 elementoModificado.innerHTML = "Agregar Actividad"
        
$('#exampleModal').modal({show:true});
});


$('body').on('click','.agregar',function(){
	$('#id').val('');
	$('#nombre').val('');
 	$('#sueldo').val('');

  let elementoModificado = document.querySelector(".fa-cube > span")
        elementoModificado.innerHTML = "Nuevo Registro"
		 
		
});