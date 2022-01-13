package com.medi.app.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.medi.app.models.Consultation;

public interface IconsultationService {
	public List<Consultation> ListerConsultation();
	public int save(Consultation c);
	public Consultation findconbyid(int id);
}
