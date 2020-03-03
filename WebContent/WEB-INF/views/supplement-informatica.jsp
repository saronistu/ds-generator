<%@ include file="common/header.jspf" %>
<section class="header">
	<div class="text-align-center">
		<h2 class="bold">Studentul este pe locul ${rank} din ${numar}</h2>
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
<section class="data-section data-section-1">
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
<section class="data-section data-section-2">
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
<div class="container">
	<div class="my-row">
		<div class="container end-of-page">

		</div>
		<div class="container end-of-page">
			<p class="page-number">1</p>
		</div>
		<div class="container end-of-page">
			<p class="ls">L.S.</p>
		</div>
	</div>
</div>
<section class="data-section data-section-3">
	<div class="container">
		<div class="text-align-center">
			<h4>3. INFORMAȚII PRIVIND NIVELUL CALIFICĂRII</h4>
			<h4 class="italic-text">INFORMATION ON THE LEVEL OF THE QUALIFICATION</h4>
		</div>
		<div class="my-row">
			<div class="column-half">
				<p>Nivelul calificării</p><br/>
				<p class="italic-text">Level of qualification</p>
			</div>
			<div class="column-half">
				<p>Durata oficială a programului de studii și numărul de<br/>
					credite de studii transferabile (conform ECTS/SECT)</p>
				<p class="italic-text">Official length of the programme of study and<br/>
					number of ECTS/SECT credits</p>
			</div>
		</div>
		<div class="my-row">
			<div class="column-half">
				<div class="numeric-fields more-text-possible">
					<p class="numbering">3.1</p>
					<div class="field">
						<p>Studii universitare de licență nivel 6CEC, 6 EQF</p>
						<p class="italic-text">Bachelor Studies</p>
					</div>
				</div>
			</div>
			<div class="column-half">
				<div class="numeric-fields more-text-possible">
					<p>2.3a</p>
					<div class="field">
						<p>4 ani - 240 credite</p>
						<p>4 years - 240 credits</p>
					</div>

				</div>
			</div>
		</div>
		<div class="my-row single-row">
			<p class="needs-padding">Condițiile de admitere</p>
			<p class="italic-text needs-padding">Access requirement(s)</p>
			<div class="numeric-fields all-space">
				<p class="numbering">3.3</p>
				<div class="field">
					<p>diploma de bacalaureat + examen de admitere</p>
					<p class="italic-text">baccalaureate + admission exam</p>
				</div>
			</div>
		</div>
	</div>
