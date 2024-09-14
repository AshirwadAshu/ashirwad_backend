package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StudentInfoDto;
import com.example.demo.entity.StudentInfo;
import com.example.demo.response.Response;
import com.example.demo.service.StudentService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/studentInfo")
@RestController
@CrossOrigin
@Validated
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/addStudent")
    public ResponseEntity<Response<Integer>> addStudent(@RequestBody @Valid StudentInfoDto dto) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(
                Response.<Integer>builder().data(studentService.saveStudent(dto))
                        .isError(false)
                        .messeage("Student insert Ssucessfully")
                        .build());
    }

    @GetMapping("/getStudent")
    public ResponseEntity<StudentInfoDto> getStudent(@RequestBody StudentInfoDto dto) {
        StudentInfoDto studDto = studentService.getAllStudent(dto);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(studDto);

    }

    @PutMapping("/updateStudent")
    public ResponseEntity<Response<Integer>> updateStudent(@RequestBody StudentInfoDto dto) {
        Integer dto2 = studentService.updateStudent(dto);
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body(Response.<Integer>builder().data(dto2).isError(false).messeage("Sucussefully modified").build());
    }

    @GetMapping("getAll")
    public ResponseEntity<Response<Object>> getAllStudents() {
        return ResponseEntity.status(HttpStatus.OK).body(Response.builder()
                        .data(studentService.getAllStudents())
                        .isError(false)
                        .messeage("Successfully Fetched")
                .build());
    }
    
    @PostMapping("/login")
    public String login(@RequestBody StudentInfo student) {
    	return studentService.verify(student);
    }

}
