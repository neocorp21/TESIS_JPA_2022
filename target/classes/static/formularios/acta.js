$('body').on('click', '.AprobarProyecto', function() {
	$('#id').val($(this).attr('id'));
	$('#id_proyecto').val($(this).attr('id_proyecto'));
	 $('#id_responsable').val($(this).attr('id_responsable'));
	 $('#id_cliente').val($(this).attr('id_cliente'));

	let elementoModificado = document.querySelector(".fa-cube > span")
	elementoModificado.innerHTML = "Aprobar Proyecto ?"

	$('#exampleModal').modal({ show: true });
});

 