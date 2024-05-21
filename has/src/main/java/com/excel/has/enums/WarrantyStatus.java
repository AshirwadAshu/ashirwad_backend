package com.excel.has.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum WarrantyStatus {
	NOWARRANTY("NOWARRANTY"),LG("LG"),RETURNWARRANTY("RETURNWARRANTY"),ACTIVESERVICE("ACTIVESERVICE");
	private final String product ;
}


