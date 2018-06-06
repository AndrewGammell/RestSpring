package models;

public class Dog {
	public int age;
	public String name;
	public String breed;
	public Enum color;
	
	private Dog() {		
	}
	public Dog(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Enum getColor() {
		return color;
	}
	public void setColor(Enum color) {
		this.color = color;
	}
}
