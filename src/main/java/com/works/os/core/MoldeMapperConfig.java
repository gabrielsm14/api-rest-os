package com.works.os.core;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration// definição, validação 
public class MoldeMapperConfig {

	@Bean // estancia 
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
