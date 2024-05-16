package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Education {
	
	UG("UG"),PG("PG"),OTHERS("PG");
	private final String educationType ;

}
