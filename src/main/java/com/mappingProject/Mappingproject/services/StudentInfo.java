package com.mappingProject.Mappingproject.services;

import com.mappingProject.Mappingproject.entity.StudentAddress;
import com.mappingProject.Mappingproject.entity.studentnfo;

public interface StudentInfo {
	public studentnfo StudentUpdate(studentnfo data);
	public void StudentDelete(long id);
	public StudentAddress addressUpdate(StudentAddress address);

}
