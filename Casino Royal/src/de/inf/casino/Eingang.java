package de.inf.casino;

public class Eingang extends Spiele {

	public static void main(String[] args) {

		new Eingang();
		
	}

	Eingang() {

		System.out.print("\n");
		System.out.println("  ║║ 	                            			       ║║");
		System.out.println("  ║║ 	    	Willkommen im Casino Royal		       ║║");
		System.out.println("  ║║ 	                            			       ║║");
		System.out
				.println("  ║║  Schön, dass du uns wieder hier besuchen kommst!          ║║");
		System.out.println("  ║║ 	                            			       ║║");
		System.out.println("  ║║ 	                            			       ║║");

		
		//tests
		
		//set_guthaben(9);
		
		
		// erstellt ein Benutzerprofil
		new Spielerprofil();

		checkalter();

		spielelobby();

	}

}
