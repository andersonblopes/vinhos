package com.spring.vinhos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.vinhos.repository.Vinhos;

@Controller
@RequestMapping("/vinhos")
public class VinhosController {

	@Autowired
	private Vinhos vinhos;

	@RequestMapping
	public ModelAndView pesquisa() {
		ModelAndView mv = new ModelAndView("/vinho/ListagemVinhos");
		mv.addObject("vinhos", vinhos.findAll());
		return mv;
	}

	@RequestMapping("/novo")
	public String novo() {
		return "/produto/CadastroProduto";
	}

}
