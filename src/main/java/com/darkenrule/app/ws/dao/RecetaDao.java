package com.darkenrule.app.ws.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.darkenrule.app.ws.entity.Receta;

@Repository
public interface RecetaDao extends CrudRepository<Receta, Integer>{

}
