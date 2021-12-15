package com.mappingProject.Mappingproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mappingProject.Mappingproject.entity.StudentAddress;
import com.mappingProject.Mappingproject.entity.studentnfo;
import com.mappingProject.Mappingproject.services.StudentInfo;

@RestController
public class PersistenceController {
	@Autowired
	private StudentInfo infoStudent;
		
	@PostMapping("/student/update-profile")
	public studentnfo updateStudent(@RequestBody studentnfo data) {
		return this.infoStudent.StudentUpdate(data);
	}
	
//	@DeleteMapping("/student/delete/{id}")
//	public void deleteStudent(@PathVariable String id) {
//		 this.infoStudent.StudentDelete(Long.parseLong(id));
//	}
	
	@PostMapping("/student/address")
	public StudentAddress updateAddress(@RequestBody StudentAddress address) {
		return this.infoStudent.addressUpdate(address);
	}
	
//	Request method 'DELETE' not supported]
	@DeleteMapping("/student/delete/{id}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String id){
		try {
			this.infoStudent.StudentDelete(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
