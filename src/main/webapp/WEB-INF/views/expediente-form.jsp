<%@ include file="/WEB-INF/views/header.jsp"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="container">

	<div class="col-xs-12">
		<h1>Agregar expediente</h1>
		<hr>
	</div>


	<form:form action="guardarExpediente" modelAttribute="expediente" method="POST">

		<form:hidden path="id" />
		<form:hidden path="paciente.id" />
		<form:hidden path="paciente.direccion.id" />
		<div class="form-group">
			<label for="folio">Folio: (*)</label>
			<form:input path="folio" class="form-control" />
			<form:errors path="folio" cssClass="error" />
		</div>

		<div class="form-group">
			<label for="paciente.paterno">Apellido paterno: (*)</label>
			<form:input path="paciente.paterno" class="form-control" />
			<form:errors path="paciente.paterno" cssClass="error" />
		</div>

		<div class="form-group">
			<label for="paciente.materno">Apellido materno:</label>
			<form:input path="paciente.materno" class="form-control" />
			<form:errors path="paciente.materno" cssClass="error" />
		</div>

		<div class="form-group">
			<label for="paciente.nombre">Nombre: (*)</label>
			<form:input path="paciente.nombre" class="form-control" />
			<form:errors path="paciente.nombre" cssClass="error" />
		</div>


		<div class="form-group">
			<label for="paciente.fechaDeNacimiento">Fecha de nacimiento:</label>
			<form:input path="paciente.fechaDeNacimiento" class="form-control"
				id="datepicker" />
			<form:errors path="paciente.fechaDeNacimiento" cssClass="error" />
		</div>

		<div class="form-group">
			<label for="paciente.nombre">Estatura: </label>
			<form:input path="paciente.estatura" class="form-control" />
			<form:errors path="paciente.peso" cssClass="error" />
		</div>

		<div class="form-group">
			<label for="paciente.nombre">Peso: </label>
			<form:input path="paciente.peso" class="form-control" />
			<form:errors path="paciente.peso" cssClass="error" />
		</div>

		<div class="form-group">
			<label for="paciente.direccion.calle">Calle: (*)</label>
			<form:input path="paciente.direccion.calle" class="form-control" />
			<form:errors path="paciente.direccion.calle" cssClass="error" />
		</div>

		<div class="form-group">
			<label for="paciente.direccion.exterior">Número exterior: (*)</label>
			<form:input path="paciente.direccion.exterior" class="form-control" />
			<form:errors path="paciente.direccion.exterior" cssClass="error" />
		</div>

		<div class="form-group">
			<label for="paciente.direccion.interior">Número interior:</label>
			<form:input path="paciente.direccion.interior" class="form-control" />
			<form:errors path="paciente.direccion.interior" cssClass="error" />
		</div>

		<div class="form-group">
			<label for="paciente.direccion.colonia">Colonia: (*)</label>
			<form:input path="paciente.direccion.colonia" class="form-control" />
			<form:errors path="paciente.direccion.colonia" cssClass="error" />
		</div>

		<div class="form-group">
			<label for="paciente.direccion.cp">Código postal: (*)</label>
			<form:input path="paciente.direccion.cp" class="form-control" />
			<form:errors path="paciente.direccion.cp" cssClass="error" />
		</div>

		<div class="form-group">
			<label for="paciente.direccion.delegacion">Delegación o
				municipio: (*)</label>
			<form:input path="paciente.direccion.delegacion" class="form-control" />
			<form:errors path="paciente.direccion.delegacion" cssClass="error" />
		</div>

		<div class="form-group">
			<label for="paciente.direccion.ciudad">Ciudad: (*)</label>
			<form:input path="paciente.direccion.ciudad" class="form-control" />
			<form:errors path="paciente.direccion.ciudad" cssClass="error" />
		</div>

		<div class="form-group">
			<label for="paciente.direccion.pais">País: (*)</label>
			<form:input path="paciente.direccion.pais" class="form-control" />
			<form:errors path="paciente.direccion.pais" cssClass="error" />
		</div>

		<div class="form-group">
			<label for="paciente.telefono">Telefono: </label>
			<form:input path="paciente.telefono" class="form-control" />
			<form:errors path="paciente.telefono" cssClass="error" />
		</div>

		<div class="form-group">
			<label for="paciente.email">Correo electrónico:</label>
			<form:input path="paciente.email" class="form-control" />
			<form:errors path="paciente.email" cssClass="error" />
		</div>

		<div class="form-group">
			<input class="button btn-success" type="submit"
				value="Agregar expediente">
		</div>
	</form:form>

	<hr />
	<p>
		<a href="/expediente">Regresar a la lista de expedientes</a>
	</p>

</div>

<script>
	$('#datepicker').datepicker({
		format : 'yyyy-mm-dd',
		uiLibrary : 'bootstrap4'
	});
</script>


<%@ include file="/WEB-INF/views/footer.jsp"%>