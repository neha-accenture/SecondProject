package com.mappingProject.Mappingproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mappingProject.Mappingproject.dao.StudentAddressDao;
import com.mappingProject.Mappingproject.dao.StudentDao;
import com.mappingProject.Mappingproject.entity.StudentAddress;
import com.mappingProject.Mappingproject.entity.studentnfo;

@Service
public class StudentInfoImpl implements StudentInfo {
	@Autowired
	private StudentDao studentdao;
	
	@Autowired
	private StudentAddressDao studentAddDao;
	
	@Override
	public studentnfo StudentUpdate(studentnfo data) {
		studentdao.save(data);
		return data;
	}

	@Override
	public void StudentDelete(long id) {
		studentnfo entity = studentdao.getOne(id);
		studentdao.delete(entity);
	}

	@Override
	public StudentAddress addressUpdate(StudentAddress address) {
		studentAddDao.save(address);
		return address;
	}

	
	
}
