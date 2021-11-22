package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Manga;

public interface MangaRepository extends JpaRepository<Manga,String>{
	
}
