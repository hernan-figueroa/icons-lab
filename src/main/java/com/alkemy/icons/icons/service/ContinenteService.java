package com.alkemy.icons.icons.service;

import java.util.List;

import com.alkemy.icons.icons.dto.ContinenteDTO;
import com.alkemy.icons.icons.entity.ContinenteEntity;

public interface ContinenteService {

	
	ContinenteDTO save(ContinenteDTO dto);
	
	List<ContinenteDTO> getAllContinentes();
}
