<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
	<div class="container">
		<h1>Add new student</h1>
		<form:form action="savenew" method="post" modelAttribute="student">
			<form:hidden path="id" />
			<div class="form-group">
				<label>Nume</label>
				<form:input path="nume" type="text" class="form-control"/>
			</div>
			<div class="form-group">
				<label>Prenume</label>
				<form:input path="prenume" type="text" class="form-control"/>
			</div>
			<div class="form-group">
				<label>Username</label>
				<form:input path="username" type="text" class="form-control"/>
			</div>
			<input type="submit" class="btn btn-primary" value="Add">
		</form:form>
	</div>
<%@ include file="common/footer.jspf" %>