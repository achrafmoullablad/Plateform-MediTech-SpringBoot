package com.medi.app.interfaceServices;
import java.util.List;
import java.util.Optional;

import com.medi.app.models.Medecin;

public interface ImedecinService {
	public List<Medecin> ListerMedecin();
	public int save(Medecin m);
	public void savem(Medecin m);
	public  Optional<Medecin> findmedbyid(int id);
	public void delete(int id);
}
