package ro.emanuel.dsgenerator.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import ro.emanuel.dsgenerator.model.Student;

public class StudentDAOImpl implements StudentDAO {

	private JdbcTemplate jdbcTemplate;
	
	public StudentDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int saveIntoGeneralList(Student s) {
		String sql = "INSERT INTO student (username, nume, prenume) VALUES (?, ?, ?)";
		return jdbcTemplate.update(sql, s.getUsername(), s.getNume(), s.getPrenume());
	}

	@Override
	public int createUser(String username, String password, String authority) {
		String sql = "INSERT INTO users (username, password) VALUES ('" + username + "', '" + password +"')";
		addAuthority(username, authority);
		return jdbcTemplate.update(sql);
	}

	@Override
	public int addAuthority(String username, String authority) {
		String sql = "INSERT INTO authorities (username, authority) VALUES ('" + username + "', '" + authority + "')";
		return jdbcTemplate.update(sql);
	}

	@Override
	public int save2(Student s) {
		String sql = "UPDATE student SET denumirea_calificarii=?, domeniu_studii=?, program_studii=?, nume_institutie=?, facultate=?, institutie_diferita=?, facultate_diferita=?, limba_studiu=? WHERE id_student=?";
		return jdbcTemplate.update(sql, s.getDenumireaCalificarii(), s.getDomeniuStudii(), s.getProgramStudii(), s.getNumeInstitutie(), s.getFacultate(), s.getInstitutieDiferita(), s.getFacultateDiferita(), s.getLimbaStudiu(), s.getId());
	}

	@Override
	public int update(Student s) {
		String sql = "UPDATE student SET nume=?, nume_familie_dupa_casatorie=?, initiala_tatalui_mamei=?, prenume=?, data_nasterii=?, locul_nasterii=?, numar_matricol=?, cod_numeric_personal=?, anul_inmatricularii=? WHERE id_student=?";
		return jdbcTemplate.update(sql, s.getNume(), s.getNumeFamilieDupaCasatorie(), s.getInitialaTatalui(), s.getPrenume(), s.getDataNasterii(), s.getLoculNasterii(), s.getNumarMatricol(), s.getCodNumericPersonal(), s.getAnulInmatricularii(), s.getId());
	}

