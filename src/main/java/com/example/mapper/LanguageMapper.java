package com.example.mapper;

import org.mapstruct.Mapper;

import com.example.dto.LanguageDTO;
import com.example.entity.Language;

@Mapper(componentModel = "spring")
public interface LanguageMapper {

	public Language toLanguage(LanguageDTO languageDTO);

//	@Mapping(source = "LId", target = "LId")
//	@Mapping(source = "courses", target = "coursesDTO")
	public LanguageDTO toLanguageDTO(Language language);
}
