<%@ include file="/WEB-INF/views/header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<div class="container">

	<div class="row">
		<div class="col-xs-12 col-md-6">
			<br />
			<h2>Expedientes</h2>

		</div>

		<div class="col-xs-12 col-md-6">
			<br /> <input type="button" value="Agregar expediente"
				onclick="window.location.href='expediente/agregar-expediente'; return false;"
				class="btn  btn-primary" />
		</div>

	</div>
	<hr />
	<table class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Número</th>
				<th scope="col">Folio</th>
				<th scope="col">Paterno</th>
				<th scope="col">Materno</th>
				<th scope="col">Nombre</th>
				<th scope="col">Mostrar paciente</th>
				<th scope="col">Actualizar expediente</th>
				<th scope="col">Deshabilitar expediente</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="tempExpediente" items="${expedientes}">
				<c:url var="updateLink" value="/expediente/actualizar">
					<c:param name="expedienteId" value="${tempExpediente.id }" />
				</c:url>
				<c:url var="disableLink" value="/expediente/deshabilitar">
					<c:param name="expedienteId" value="${tempExpediente.id }" />
				</c:url>
				<tr>
					<td>${tempExpediente.id }</td>
					<td>${tempExpediente.folio }</td>
					<td>${tempExpediente.paciente.paterno }</td>
					<td>${tempExpediente.paciente.materno }</td>
					<td>${tempExpediente.paciente.nombre }</td>
					<td><a href="/paciente/${tempExpediente.paciente.id}">Mostrar
							paciente</a></td>
					<td><a href="${updateLink}">Actualizar
							expediente</a></td>
					<td><a href="${disableLink}"
						onclick="if (!(confirm('¿Esta seguro que quiere deshabilitar este expediente?'))) return false">Deshabilitar
							expediente></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>


<%@ include file="/WEB-INF/views/footer.jsp"%>