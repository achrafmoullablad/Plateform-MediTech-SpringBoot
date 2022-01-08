package com.medi.app.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.medi.app.inerfaces.IPatient;
import com.medi.app.interfaceServices.IpatientService;

import com.medi.app.models.Patient;
@Service

public class PatientService implements IpatientService {
	@Autowired
	private IPatient im;
	@Override
	public List<Patient> ListerPatient() {
		// TODO Auto-generated method stub
		return (List<Patient>)im.findAll();
	}

	@Override
	public int save(Patient p) {
		// TODO Auto-generated method stub
		int res =0;
		Patient patient =im.save(p);
		if(!patient.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public Optional<Patient> findmpatbyid(int id) {
		// TODO Auto-generated method stub
		return im.findById(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		im.deleteById(id);
		
	}
	

}
