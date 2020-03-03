package ro.emanuel.dsgenerator.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ro.emanuel.dsgenerator.dao.MetadataDAO;
import ro.emanuel.dsgenerator.dao.StudentDAO;
import ro.emanuel.dsgenerator.model.*;


import static java.lang.Integer.*;


@Controller
public class MainController {
	
	@Autowired
	private MetadataDAO metadataDAO;

	@Autowired
	private StudentDAO studentDAO;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		model.addAttribute("name", retrieveLoggedInUserName());
		return "index";
	}

	@RequestMapping(value = "/student-list", method = RequestMethod.GET)
	public ModelAndView studentList(ModelAndView model) {
		List<Student> listStudent = studentDAO.list();
		model.addObject("listStudent", listStudent);
		model.setViewName("student-list");
		return model;
	}

	@RequestMapping(value = "/my-record", method = RequestMethod.GET)
	public ModelAndView getRecord(ModelAndView model) {
		List<Student> listStudent = studentDAO.listOneRecord(retrieveLoggedInUserName());
		model.addObject("listStudent", listStudent);
		model.setViewName("student-list");
		return model;
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newStudent(ModelAndView model) {
		Student newStudent = new Student();
		model.addObject("student", newStudent);
		model.setViewName("student_form_new");
		return model;
	}

	@RequestMapping(value = "/savenew", method = RequestMethod.POST)
	public ModelAndView saveNewStudent(@ModelAttribute Student student) {
		studentDAO.saveIntoGeneralList(student);
		return new ModelAndView("redirect:/student-list");
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST, params = "next")
	public ModelAndView nextStudent(@ModelAttribute Student student, HttpServletRequest request) {
		studentDAO.update(student);
		int id = parseInt(request.getParameter("id"));
		Student studentObject = studentDAO.get(id);
		ModelAndView model = new ModelAndView("student_form2");
		model.addObject("student", studentObject);
		return model;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST, params = "save")
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		studentDAO.update(student);
		return new ModelAndView("redirect:/student-list");
	}

	@RequestMapping(value = "/save2", method = RequestMethod.POST)
	public ModelAndView saveStudent2(@ModelAttribute Student student) {
		studentDAO.save2(student);
		return new ModelAndView("redirect:/student-list");
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editStudent(HttpServletRequest request) {
		int id = parseInt(request.getParameter("id"));
		Student student = studentDAO.get(id);
		ModelAndView model = new ModelAndView("student_form");
		model.addObject("student", student);
		return model;
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteStudent(@RequestParam Integer id) {
		studentDAO.delete(id);
		return new ModelAndView("redirect:/student-list");
	}

	@RequestMapping(value = "/create-user", method = RequestMethod.GET)
	public ModelAndView createUser(@ModelAttribute User user) {
		ModelAndView model = new ModelAndView("create-user");
		model.addObject("user", user);
		return model;
	}

	@RequestMapping(value = "/create-user", method = RequestMethod.POST)
	public ModelAndView createNewUser(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String authority = request.getParameter("authority");
		studentDAO.createUser(username, password, authority);
		return new ModelAndView("redirect:/student-list");
	}

	@RequestMapping(value = "/group-list", method = RequestMethod.GET)
	public ModelAndView listByGroup(@ModelAttribute Department department) {
		ModelAndView model = new ModelAndView("group-list");
		model.addObject("department", department);
		return model;
	}

	@RequestMapping(value = "/group-list", method = RequestMethod.POST)
	public ModelAndView listGroup(HttpServletRequest request, ModelAndView model) {
		String specializare = request.getParameter("specializare");
		int an = parseInt(request.getParameter("an"));
		List<Student> listStudent = studentDAO.groupList(specializare, an);
		model.setViewName("student-list");
		model.addObject("listStudent", listStudent);
		return model;
	}
	
	@RequestMapping(value = "/generate", method = RequestMethod.GET)
	public ModelAndView generateSupplement(HttpServletRequest request) {
		int id = parseInt(request.getParameter("id"));
		Student student = studentDAO.get(id);
		Metadata metadata = metadataDAO.get(1);
		int numarStudenti = studentDAO.count(student.getDenumireaCalificarii(), student.getAnulInmatricularii());
		int rank = studentDAO.retrieveRank(student.getUsername(), student.getDenumireaCalificarii(), student.getAnulInmatricularii());
		String viewname = "supplement-" + request.getParameter("specializare");
		ModelAndView model = new ModelAndView(viewname);
		model.addObject("student", student);
		model.addObject("metadata", metadata);
		model.addObject("rank", rank);
		model.addObject("numar", numarStudenti);
		return model;
	}

	private String retrieveLoggedInUserName() {
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		if (principal instanceof UserDetails)
			return ((UserDetails) principal).getUsername();
		return principal.toString();
	}
}
