package com.example.project.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.project.entities.Technician;

@Repository
public interface TechnicianRepository extends MongoRepository<Technician, Integer>{

}
