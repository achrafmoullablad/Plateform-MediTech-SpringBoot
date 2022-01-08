package com.medi.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medi.app.inerfaces.IConsultation;
import com.medi.app.inerfaces.IMedecin;
import com.medi.app.interfaceServices.IconsultationService;
import com.medi.app.models.Consultation;
import com.medi.app.models.Medecin;
@Service
public class ConsultationService implements IconsultationService{
	@Autowired
	private IConsultation im;
	@Override
	public List<Consultation> ListerConsultation() {
		// TODO Auto-generated method stub
		return (List<Consultation>)im.findAll();
	}

	@Override
	public int save(Consultation c) {
		// TODO Auto-generated method stub
		int res =0;
		Consultation CON =im.save(c);
		if(!CON.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public Optional<Consultation> findmedbyid(int id) {
		// TODO Auto-generated method stub
		return im.findById(id);
	}

}
