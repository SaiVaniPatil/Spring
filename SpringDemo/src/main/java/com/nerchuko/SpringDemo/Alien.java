package com.nerchuko.SpringDemo;

public class Alien {
	
	
	public Alien(int age, Laptop laptop) {
		System.out.println("Constructing Alien..with age... and laptop.");
		this.age = age;
		this.laptop = laptop;
	}

	public Alien(Laptop laptop) {
		System.out.println("Constructing Alien..with laptop...");
		this.laptop = laptop;
	}

	public Alien(int age) {	
		System.out.println("Constructing Alien..with age...");
		this.age = age;
	}

	private int age;
	private Laptop laptop;
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Alien()
	{
		System.out.println("Constructing Alien...");
	}

	public void code()
	{
		System.out.println("I am coding 2 ...");
		laptop.compile();
	}
	
}
