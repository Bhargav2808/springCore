package com.demo.springCore.ci;

public class Person {
	private String name;
	private String personid;
	
	@Override
	public String toString() {
		return this.name + " : " + this.personid;
	}

	public Person(String name, String personid) {
		this.name = name;
		this.personid = personid;
	}
	
}
