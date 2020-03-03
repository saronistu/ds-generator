<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
	<h1>Edit student: information identifying the qualification</h1>
	<form:form action="save2" method="post" modelAttribute="student">
		<form:hidden path="id" />
		<div class="form-group">
			<label>Denumirea calificarii</label>
			<form:input path="denumireaCalificarii" type="text" class="form-control"/>
		</div>
		<div class="form-group">
			<label>Domeniu studii</label>
			<form:input path="domeniuStudii" type="text" class="form-control"/>
		</div>
		<div class="form-group">
			<label>Program studii</label>
			<form:input path="programStudii" type="text" class="form-control"/>
		</div>
		<div class="form-group">
			<label>Numele institutiei</label>
			<form:input path="numeInstitutie" type="text" class="form-control"/>
		</div>
		<div class="form-group">
			<label>Facultate</label>
			<form:input path="facultate" type="text" class="form-control"/>
		</div>
		<div class="form-group">
			<label>Institutia care a asigurat scolarizarea (daca difera)</label>
			<form:input path="institutieDiferita" type="text" class="form-control"/>
		</div>
		<div class="form-group">
			<label>Facultatea care a asigurat scolarizarea (daca difera)</label>
			<form:input path="facultateDiferita" type="text" class="form-control"/>
		</div>
		<div class="form-group">
			<label>Limba studiu</label>
			<form:input path="limbaStudiu" type="text" class="form-control"/>
		</div>
		<input type="submit" class="btn btn-primary" value="Add">
	</form:form>
</div>
<%@ include file="common/footer.jspf" %>