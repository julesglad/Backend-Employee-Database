package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.app.BuildingRepository.BuildingRepository;
import com.example.app.model.BuildingAssignments;
//import com.example.app.service.AssignmentService;
import com.example.app.service.EmployeeService;


@Controller
public class BuildingAssignmentController {

	@Autowired
	private BuildingRepository buildingrepo;
	
	@Autowired
	private EmployeeService employeeService;

	
	//assign building locations
	@GetMapping("/assign")
	public String viewAssignPage(Model model) {
		model.addAttribute("listEmployees", employeeService.getAllEmployees());
		model.addAttribute("BuildingAssignments", new BuildingAssignments());
		//model.addAttribute("assignbuildings", AssignmentService.listAssignments());
		return "assignloc";
		
	}
	
	@RequestMapping(value = "/assign", method = RequestMethod.PUT) 
	public String givebuildingassignmentinfo(Model model){
	model.addAttribute("BuildingAssignments", new BuildingAssignments());
	return "assignloc";
	}
	
	
	@RequestMapping(value = "/assign/save/")
	@ResponseBody
	public String saveData(BuildingAssignments buildingassignments) {
		buildingrepo.save(buildingassignments);
		return "redirect:/assign";
	
	
	
//	@GetMapping(value = "/assign")
//	public String assignEmployee(Model model) {
//		Assignment assignment = new Assignment();
//		model.addAttribute("assignment", assignment);
//		return "assignloc";
//		}
	
	//@RequestMapping(value = "/assign/save", method = {RequestMethod.POST}, consumes = {"application/x-www-form-urlencoded;charset=UTF-8"})
	//public String saveBuilding(@RequestBody BuildingAssignments BuildingAssignments) {
		//save assignment to database
		//BuildingAssignments dest =BuildingRepository.saveAndFlush(BuildingAssignments);
		//return dest + "redirect:/assign/save/";
		//return "redirect:/assign";
		}

	
	//@RequestMapping(value = "assign/save/", method = RequestMethod.POST)
	//public String save(BuildingAssignments post) {
	//	BuildingAssignments savedassignment = BuildingRepository.save(BuildingAssignments);
	//return "redirect:/assign";
	//}
	
	
}
