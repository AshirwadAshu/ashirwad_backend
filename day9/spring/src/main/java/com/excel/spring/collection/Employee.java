package com.excel.spring.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private String name;
	private List<String>phones;
	private Set<String>skills;
	private Map<String,String>nominees;
	public Employee() {
		super();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getSkills() {
		return skills;
	}
	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	public Map<String, String> getNominees() {
		return nominees;
	}
	public void setNominees(Map<String, String> nominees) {
		this.nominees = nominees;
	}
	
	

}
