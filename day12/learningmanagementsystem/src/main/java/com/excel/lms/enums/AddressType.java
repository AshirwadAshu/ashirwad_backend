package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum AddressType {
	
   PRESENTADDRESS("PRESENTADDRSS"),PERMANENTADDRESS("PERMANENTADDRESS");
	
	private final String addressType;
}
