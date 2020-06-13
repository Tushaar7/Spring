package controller;

import java.util.ArrayList;
import java.util.List;

import model.Address;
import model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import service.Iservice;

@Controller
public class MyController {
	
	@Autowired
	Iservice iService;
	
	@RequestMapping(value="/index")
	public String redirect(Model model){
		
		List<Address> addresses = new ArrayList<Address>();
		addresses.add(new Address());
		Student student = new Student();
		student.setAddresses(addresses);
		
		model.addAttribute("studentForm", student);
		return "welcome";
	}
	
	@RequestMapping(value="/insert")
	public String insertform(@ModelAttribute Student student, Model model){
		
		Student student2 = new Student();
		
		if(student.getId()==0){
			student2.setName(student.getName());
			student2.setMobile(student.getMobile());
			
			List<Address> list = new ArrayList<Address>();
			List<Address> alist = student.getAddresses();
			
			for(Address address:alist){
				Address address2 = new Address();
				address2.setAddress(address.getAddress());
				address2.setStudent(student2);
				list.add(address2);
			}
			
			student2.setAddresses(list);
		}
		
		else{
			
			student2.setId(student.getId());
			student2.setName(student.getName());
			student2.setMobile(student.getMobile());
			List<Address>list = new ArrayList<Address>();
			
			List<Address> alist = student.getAddresses();
			
			for(Address address:alist){
				Address address2 = new Address();
				address2.setAid(address.getAid());
				address2.setAddress(address.getAddress());
				address2.setStudent(student2);
				list.add(address2);
			}
			student2.setAddresses(list);
		}
		
		iService.addStudent(student2);
		
		List<Address> addresses = new ArrayList<Address>();
		addresses.add(new Address());
		addresses.add(new Address());
		
		Student student3 = new Student();
		student3.setAddresses(addresses);
		
		model.addAttribute("studentForm", student3);
		model.addAttribute("studentFormList", iService.getStudentList());
		return "welcome";
	}
	
	@ModelAttribute("studentFormList")
	public List<Student>getStudentList(){
		return iService.getStudentList();
	}
	
	@RequestMapping(value="/edit")
	public String Edit(@ModelAttribute Student student, Model model){
		Student student2 = iService.editStudent(student.getId());
		System.out.println("std---------------"+student2);
		model.addAttribute("studentForm",student2);
		return "welcome";
	}
	
	@RequestMapping(value="/delete")
	public String delete(@ModelAttribute Student student, Model model){
		Student student2 = iService.DeleteStudent(student.getId());
		model.addAttribute("studentForm",new Student());
		model.addAttribute("studentFormList",iService.getStudentList());
		return "welcome";
	}
}
