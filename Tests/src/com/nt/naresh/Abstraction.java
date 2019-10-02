package com.nt.naresh;

public abstract  class Abstraction {//abstract class is not allowed to 
	//create object
	public abstract  void m1(int a);//Abstract class have abstract
	//methods without body
	int a;
	public void m2(int b) {}//concrete method
	Abstraction  w;
	//Abstraction  a=new Abstraction();
	Abstraction(){}// zero param constructor
	//abstract methods are implemented in subclasses
	//if abstract methods as param also implemented in sub class
	//if concrete methods in abstract class not require to 
	//pass param values in sub class 
	

}
