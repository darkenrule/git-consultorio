<%@ include file="/WEB-INF/views/header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container">

	<div class="row">
		<div class="col-xs-12 col-md-6">
			<br />
			<h3>Paciente: ${paciente.paterno} ${paciente.materno} ${paciente.nombre}</h3>
			<h3>Expediente con folio: ${paciente.expediente.folio}</h3>
		</div>
	</div>
	<hr />
	<h5>Detalles del paciente:</h5>
	<br/>	
	<b>Estatura:</b> ${paciente.estatura} m<br>
	<b>Peso:</b> ${paciente.peso} kg<br>
	<b>IMC:</b> ${imc}<br>
	<b>Clasificación IMC:</b> ${imcStatus}<br>
	<b>Fecha de nacimiento:</b> ${fechaNacimiento}<br>
	<b>Edad:</b> ${calculoEdad} años<br>		
	<hr />
	<h5>Dirección:</h5>
	<br/>
	<b>Calle:</b> ${paciente.direccion.calle}<br>
	<b>Número exterior:</b> ${paciente.direccion.exterior}<br>
	<b>Número interior:</b> ${paciente.direccion.interior}<br>
	<b>Colonia:</b> ${paciente.direccion.colonia}<br>
	<b>Delegación:</b> ${paciente.direccion.delegacion}<br>
	<b>Código postal:</b> ${paciente.direccion.cp}<br>
	<b>Ciudad:</b> ${paciente.direccion.ciudad}<br>
	<b>País:</b> ${paciente.direccion.pais}<br>
	<hr/>

		</tbody>
	</table>
</div>


<%@ include file="/WEB-INF/views/footer.jsp"%>