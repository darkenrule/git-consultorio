package com.darkenrule.app.ws.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darkenrule.app.ws.dao.DireccionDao;
import com.darkenrule.app.ws.dao.ExpedienteDao;
import com.darkenrule.app.ws.dao.PacienteDao;
import com.darkenrule.app.ws.entity.Expediente;

@Service
public class ExpedienteServiceImp implements ExpedienteService {

	@Autowired
	ExpedienteDao expedienteDao;

	@Autowired
	PacienteDao pacienteDao;
	
	@Autowired
	DireccionDao direccionDao;

	@Override
	public Iterable<Expediente> getExpedientes() {
		return expedienteDao.findAll();
	}

	@Override
	public void saveExpediente(Expediente expediente) {		
		direccionDao.save(expediente.getPaciente().getDireccion());
		pacienteDao.save(expediente.getPaciente());
		expediente.setStatus(true);
		expedienteDao.save(expediente);
	}

	@Override
	public Optional<Expediente> getExpediente(Integer id) {
		
		return expedienteDao.findById(id);
	}

}
