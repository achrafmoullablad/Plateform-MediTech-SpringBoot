package com.medi.app.interfaceServices;
import java.util.List;
import com.medi.app.models.Patient;

public interface IpatientService {
	public List<Patient> ListerPatient();
	public int save(Patient p);
	public Patient findmpatbyid(int id);
	public void delete(int id);
}
