package com.medi.app.inerfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.medi.app.models.Medecin;
@Repository
public interface IMedecin extends CrudRepository<Medecin, Integer>{

}
