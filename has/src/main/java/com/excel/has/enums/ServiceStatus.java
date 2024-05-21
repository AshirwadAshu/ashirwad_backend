package com.excel.has.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Getter
public enum ServiceStatus {
	ACTIVE("ACTIVE"),WAITING("WAITING"),COMPLETED("COMPLETED");
	private final String serviceStatus ;	
	

}
