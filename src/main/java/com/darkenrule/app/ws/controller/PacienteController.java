package com.darkenrule.app.ws.controller;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.darkenrule.app.ws.entity.Paciente;
import com.darkenrule.app.ws.service.PacienteService;

@Controller
@RequestMapping("/paciente")
public class PacienteController {
	
	@Autowired
	PacienteService pacienteService;
	
	@GetMapping("")
	public String showPacientes(Model model) {
		System.out.println("entering showExpedientes");
		Iterable<Paciente> pacientes = pacienteService.getPacientes();

		model.addAttribute("pacientes", pacientes);
		return "paciente";
	}
	
	@GetMapping(path = "/{id}")
	public String showPaciente(@PathVariable Integer id, Model model)
	{
		Optional<Paciente> paciente = pacienteService.getPaciente(id);
		if(paciente.isPresent() == true)
		{
			DecimalFormat df = new DecimalFormat("#.##"); 
			Paciente pac =  paciente.get();
			model.addAttribute("paciente", pac);
			double imc = Double.valueOf(df.format(pacienteService.getIMC(pac)));
			model.addAttribute("imc", imc);
			model.addAttribute("imcStatus", pacienteService.getIMCStatus(imc));
			SimpleDateFormat simple = new SimpleDateFormat("dd-MM-yyyy");
			model.addAttribute("fechaNacimiento", simple.format(pac.getFechaDeNacimiento()));
			model.addAttribute("calculoEdad", pacienteService.calculateAge(pac));
		}
		else
			return "redirect:/paciente";
		
		return "paciente-detail";		
	}

}
