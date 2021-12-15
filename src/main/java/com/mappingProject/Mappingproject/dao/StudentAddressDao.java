package com.mappingProject.Mappingproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mappingProject.Mappingproject.entity.StudentAddress;

public interface StudentAddressDao extends JpaRepository<StudentAddress, Long>{

}