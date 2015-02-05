package de.inf.casino;

public class Eingang extends Spiele {

	public static void main(String[] args) {

		new Eingang();
	}

	public static int _startguthaben;

	public Eingang() {

		System.out.print("\n");
		System.out.println("  ║║ 	                            			       ║║");
		System.out.println("  ║║ 	    	Willkommen im Casino Royal		       ║║");
		System.out.println("  ║║ 	             Version 1.2 BETA		       ║║");
		System.out.println("  ║║ 	         by M. Jenner | L. Greve   ║║");
		System.out.println("  ║║ 	                            			       ║║");
		System.out
				.println("  ║║  Schön, dass du uns wieder hier besuchen kommst!          ║║");
		System.out.println("  ║║ 	                            			       ║║");
		System.out.println("  ║║ 	                            			       ║║");

		
		
		// erstellt ein Benutzerprofil
		new Spielerprofil();
		
		_startguthaben = get_guthaben();

		spielelobby();

	}

}
