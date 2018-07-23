package com.darkenrule.app.ws.service;

import java.util.Optional;

import com.darkenrule.app.ws.entity.Paciente;

public interface PacienteService {
	
	public Iterable<Paciente> getPacientes();

	public Optional<Paciente> getPaciente(Integer id);
	
	public Double getIMC(Paciente paciente);
	
	public String getIMCStatus(Double imc);
	
	public Integer calculateAge(Paciente paciente);	

}
