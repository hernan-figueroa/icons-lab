package com.alkemy.icons.icons.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alkemy.icons.icons.dto.ContinenteDTO;
import com.alkemy.icons.icons.entity.ContinenteEntity;

@Component
public class ContinenteMapper {

	public ContinenteEntity continenteDTO2Entity(ContinenteDTO dto) {
		ContinenteEntity continenteEntity = new ContinenteEntity();
		continenteEntity.setImagen(dto.getImagen());
		continenteEntity.setDenominacion(dto.getDenominacion());
		
		return continenteEntity;
	}
	public ContinenteDTO Entity2continenteDTO(ContinenteEntity entity) {
		ContinenteDTO continenteDTO = new ContinenteDTO();
		continenteDTO.setId(entity.getId());
		continenteDTO.setImagen(entity.getImagen());
		continenteDTO.setDenominacion(entity.getDenominacion());
		
		return continenteDTO;
	}
		
	public List<ContinenteDTO> continenteEntityList2DTOList(List<ContinenteEntity> entities) {
		List<ContinenteDTO> dtos = new ArrayList<>();
		for (ContinenteEntity entity : entities) {
			
			dtos.add(Entity2continenteDTO(entity));
		}
		return dtos;
	}
	
}
