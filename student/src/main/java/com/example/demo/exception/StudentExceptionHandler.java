package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.constant.ApplicationConstant;
import com.example.demo.response.Response;

@RestControllerAdvice
public class StudentExceptionHandler {

	@ExceptionHandler(StudentException.class)
	public ResponseEntity<Response<String>> studentNotFound(RuntimeException exp) {
		return ResponseEntity.status(HttpStatus.OK).body(Response.<String>builder().data(null).isError(true)
				.messeage(ApplicationConstant.STUDENT_NOT_FOUND).build());

	}

}
