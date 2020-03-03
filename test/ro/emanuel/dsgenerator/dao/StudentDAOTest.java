package ro.emanuel.dsgenerator.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import ro.emanuel.dsgenerator.model.Student;

class StudentDAOTest {

	private DriverManagerDataSource dataSource;
	private StudentDAO dao;
	
	@BeforeEach
	void setupBeforeEach() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/ds-generator");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		
		dao = new StudentDAOImpl(dataSource);
	}
	
	@Test
	void testSave() {
		Student student = new Student("Saron", "saronistu@gmail.com", "Nufarului 87", "0765651965");
		int result = dao.save(student);
		
		assertTrue(result > 0);
	}

	@Test
	void testUpdate() {
		Student student = new Student(2, "Marius", "marius@gmail.com", "Nufarului 87", "0724534675");
		int result = dao.update(student);
		
		assertTrue(result > 0);
	}

	@Test
	void testGet() {
		int id = 3;
		Student student = dao.get(id);
		if (student != null) {
			System.out.println(student.toString());
		}
		assertNotNull(student);
	}

	@Test
	void testDelete() {
		int id = 3;
		int result = dao.delete(id);
		assertTrue(result > 0);
	}

	@Test
	void testList() {
		List<Student> listStudent = dao.list();
		for (Student s : listStudent) {
			System.out.println(s);
		}
		assertTrue(!listStudent.isEmpty());
	}

}
