package com.medi.app.inerfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.medi.app.models.Consultation;
@Repository
public interface IConsultation extends CrudRepository<Consultation, Integer> {

}
