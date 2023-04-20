package com.nerchuko.SpringDemo;

public class Alien {
	
	
//	public Alien(int age, comp comp) {
//		System.out.println("Constructing Alien..with age... and comp.");
//		this.age = age;
//		this.comp = comp;
//	}
//
//	public Alien(comp comp) {
//		System.out.println("Constructing Alien..with comp...");
//		this.comp = comp;
//	}
//
//	public Alien(int age) {	
//		System.out.println("Constructing Alien..with age...");
//		this.age = age;
//	}

	private int age;
	private Computer comp;
	
	public Computer getcomp() {
		return comp;
	}

	public void setcomp(Computer comp) {
		this.comp = comp;
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
		comp.compile();
	}
	
}
