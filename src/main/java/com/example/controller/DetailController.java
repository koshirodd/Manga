package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.service.MangaService;

@Controller
public class DetailController {
	@Autowired
	private MangaService service;
	@GetMapping("/mangamain/{id}")
	public String getDetail(@PathVariable("id") int id, Model model) {
		/*
		 * idをもとに、データベースからタイトルを取得
		 * 取得したのちに、そのタイトルから漫画をすべて取得例えばコナンなら、99巻すべてを
		 * それを反映させるページ,detailへとばす。
		 * */
		
		return "main/detail";
	}
}
