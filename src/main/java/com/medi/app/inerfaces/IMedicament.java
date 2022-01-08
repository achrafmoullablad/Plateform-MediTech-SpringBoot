package com.medi.app.inerfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.medi.app.models.Medicament;

@Repository
public interface IMedicament extends CrudRepository<Medicament, Integer> {

}
