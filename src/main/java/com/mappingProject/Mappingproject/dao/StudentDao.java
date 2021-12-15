package com.mappingProject.Mappingproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mappingProject.Mappingproject.entity.studentnfo;

public interface StudentDao extends JpaRepository<studentnfo, Long> {

}
