<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
	<div class="container">
		<h1>Create a user</h1>
		<form:form action="create-user" method="post" modelAttribute="user">
			<div class="form-group">
				<label>Username:</label>
				<form:input path="username" type="text" class="form-control"/>
			</div>
			<div class="form-group">
				<label>Password:</label>
				<form:input path="password" type="password" class="form-control"/>
			</div>
			<div class="form-group">
				<label>Authority:</label>
				<form:select path="authority" class="form-control">
					<form:option value="USER"/>
					<form:option value="ADMIN"/>
				</form:select>
			</div>
			<input type="submit" class="btn btn-primary" value="Create">
		</form:form>
	</div>
<%@ include file="common/footer.jspf" %>