<%@ include file="common/header.jspf" %>
<section class="header">
	<div class="text-align-center">
		<h1>Supliment pentru management</h1>
		<h2 class="bold">${metadata.country}</h2>
		<h4 class="bold">${metadata.ministerRomana}</h4>
		<h4 class="italic-text less-font-weight">${metadata.ministerEngleza}</h4>
		<h4 class="top-bottom-paddings">${metadata.numeInstitutie}<sup>1)</sup></h4>
		<h4 class="less-font-weight">${metadata.numeDocument}</h4>
		<h4 class="italic-text less-font-weight">${metadata.numeDocumentEngleza}</h4>
	</div>
	<div class="serie-wrap">
		<div class="give-me-width"></div>
		<div class="serie-diploma">
			<p><sup>2)</sup>Acest supliment &#238nsoteste diploma</p>
			<div class="display-flex">
				<p>cu seria</p><p class="serial-number">45</p><p>nr.</p><p>10</p>
			</div>
			<p>The Supplement is for diploma</p>
			<div class="display-flex">
				<p>series</p><p class="serial-number">67</p><p>no.</p><p>10</p>
			</div>
		</div>
	</div>
</section>
<section class="data-section-1">
	<div class="container">
		<div class="text-align-center">
			<h4>1. DATE DE IDENTIFICARE A TITULARULUI DIPLOMEI</h4>
			<h4 class="italic-text">INFORMATION IDENTIFYING THE HOLDER OF THE DIPLOMA</h4>
		</div>
		<div class="my-row">
			<div class="column-half">
				<p>Nume de familie la nastere</p>
				<p class="italic-text">Family name at birth</p>
				<div class="numeric-fields">
					<p>1.1a</p>
					<p class="field">${student.nume}</p>
				</div>
				<p>Initiala (initialele) prenumelui (prenumelor) tatalui/mamei</p>
				<p class="italic-text">Initial(s) of father's/mother's first name(s)</p>
				<div class="numeric-fields">
					<p>1.2a</p>
					<p class="field">${student.initialaTatalui}</p>
				</div>
				<p>Data nasterii (anul/luna/ziua)</p>
				<p class="italic-text">Date of birth (year/month/day)</p>
				<div class="numeric-fields">
					<p>1.3a</p>
					<p class="field-dob field-dob-first">${student.dataNasterii}</p>
					<p class="field-dob">${student.dataNasterii.month + 1}</p>
					<p class="field-dob">${student.dataNasterii.day - 4}</p>
				</div>
			</div>
			<div class="column-half">
				<p>Nume de familie dupa casatorie (daca este cazul)</p>
				<p class="italic-text">Family name(s) (after marriage) (if applicable)</p>
				<div class="numeric-fields">
					<p>1.1b</p>
					<p class="field">${student.numeFamilieDupaCasatorie}</p>
				</div>
				<p>Prenumele</p>
				<p class="italic-text">First name(s)</p>
				<div class="numeric-fields">
					<p>1.1b</p>
					<p class="field">${student.prenume}</p>
				</div>
				<p>Locul nasterii (localitatea, judetul/sectorul, tara)</p>
				<p class="italic-text">Place of birth</p>
				<div class="numeric-fields">
					<p>1.3b</p>
					<p class="field">${student.loculNasterii}</p>
				</div>
			</div>
		</div>
		<div class="my-row last-row">
			<div class="column-small">
				<p>Numarul matricol</p>
				<p class="italic-text">Student enrolment number</p>
				<div class="numeric-fields">
					<p class="numbering">1.4</p>
					<p class="field no-margin">${student.numarMatricol}</p>
				</div>
			</div>
			<div class="column-large">
				<p>Codul numeric personal (CNP)</p>
				<p class="italic-text">Personal identification number</p>
				<div class="numeric-fields">
					<p class="field">${student.codNumericPersonal}</p>
				</div>
			</div>
			<div class="column-small">
				<p>Anul inmatricularii</p>
				<p class="italic-text">Year of enrollment</p>
				<div class="numeric-fields">
					<p>1.5</p>
					<p class="field">${student.anulInmatricularii}</p>
				</div>
			</div>
		</div>
	</div>
</section>
<section class="data-section-2">
	<div class="container">
		<div class="text-align-center">
			<h4>2. INFORMAȚII PRIVIND CALIFICAREA</h4>
			<h4 class="italic-text">INFORMATION IDENTIFYING THE QUALIFICATION</h4>
		</div>
		<div class="my-row single-row">
			<p class="needs-padding">Denumirea calificării și (dacă este cazul) titlul acordat (după promovarea examenului de finalizare a studiilor)</p>
			<p class="italic-text needs-padding">Name of qualification and (if applicable) title awarded (after passing the final examination)</p>
			<div class="numeric-fields all-space">
				<p class="numbering">2.1</p>
				<p class="field">${student.denumireaCalificarii}</p>
			</div>
		</div>
		<div class="my-row">
			<div class="column-half">
				<p>Domeniul de studii</p>
				<p class="italic-text">Field of study</p>
				<div class="numeric-fields">
					<p class="numbering">2.2</p>
					<p class="field">Teologie<br/>Theologie</p>
				</div>
				<p>Numele ?i statutul institu?iei de înv???mânt superior care elibereaz? diploma (în limba român?)</p>
				<p class="italic-text">Name and status of awarding institution</p>
				<div class="numeric-fields">
					<p>2.3a</p>
					<p class="field">Universitatea Emanuel din Oradea, universitate privat? acreditat? <br/>
						Emanuel University of Oradea, accredited private university</p>
				</div>
				<p>Numele ?i statutul institu?iei de înv???mânt superior care a asigurat ?colarizarea (dac? difer? de 2.3a, în limba român?)</p>
				<p class="italic-text">Name and status of institution administering studies <br/> (if different from 2.3a)
				</p>
				<div class="numeric-fields">
					<p>2.4a</p>
					<p class="field"></p>
				</div>
			</div>
			<div class="column-half">
				<p>Programul de studii</p>
				<p class="italic-text">Programme of study</p>
				<div class="numeric-fields">
					<p>2.2b</p>
					<p class="field">Teologie baptist? pastoral? <br/> Pastoral Baptist Theology</p>
				</div>
				<p>Facultatea care organizeaz? examenul de care elibereaz? diploma (în limba român?) finalizare a studiilor</p>
				<p class="italic-text">Faculty administering the final examination</p>
				<div class="numeric-fields">
					<p>2.3b</p>
					<p class="field field-more-height">Facultatea de Teologie <br/> Faculty of Theology</p>
				</div>
				<p>Facultatea care a asigurat ?colarizarea <br/> (dac? difer? de 2.3b)</p>
				<p class="italic-text">Faculty administering studies <br/> (if different from 2.3b)</p>
				<div class="numeric-fields">
					<p>2.4b</p>
					<p class="field"></p>
				</div>
			</div>
		</div>
		<div class="my-row single-row">
			<p class="needs-padding">Limba (limbile) de studiu/examinare</p>
			<p class="italic-text needs-padding">Language(s) of instruction/examination</p>
			<div class="numeric-fields all-space">
				<p class="numbering">2.5</p>
				<p class="field">Român? <br/> Romanian</p>
			</div>
		</div>
	</div>
</section>
<%@ include file="common/footer.jspf" %>