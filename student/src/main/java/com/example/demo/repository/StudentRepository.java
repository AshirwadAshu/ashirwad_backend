package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.StudentInfo;

public interface StudentRepository extends MongoRepository<StudentInfo, String> {

	Optional<StudentInfo> findByEmail(String email);

}
