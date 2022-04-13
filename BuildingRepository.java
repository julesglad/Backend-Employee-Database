package com.example.app.BuildingRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.model.BuildingAssignments;

public interface BuildingRepository extends JpaRepository<BuildingAssignments, Long> {

}
