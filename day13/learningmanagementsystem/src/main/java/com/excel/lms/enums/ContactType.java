package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ContactType {
	
	PRIMARYNUMBER("PRIMARYNUMBER"),SECONDARYNUMBER("SECONDARYNUMBER");
	private final String contactType ;

}
