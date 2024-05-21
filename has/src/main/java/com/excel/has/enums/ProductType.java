package com.excel.has.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ProductType {
	Ac("AC"),LG("LG"),WASHINGMACHINE("WASHINGMACHINE"),ROUTER("ROUTER");
	private final String product ;
}
