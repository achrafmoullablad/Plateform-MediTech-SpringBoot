package com.medi.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medi.app.inerfaces.IMedecin;
import com.medi.app.inerfaces.IMedicament;
import com.medi.app.interfaceServices.ImedicamentService;
import com.medi.app.models.Medecin;
import com.medi.app.models.Medicament;
@Service
public class MedicamentService implements ImedicamentService{
	@Autowired
	private IMedicament im;
	@Override
	public List<Medicament> ListerMedicament() {
		// TODO Auto-generated method stub
		return (List<Medicament>)im.findAll();
	}

	@Override
	public int save(Medicament me) {
		// TODO Auto-generated method stub
		int res =0;
		Medicament Medicament =im.save(me);
		if(!Medicament.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public Optional<Medicament> findmedbyid(int id) {
		// TODO Auto-generated method stub
		return im.findById(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		im.deleteById(id);
	}

}
