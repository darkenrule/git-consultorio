<%@ include file="/WEB-INF/views/header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<div class="container">

	<div class="row">
		<div class="col-xs-12 col-md-6">
			<br />
			<h2>Pacientes</h2>

		</div>

		<div class="col-xs-12 col-md-6">
		</div>

	</div>
	<hr />
	<table class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Número</th>				
				<th scope="col">Paterno</th>
				<th scope="col">Materno</th>
				<th scope="col">Nombre</th>
				<th scope="col">Detalle</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="tempPaciente" items="${pacientes}">							
				<tr>
					<td>${tempPaciente.id }</td>					
					<td>${tempPaciente.paterno }</td>
					<td>${tempPaciente.materno }</td>
					<td>${tempPaciente.nombre }</td>
					<td><a href="/paciente/${tempPaciente.id}">Ver detalle</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>


<%@ include file="/WEB-INF/views/footer.jsp"%>