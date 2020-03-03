package ro.emanuel.dsgenerator.model;

import java.sql.Date;

public class Student {
	private Integer id;
	private String username;
	private String nume;
	private String numeFamilieDupaCasatorie;
	private String initialaTatalui;
	private String prenume;
	private Date dataNasterii;
	private String loculNasterii;
	private int numarMatricol;
	private String codNumericPersonal;
	private int anulInmatricularii;
	private String denumireaCalificarii;
	private String domeniuStudii;
	private String programStudii;
	private String numeInstitutie;
	private String facultate;
	private String institutieDiferita;
	private String facultateDiferita;
	private String limbaStudiu;

	public Student() {
	}

	public Student(Integer id, String username, String nume, String numeFamilieDupaCasatorie, String initialaTatalui, String prenume, Date dataNasterii, String loculNasterii, int numarMatricol, String codNumericPersonal, int anulInmatricularii, String denumireaCalificarii, String domeniuStudii, String programStudii, String numeInstitutie, String facultate, String institutieDiferita, String facultateDiferita, String limbaStudiu) {
		this.id = id;
		this.username = username;
		this.nume = nume;
		this.numeFamilieDupaCasatorie = numeFamilieDupaCasatorie;
		this.initialaTatalui = initialaTatalui;
		this.prenume = prenume;
		this.dataNasterii = dataNasterii;
		this.loculNasterii = loculNasterii;
		this.numarMatricol = numarMatricol;
		this.codNumericPersonal = codNumericPersonal;
		this.anulInmatricularii = anulInmatricularii;
		this.denumireaCalificarii = denumireaCalificarii;
		this.domeniuStudii = domeniuStudii;
		this.programStudii = programStudii;
		this.numeInstitutie = numeInstitutie;
		this.facultate = facultate;
		this.institutieDiferita = institutieDiferita;
		this.facultateDiferita = facultateDiferita;
		this.limbaStudiu = limbaStudiu;
	}

	public Student(String username, String nume, String numeFamilieDupaCasatorie, String initialaTatalui, String prenume, Date dataNasterii, String loculNasterii, int numarMatricol, String codNumericPersonal, int anulInmatricularii, String denumireaCalificarii, String domeniuStudii, String programStudii, String numeInstitutie, String facultate, String institutieDiferita, String facultateDiferita, String limbaStudiu) {
		this.username = username;
		this.nume = nume;
		this.numeFamilieDupaCasatorie = numeFamilieDupaCasatorie;
		this.initialaTatalui = initialaTatalui;
		this.prenume = prenume;
		this.dataNasterii = dataNasterii;
		this.loculNasterii = loculNasterii;
		this.numarMatricol = numarMatricol;
		this.codNumericPersonal = codNumericPersonal;
		this.anulInmatricularii = anulInmatricularii;
		this.denumireaCalificarii = denumireaCalificarii;
		this.domeniuStudii = domeniuStudii;
		this.programStudii = programStudii;
		this.numeInstitutie = numeInstitutie;
		this.facultate = facultate;
		this.institutieDiferita = institutieDiferita;
		this.facultateDiferita = facultateDiferita;
		this.limbaStudiu = limbaStudiu;
	}

	public Student(String denumireaCalificarii) {
		this.denumireaCalificarii = denumireaCalificarii;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getNumeFamilieDupaCasatorie() {
		return numeFamilieDupaCasatorie;
	}

	public void setNumeFamilieDupaCasatorie(String numeFamilieDupaCasatorie) {
		this.numeFamilieDupaCasatorie = numeFamilieDupaCasatorie;
	}

	public String getInitialaTatalui() {
		return initialaTatalui;
	}

	public void setInitialaTatalui(String initialaTatalui) {
		this.initialaTatalui = initialaTatalui;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public Date getDataNasterii() {
		return dataNasterii;
	}

	public void setDataNasterii(Date dataNasterii) {
		this.dataNasterii = dataNasterii;
	}

	public String getLoculNasterii() {
		return loculNasterii;
	}

	public void setLoculNasterii(String loculNasterii) {
		this.loculNasterii = loculNasterii;
	}

	public int getNumarMatricol() {
		return numarMatricol;
	}

	public void setNumarMatricol(int numarMatricol) {
		this.numarMatricol = numarMatricol;
	}

	public String getCodNumericPersonal() {
		return codNumericPersonal;
	}

	public void setCodNumericPersonal(String codNumericPersonal) {
		this.codNumericPersonal = codNumericPersonal;
	}

	public int getAnulInmatricularii() {
		return anulInmatricularii;
	}

	public void setAnulInmatricularii(int anulInmatricularii) {
		this.anulInmatricularii = anulInmatricularii;
	}

	public String getDenumireaCalificarii() {
		return denumireaCalificarii;
	}

	public void setDenumireaCalificarii(String denumireaCalificarii) {
		this.denumireaCalificarii = denumireaCalificarii;
	}

	public String getDomeniuStudii() {
		return domeniuStudii;
	}

	public void setDomeniuStudii(String domeniuStudii) {
		this.domeniuStudii = domeniuStudii;
	}

	public String getProgramStudii() {
		return programStudii;
	}

	public void setProgramStudii(String programStudii) {
		this.programStudii = programStudii;
	}

	public String getNumeInstitutie() {
		return numeInstitutie;
	}

	public void setNumeInstitutie(String numeInstitutie) {
		this.numeInstitutie = numeInstitutie;
	}

	public String getFacultate() {
		return facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public String getInstitutieDiferita() {
		return institutieDiferita;
	}

	public void setInstitutieDiferita(String institutieDiferita) {
		this.institutieDiferita = institutieDiferita;
	}

	public String getFacultateDiferita() {
		return facultateDiferita;
	}

	public void setFacultateDiferita(String facultateDiferita) {
		this.facultateDiferita = facultateDiferita;
	}

	public String getLimbaStudiu() {
		return limbaStudiu;
	}

	public void setLimbaStudiu(String limbaStudiu) {
		this.limbaStudiu = limbaStudiu;
	}
}
