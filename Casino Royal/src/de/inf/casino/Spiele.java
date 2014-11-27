package de.inf.casino;

public class Spiele extends Methoden{
	
	public static int _chips;
	public static int _startchips;

	public static void set_chips(int _chips) {
		if(_startchips <= 0){
			
			startguthaben();
		}
		Spiele._chips = _chips;
		
		
	}
	
	

}