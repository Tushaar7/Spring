package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import Model.Student;
import Service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "studPage.htm")
	public String getPage(ModelMap modelMap){
		modelMap.addAttribute("student",new Student());
		return "register";
	}
	
	@RequestMapping(value="saveStudent")
	public String saveStudentRegister(ModelMap modelMap, @ModelAttribute(value="student") Student student){
		
		Boolean result = studentService.add(student);
		
		if(result == false){
			modelMap.addAttribute("msg","save Successfully");
		}else{
			modelMap.addAttribute("msg","Not save");
		}
		return "register";
	}
	
}
