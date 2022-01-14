package com.medi.app.service;

import java.util.List;
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
		return (List<Patient>)im.findAll();
	}

	@Override
	public int save(Patient p) {
		int res =0;
		Patient patient =im.save(p);
		if(!patient.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public Patient findmpatbyid(int id) {
		return im.findById(id).get();	
	}

	@Override
	public void delete(int id) {
		im.deleteById(id);
	}
	

}
