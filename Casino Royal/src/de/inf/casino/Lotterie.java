package de.inf.casino;

public class Lotterie extends Spiele{

	public String classname;

	public Lotterie(){

		classname = this.getClass().getSimpleName();
		
		gameStart(classname);
		einsatz();
		
    }
	
}