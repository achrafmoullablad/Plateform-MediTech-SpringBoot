package com.medi.app.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.medi.app.models.Medicament;

public interface ImedicamentService {
	public List<Medicament> ListerMedicament();
	public int save(Medicament me);
	public Optional<Medicament> findmedbyid(int id);
	public void delete(int id);
}
