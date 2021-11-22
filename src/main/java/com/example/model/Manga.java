package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "manga")
public class Manga {
	@Id
	private String title;
	private int id;
	private String author;
	private double rate;
	
	
}
