package com.medi.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medi.app.inerfaces.IMedecin;
import com.medi.app.interfaceServices.ImedecinService;
import com.medi.app.models.Medecin;
@Service
public class MedecinService implements ImedecinService {
	@Autowired
	private IMedecin im;
	@Override
	public List<Medecin> ListerMedecin() {
		// TODO Auto-generated method stub
		return (List<Medecin>)im.findAll();
	}

	@Override
	public int save(Medecin m) {
		int res =0;
		Medecin medecin =im.save(m);
		if(!medecin.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public Optional<Medecin> findmedbyid(int id) {
	
		return im.findById(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		im.deleteById(id);
		
		
	}

	

}
