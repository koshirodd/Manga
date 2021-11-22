package com.example.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.Manga;
import com.example.service.MangaService;

@Controller
public class MainController {
	@Autowired
	private MangaService service;
	
	@Autowired
	private ModelMapper mapper;
	
	
	@GetMapping("/mangamain")
	public String mangamain( Model  model) {
		
				
				
		List<Manga> mangas = service.getAll();
		
		model.addAttribute("mangas", mangas);
		
		return "main/mangamain";
		
	}
	
}
