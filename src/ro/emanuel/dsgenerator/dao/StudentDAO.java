package ro.emanuel.dsgenerator.dao;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.util.List;

import ro.emanuel.dsgenerator.model.Student;

public interface StudentDAO {

	int saveIntoGeneralList(Student student);

	int createUser(String username, String password, String authority);

	int addAuthority(String username, String authority);

	int save2(Student student);
	
	int update(Student student);
	
	Student get (int id);

	int count(String specializare, int an);

	int retrieveRank(String username, String specializare, int an);
	
	int delete(int id);
	
	List<Student> list();

	List<Student> groupList(String specializare, int an);

	List<Student> listOneRecord(String user);
}
