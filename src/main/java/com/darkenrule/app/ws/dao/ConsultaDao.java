package com.darkenrule.app.ws.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.darkenrule.app.ws.entity.Consulta;

@Repository
public interface ConsultaDao extends CrudRepository<Consulta, Integer> {

}
