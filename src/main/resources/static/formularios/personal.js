$('body').on('click', '.editar', function() {
	$('#id').val($(this).attr('id'));
	$('#nombre').val($(this).attr('param1'));
	$('#apellidopaterno').val($(this).attr('param2'));
	$('#apellidomaterno').val($(this).attr('param3'));

	let elementoModificado = document.querySelector(".fa-cube > span")
	elementoModificado.innerHTML = "Modificar Registro"

	$('#exampleModal').modal({ show: true });
});


$('body').on('click', '.agregar', function() {
	$('#id').val('');
	$('#nombre').val('');
	$('#apellidopaterno').val('');
	$('#apellidomaterno').val('');
	let elementoModificado = document.querySelector(".fa-cube > span")
	elementoModificado.innerHTML = "Nuevo Registro"


});