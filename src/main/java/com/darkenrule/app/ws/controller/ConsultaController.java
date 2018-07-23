package com.darkenrule.app.ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.darkenrule.app.ws.entity.Consulta;
import com.darkenrule.app.ws.service.ConsultaService;

@Controller
@RequestMapping("/consulta")
public class ConsultaController {
	
	@Autowired
	ConsultaService consultaService; 
	
	@GetMapping("")
	public String showConsulta()
	{
		return "consulta";
	}
	
	@RequestMapping(path="/consultas", produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Iterable<Consulta> showConsultas()
	{
		Iterable<Consulta> consultas = consultaService.getConsultas();		
		
		return consultas;		
	}

}
