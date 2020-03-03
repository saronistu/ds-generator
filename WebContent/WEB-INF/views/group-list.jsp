<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
	<div class="container">
		<h1>List students by department and year</h1>
		<form:form action="group-list" method="post" modelAttribute="department">
			<div class="form-group">
				<label>Specializare</label>
				<form:select path="specializare" type="text" class="form-control">
					<form:option value="Informatică economică"/>
					<form:option value="Management"/>
					<form:option value="Asistență socială"/>
					<form:option value="Muzică"/>
					<form:option value="Teologie"/>
					<form:option value="Litere"/>
				</form:select>
			</div>
			<div class="form-group">
				<label>Anul inmatricularii</label>
				<form:input path="an" type="number" class="form-control" value="2017"/>
			</div>
			<input type="submit" class="btn btn-primary" value="View">
		</form:form>
	</div>
<%@ include file="common/footer.jspf" %>