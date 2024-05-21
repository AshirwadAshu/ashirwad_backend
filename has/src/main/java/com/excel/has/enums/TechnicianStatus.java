package com.excel.has.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum TechnicianStatus {
	AVAILABLE("AVAILABLE"),NOTAVAILABLE("NOTAVAILABLE"),WOKINGON("WOKINGON");
	private final String technicianStatus ;
	

}