	@Override
	public Student get(int id) {
		String sql = "SELECT * FROM student WHERE id_student=" + id;
		ResultSetExtractor<Student> extractor = new ResultSetExtractor<Student>() {
			@Override
			public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					String username = rs.getString("username");
					String nume = rs.getString("nume");
					String numeFamilieDupaCasatorie = rs.getString("nume_familie_dupa_casatorie");
					String initialaTataluiMamei = rs.getString("initiala_tatalui_mamei");
					String prenume = rs.getString("prenume");
					Date dataNasterii = rs.getDate("data_nasterii");
					String loculNasterii = rs.getString("locul_nasterii");
					int numarMatricol = rs.getInt("numar_matricol");
					String codNumericPersonal = rs.getString("cod_numeric_personal");
					int anulInmatricularii = rs.getInt("anul_inmatricularii");
					String denumireaCalificarii = rs.getString("denumirea_calificarii");
					String domeniuStudii = rs.getString("domeniu_studii");
					String programStudii = rs.getString("program_studii");
					String numeInstitutie = rs.getString("nume_institutie");
					String facultate = rs.getString("facultate");
					String institutieDiferita = rs.getString("institutie_diferita");
					String facultateDiferita = rs.getString("facultate_diferita");
					String limbaStudiu = rs.getString("limba_studiu");
					return new Student(id, username, nume, numeFamilieDupaCasatorie, initialaTataluiMamei, prenume, dataNasterii, loculNasterii, numarMatricol, codNumericPersonal, anulInmatricularii, denumireaCalificarii, domeniuStudii, programStudii, numeInstitutie, facultate, institutieDiferita, facultateDiferita, limbaStudiu);
				}
				return null;
			}
		};
		return jdbcTemplate.query(sql, extractor);
	}

	@Override
	public int count(String specializare, int an) {
		String sql = "SELECT COUNT(id_student) FROM student WHERE denumirea_calificarii = '" + specializare + "' AND anul_inmatricularii = " + an;
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}

	@Override
	public int retrieveRank(String username, String specializare, int an) {
		String sql = "SELECT rank FROM (SELECT @rank:=@rank+1 AS rank, username FROM student, (SELECT @rank := 0) r WHERE denumirea_calificarii = '" + specializare + "' AND anul_inmatricularii = " + an + " ORDER BY medie DESC) t WHERE username = '"+ username + "'";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}

	@Override
	public int delete(int id) {
		String sql = ("DELETE FROM student WHERE id_student=" + id);
		return jdbcTemplate.update(sql);
	}

	@Override
	public List<Student> list() {
		String sql = "SELECT * FROM student ORDER BY id_student DESC";
		RowMapper<Student> rowMapper = new RowMapper<>() {
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				int id = rs.getInt("id_student");
				String username = rs.getString("username");
				String nume = rs.getString("nume");
				String numeFamilieDupaCasatorie = rs.getString("nume_familie_dupa_casatorie");
				String initialaTataluiMamei = rs.getString("initiala_tatalui_mamei");
				String prenume = rs.getString("prenume");
				Date dataNasterii = rs.getDate("data_nasterii");
				String loculNasterii = rs.getString("locul_nasterii");
				int numarMatricol = rs.getInt("numar_matricol");
				String codNumericPersonal = rs.getString("cod_numeric_personal");
				int anulInmatricularii = rs.getInt("anul_inmatricularii");
				String denumireaCalificarii = rs.getString("denumirea_calificarii");
				String domeniuStudii = rs.getString("domeniu_studii");
				String programStudii = rs.getString("program_studii");
				String numeInstitutie = rs.getString("nume_institutie");
				String facultate = rs.getString("facultate");
				String institutieDiferita = rs.getString("institutie_diferita");
				String facultateDiferita = rs.getString("facultate_diferita");
				String limbaStudiu = rs.getString("limba_studiu");
				return new Student(id, username, nume, numeFamilieDupaCasatorie, initialaTataluiMamei, prenume, dataNasterii, loculNasterii, numarMatricol, codNumericPersonal, anulInmatricularii, denumireaCalificarii, domeniuStudii, programStudii, numeInstitutie, facultate, institutieDiferita, facultateDiferita, limbaStudiu);
			}
		};
		return jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public List<Student> groupList(String specializare, int an) {
		String sql = "SELECT * FROM student WHERE denumirea_calificarii = '" + specializare + "' AND anul_inmatricularii = " + an;
		RowMapper<Student> rowMapper = new RowMapper<Student>() {
			@Override
			public Student mapRow (ResultSet rs, int rowNum) throws SQLException {
				int id = rs.getInt("id_student");
				String username = rs.getString("username");
				String nume = rs.getString("nume");
				String numeFamilieDupaCasatorie = rs.getString("nume_familie_dupa_casatorie");
				String initialaTataluiMamei = rs.getString("initiala_tatalui_mamei");
				String prenume = rs.getString("prenume");
				Date dataNasterii = rs.getDate("data_nasterii");
				String loculNasterii = rs.getString("locul_nasterii");
				int numarMatricol = rs.getInt("numar_matricol");
				String codNumericPersonal = rs.getString("cod_numeric_personal");
				int anulInmatricularii = rs.getInt("anul_inmatricularii");
				String denumireaCalificarii = rs.getString("denumirea_calificarii");
				String domeniuStudii = rs.getString("domeniu_studii");
				String programStudii = rs.getString("program_studii");
				String numeInstitutie = rs.getString("nume_institutie");
				String facultate = rs.getString("facultate");
				String institutieDiferita = rs.getString("institutie_diferita");
				String facultateDiferita = rs.getString("facultate_diferita");
				String limbaStudiu = rs.getString("limba_studiu");
				return new Student(id, username, nume, numeFamilieDupaCasatorie, initialaTataluiMamei, prenume, dataNasterii, loculNasterii, numarMatricol, codNumericPersonal, anulInmatricularii, denumireaCalificarii, domeniuStudii, programStudii, numeInstitutie, facultate, institutieDiferita, facultateDiferita, limbaStudiu);
			}
		};
		return jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public List<Student> listOneRecord(String name) {
		String sql = "SELECT * FROM student WHERE prenume='" + name + "'";
		RowMapper<Student> rowMapper = new RowMapper<Student>() {
			@Override
			public Student mapRow (ResultSet rs, int rowNum) throws SQLException {
				int id = rs.getInt("id_student");
				String username = rs.getString("username");
				String nume = rs.getString("nume");
				String numeFamilieDupaCasatorie = rs.getString("nume_familie_dupa_casatorie");
				String initialaTataluiMamei = rs.getString("initiala_tatalui_mamei");
				String prenume = rs.getString("prenume");
				Date dataNasterii = rs.getDate("data_nasterii");
				String loculNasterii = rs.getString("locul_nasterii");
				int numarMatricol = rs.getInt("numar_matricol");
				String codNumericPersonal = rs.getString("cod_numeric_personal");
				int anulInmatricularii = rs.getInt("anul_inmatricularii");
				String denumireaCalificarii = rs.getString("denumirea_calificarii");
				String domeniuStudii = rs.getString("domeniu_studii");
				String programStudii = rs.getString("program_studii");
				String numeInstitutie = rs.getString("nume_institutie");
				String facultate = rs.getString("facultate");
				String institutieDiferita = rs.getString("institutie_diferita");
				String facultateDiferita = rs.getString("facultate_diferita");
				String limbaStudiu = rs.getString("limba_studiu");
				return new Student(id, username, nume, numeFamilieDupaCasatorie, initialaTataluiMamei, prenume, dataNasterii, loculNasterii, numarMatricol, codNumericPersonal, anulInmatricularii, denumireaCalificarii, domeniuStudii, programStudii, numeInstitutie, facultate, institutieDiferita, facultateDiferita, limbaStudiu);
			}
		};
		return jdbcTemplate.query(sql, rowMapper);
	}
}
