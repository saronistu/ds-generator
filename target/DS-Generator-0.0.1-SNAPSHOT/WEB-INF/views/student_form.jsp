<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
	<div class="container">
		<h1>Edit student: information identifying the holder of the diploma</h1>
		<form:form action="save?id=${student.id}" method="post" modelAttribute="student">
			<form:hidden path="id" />
			<div class="row">
				<div class="col">
					<div class="form-group">
						<label>Nume</label>
						<form:input path="nume" type="text" class="form-control"/>
					</div>
					<div class="form-group">
						<label>Nume familie dupa casatorie</label>
						<form:input path="numeFamilieDupaCasatorie" type="text" class="form-control"/>
					</div>
					<div class="form-group">
						<label>Initiala tatalui/mamei</label>
						<form:input path="initialaTatalui" type="text" class="form-control"/>
					</div>
					<div class="form-group">
						<label>Prenume</label>
						<form:input path="prenume" type="text" class="form-control"/>
					</div>
					<div class="form-group">
						<label>Data nasterii</label>
						<form:input path="dataNasterii" type="text" class="form-control"/>
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label>Locul nasterii</label>
						<form:input path="loculNasterii" type="text" class="form-control"/>
					</div>
					<div class="form-group">
						<label>Numar matricol</label>
						<form:input path="numarMatricol" type="text" class="form-control"/>
					</div>
					<div class="form-group">
						<label>CNP</label>
						<form:input path="codNumericPersonal" type="text" class="form-control"/>
					</div>
					<div class="form-group">
						<label>Anul inmatricularii</label>
						<form:input path="anulInmatricularii" type="text" class="form-control"/>
					</div>
				</div>
			</div>
			<input type="submit" class="btn btn-primary" name="next" value="Next">
			<input type="submit" class="btn btn-success" name="save" value="Save">
		</form:form>
	</div>
<%@ include file="common/footer.jspf" %>