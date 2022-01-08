package com.medi.app.interfaceServices;
import java.util.List;
import java.util.Optional;
import com.medi.app.models.Patient;

public interface IpatientService {
	public List<Patient> ListerPatient();
	public int save(Patient p);
	public Optional<Patient> findmpatbyid(int id);
	public void delete(int id);
}
