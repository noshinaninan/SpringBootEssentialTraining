package com.noshinaninan.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noshinaninan.demo.models.StaffMember;
import com.noshinaninan.demo.services.StaffService;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {
	 private final StaffService staffService;
	 

	    public StaffRestController(StaffService staffService) {
		this.staffService = staffService;
	}

	    @GetMapping
	    public List<StaffMember> getAllStaff(){
	        return staffService.getAllStaff();
	    }

}
