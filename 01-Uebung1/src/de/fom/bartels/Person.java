package de.fom.bartels;

public class Person {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if (age < 0 ) {
			throw new IllegalArgumentException("Age must be greater than 0");
		}
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Meine Name ist " + name + "\nIch bin " + age + " Jahre alt.";
	}
}
