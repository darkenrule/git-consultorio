package com.darkenrule.app.ws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darkenrule.app.ws.dao.ConsultaDao;
import com.darkenrule.app.ws.entity.Consulta;

@Service
public class ConsultaServiceImpl implements ConsultaService {
	
	@Autowired
	ConsultaDao consultaDao;

	@Override
	public Iterable<Consulta> getConsultas() {
		
		return consultaDao.findAll();
	}

}
