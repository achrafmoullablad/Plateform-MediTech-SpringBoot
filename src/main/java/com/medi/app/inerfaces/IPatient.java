package com.medi.app.inerfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.medi.app.models.Patient;
@Repository
public interface IPatient extends CrudRepository<Patient, Integer>{

}
