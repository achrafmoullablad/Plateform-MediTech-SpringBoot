package com.medi.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medi.app.inerfaces.IAdmin;
import com.medi.app.models.Admin;

@Service
public class Loginservice {
	@Autowired
	private IAdmin IAdminRep;
	public Admin LoginAdmin(String email,String password) {
		Admin admin=IAdminRep.findByEmailAndPassword(email, password);
		return admin;
	}
}