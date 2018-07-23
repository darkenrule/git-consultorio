package com.darkenrule.app.ws.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.darkenrule.app.ws.entity.Expediente;
import com.darkenrule.app.ws.service.ExpedienteService;

@Controller
@RequestMapping("/expediente")
public class ExpedienteController {

	@Autowired
	ExpedienteService expedienteService;

	@GetMapping("")
	public String showExpedientes(Model model) {
		System.out.println("entering showExpedientes");
		Iterable<Expediente> expedientes = expedienteService.getExpedientes();

		model.addAttribute("expedientes", expedientes);
		return "expediente";
	}

	@GetMapping("/agregar-expediente")
	public String showAgregarExpediente(Model model) {
		Expediente expediente = new Expediente();

		model.addAttribute("expediente", expediente);
		System.out.println("entering agregar-expediente");
		return "expediente-form";
	}
	
	@PostMapping(value="/guardarExpediente", produces = "text/plain;charset=UTF-8")
	public String saveExpediente(@Valid @ModelAttribute("expediente") Expediente expediente, BindingResult bindingResult, Model model)
	{		
		if(bindingResult.hasErrors())
		{
			model.addAttribute("errors", bindingResult);
			return "expediente-form";
		}
		else
		{
			expedienteService.saveExpediente(expediente);
			return "redirect:/expediente";
		}		
	}
	
	@GetMapping("/actualizar")
	public String showFormForUpdate(@RequestParam("expedienteId") Integer id, Model model) {
		Optional<Expediente> expediente = expedienteService.getExpediente(id);
		model.addAttribute("expediente", expediente);
		
		return "expediente-form";

	}
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder)
	{
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

}
