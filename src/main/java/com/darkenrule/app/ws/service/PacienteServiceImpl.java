package com.darkenrule.app.ws.service;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darkenrule.app.ws.dao.PacienteDao;
import com.darkenrule.app.ws.entity.Paciente;

@Service
public class PacienteServiceImpl implements PacienteService {
	
	@Autowired
	PacienteDao pacienteDao;

	@Override
	@Transactional
	public Iterable<Paciente> getPacientes() {
			
		return pacienteDao.findAll();
	}

	@Override
	public Optional<Paciente> getPaciente(Integer id) {
		// TODO Auto-generated method stub
		return pacienteDao.findById(id);
	}

	@Override
	public Double getIMC(Paciente paciente) {
		
		Double imc = 0.0;
		
		if(paciente != null && paciente.getEstatura() != null && paciente.getPeso() != null)
		{			
			Double estatura = paciente.getEstatura(); 
			imc = (paciente.getPeso())/ (estatura * estatura); 
		}
		
		return imc;
	}

	@Override
	public String getIMCStatus(Double imc) {
		
		String resultado = "";
		if(imc <= 0.0)
			return resultado;
		
		if(imc<18)
			resultado = "Peso bajo. Necesario valorar signos de desnutrición";
		else if(imc>=18 && imc<25)
			resultado = "Normal";
		else if(imc>=25 && imc<27)
			resultado = "Sobrepeso";
		else if(imc>=27 && imc<30)
			resultado = "Obesidad grado I. Riesgo relativo alto para desarrollar enfermedades cardiovasculares";
		else if(imc>=30 && imc<40)
			resultado = "Obesidad grado II. Riesgo relativo muy alto para el desarrollo de enfermedades cardiovasculares";
		else 
			resultado = "Obesidad grado III Extrema o Mórbida. Riesgo relativo extremadamente alto para el desarrollo de enfermedades cardiovasculares";
		
		return resultado;
	}
	
	@Override
	public Integer calculateAge(Paciente paciente) {
		Date birthDate = paciente.getFechaDeNacimiento();
		LocalDate currentDate = LocalDate.now();
		LocalDate br;
		if(birthDate != null)
		{
			br = birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			if(br!=null)
			{
				return Period.between(br, currentDate).getYears();
			}
		} 
		
		return null;
	}
}
