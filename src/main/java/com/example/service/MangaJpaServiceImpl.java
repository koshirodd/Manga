package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Manga;
import com.example.repository.MangaRepository;

@Service
public class MangaJpaServiceImpl implements MangaService{

	@Autowired
	private MangaRepository repository;
	
	@Override
	public List<Manga> getAll(){

		return repository.findAll();
	}
}
