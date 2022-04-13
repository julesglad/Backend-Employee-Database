package com.example.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.app.BuildingRepository.BuildingRepository;
import com.example.app.model.BuildingAssignments;

@Service
public interface AssignmentService {
	
	public static final BuildingRepository buildingrepo = null;

	
	List<BuildingAssignments> listAssignments();
	
	public static void SaveBuildingAssignment(BuildingAssignments buildassign) {
		buildingrepo.save(buildassign);
		}

	public static Object SaveBuildingAssignment() {
		// TODO Auto-generated method stub
		return null;
	}
}	


