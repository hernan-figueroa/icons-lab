package com.alkemy.icons.icons.service;

import org.springframework.stereotype.Service;

import com.alkemy.icons.icons.dto.ContinenteDTO;


@Service
public class ContinenteService {

	public ContinenteDTO save(ContinenteDTO dto) {
		//guardar
		System.out.println("guardar continente");
		return dto;
	}
}
