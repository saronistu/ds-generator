<%@ include file="common/header.jspf" %>
	<div class="container">
		<h1>Students list</h1>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>#</th>
					<th>First name</th>
					<th>Last name</th>
					<th>Date of birth</th>
					<th>Enrolment number</th>
					<th>Field of study</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
			<x:forEach items="${listStudent}" var="student" varStatus="status">
			<tr>
				<td>${status.index + 1}</td>
				<td>${student.prenume}</td>
				<td>${student.nume}</td>
				<td>${student.dataNasterii}</td>
				<td>${student.numarMatricol}</td>
				<td>${student.denumireaCalificarii}</td>
				<td>
					<security:authorize access="hasAuthority('ADMIN')">
					<a href="edit?id=${student.id}" class="btn btn-primary">Edit</a>
					<a href="delete?id=${student.id}" class="btn btn-danger">Delete</a>
					</security:authorize>
					<a href="generate?id=${student.id}" class="btn btn-info">Generate</a>
				</td>
			</tr>
			</x:forEach>
			</tbody>
		</table>
		<h3><a href="new" class="btn btn-success">New student</a></h3>
	</div>
<%@ include file="common/footer.jspf" %>