</section>
<section class="data-section data-section-4">
	<div class="container">
		<div class="text-align-center">
			<h4>4. INFORMAȚII PRIVIND CURRICULUMUL ȘI REZULTATELE OBȚINUTE</h4>
			<h4 class="italic-text">INFORMATION ON THE CURRICULUM AND RESULTS GAINED</h4>
		</div>
		<div class="my-row single-row">
			<p class="needs-padding">Forma de învățământ</p>
			<p class="italic-text needs-padding">Mode of study</p>
			<div class="numeric-fields all-space">
				<p class="numbering">4.1</p>
				<div class="field">
					<p>învațământ cu frecvență</p>
					<p class="italic-text">full-time</p>
				</div>
			</div>
		</div>
		<div class="my-row single-row">
			<p class="needs-padding">Rezultatele învățării asigurate prin programul de studii</p>
			<p class="italic-text needs-padding">Learning outcomes of the study programme</p>
			<div class="numeric-fields all-space">
				<p class="numbering">4.2</p>
				<div class="field">
					<p class=" justify-text">Competențe biblică – cunoașterea și exegetarea textelor sacre din limbile originale, explicarea textelor creștine comunităților de credincioși și nu numai. Competența dogmatică – cunoașterea tradițiilor dogmatice proprii și nu numai în vederea unei corecte interpretări a Sfintei Scripturi. Competența teologică aplicată – aplicarea cunoștințelor din Scripturi și din tradiția dogmatică în comunitățile de credincioși evanghelici și nu numai. Abilitatea comunicațională de a mărturisi public coerent, consistent și consecvent credința, de a consilia credincioșii, de a conduce comunitățile de credincioși, bisericile din teritoriu și din diaspora.</p>
					<p class="italic-text">Biblical competence - exegesis and knowledge of the sacred texts in their original languages and their explanation to the communities of believers and beyond. Dogmatic competence - knowledge of the dogmatic traditions for a correct interpretation of Holy Scripture. Applied theological competence - applying knowledge of Scripture and the dogmatic tradition in evangelical communities and beyond. Communication ability to publicly express their faith, in a coherent and consequent waw, to advise the believers, to lead the community of believers, the churches from our country and in the Diaspora.</p></p>
				</div>
			</div>
		</div>
		<div class="my-row single-row">
			<p class="needs-padding">Detalii privind programul absolvit, calificativele/notele/creditele ECTS/SECT obținute (conform Registrului<br/>matricol al facultății, volumul nr. XII/2011)</p>
			<p class="italic-text needs-padding">Programme details and the individual grades / marks / ECTS/SECT credits obtained (according to Faculty Student<br/>Records, volume no. XII/2011)</p>
		</div>
		<div class="my-row single-row">
			<div class="numeric-fields all-space">
				<p class="numbering">4.2</p>
				<div class="field-for-table">
					<div class="div-table">
						<div class="table-body">
							<div class="table-row table-header">
								<div class="table-cell col1-header">Nr.<br/>No</div>
								<div class="table-cell col2-header">Denumirea disciplinei<br/>Subject</div>
								<div class="table-cell col3-header divided-cell">
									<div class="my-border-bottom">
										<p><sup>3)</sup>Total ore<br/>Number of<br/> hours</p>
									</div>
									<div class="two-cells">
										<div class="col3 nobold number-of-hours1">&nbsp;</div>
										<div class="col4 nobold number-of-hours2">28</div>
									</div>
								</div>
								<div class="table-cell col4-header divided-cell">
									<div class="my-border-bottom">
										<p>Nota/Grade</p>
									</div>
									<div class="two-cells">
										<div class="col3 nobold">
											<p>Sem I<br/><sup>1st</sup>sem</p>
										</div>
										<div class="col4 nobold">
											<p>Sem II<br/><sup>2nd</sup>sem</p>
										</div>
									</div>
								</div>
								<div class="table-cell col5-header divided-cell">
									<div class="my-border-bottom">
										<p>Nr. credite<br/>Number of<br/> ECTS/SECT credits</p>
									</div>
									<div class="two-cells">
										<div class="col3 nobold">
											<p>Sem I<br/><sup>1st</sup>sem</p>
										</div>
										<div class="col4 nobold">
											<p>Sem II<br/><sup>2nd</sup>sem</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="table-year">
						<p>Anul I (anul universitar: 2011/2012)</p>
						<p>1st year of study (2011/2012  academic year)</p>
					</div>
					<div class="div-table">
						<div class="table-body">
							<div class="table-row">
								<div class="table-cell col1">1</div>
								<div class="table-cell col2">
									<p>Metode de studiu biblic</p>
									<p>Bible Study Methods</p>
								</div>
								<div class="table-cell col3">&nbsp;</div>
								<div class="table-cell col4">28</div>
								<div class="table-cell col5">10</div>
								<div class="table-cell col6">&nbsp;</div>
								<div class="table-cell col7">2</div>
								<div class="table-cell col8">&nbsp;</div>
							</div>
							<div class="table-row">
								<div class="table-cell col1">2</div>
								<div class="table-cell col2">
									<p>Spiritualitate și viață creștină</p>
									<p>Christian Spirituality and Life</p>
								</div>
								<div class="table-cell col3">&nbsp;</div>
								<div class="table-cell col4">28</div>
								<div class="table-cell col5">10</div>
								<div class="table-cell col6">&nbsp;</div>
								<div class="table-cell col7">2</div>
								<div class="table-cell col8">&nbsp;</div>
							</div>
							<div class="table-row">
								<div class="table-cell col1">3</div>
								<div class="table-cell col2">
									<p>Introducere în Noul Testament</p>
									<p>Introduction to the New Testament</p>
								</div>
								<div class="table-cell col3">56</div>
								<div class="table-cell col4">56</div>
								<div class="table-cell col5">8</div>
								<div class="table-cell col6">10</div>
								<div class="table-cell col7">6</div>
								<div class="table-cell col8">6</div>
							</div>
							<div class="table-row">
								<div class="table-cell col1">4</div>
								<div class="table-cell col2">
									<p>Catehetica cultului creștin baptist</p>
									<p>Baptist Catechism</p>
								</div>
								<div class="table-cell col3">14</div>
								<div class="table-cell col4">28</div>
								<div class="table-cell col5">&nbsp;</div>
								<div class="table-cell col6">9</div>
								<div class="table-cell col7">&nbsp;</div>
								<div class="table-cell col8">4</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
<div class="container end-of-page">
	<p class="ls">L.S.</p>
	<p class="page-number">2</p>
</div>
<%@ include file="common/footer.jspf" %>