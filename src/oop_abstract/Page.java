package oop_abstract;

public abstract class Page {

	// can not create the object of abs class
	// can have abs + non abs methods in abs class
	// can we create the object of abs .. class?
	// Ans: yes
	// but this will be called when u create the child class object
	// preference will always be given to parent default constructor
	
	//hidden default constructor...
	
	//in abstract class:
	//1. No abs ... method -- yes -- 0% abstraction
	//2. only abs ... method -- yes -- 100% abstraction
	//3. abs + non abs methods -- yes -- partial abstraction
	
	//Interface :
	//100% abstraction  
	

	public Page() {
		System.out.println("page...default....constructor");
	}

	public Page(int i) {
		System.out.println("page..const.." + i);
	}

	public abstract void title();

	public abstract void url();

	public void timeOut() {
		System.out.println("page -- time out : 20");
	}

	public final void displayLogo() {
		System.out.println("page -- displayLogo");
	}

}
