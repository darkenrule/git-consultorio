package com.darkenrule.app.ws.service;

import java.util.Optional;

import com.darkenrule.app.ws.entity.Expediente;

public interface ExpedienteService {
	
	public Iterable<Expediente> getExpedientes();

	public void saveExpediente(Expediente expediente);

	public Optional<Expediente> getExpediente(Integer id);

}
