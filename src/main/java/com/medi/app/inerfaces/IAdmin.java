package com.medi.app.inerfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medi.app.models.Admin;

@Repository
public interface IAdmin extends JpaRepository<Admin, Long>{
	Admin findByEmailAndPassword(String email,String password);
}