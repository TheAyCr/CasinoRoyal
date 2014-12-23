package de.inf.casino;

public class Eingang extends Spiele {

	public static void main(String[] args) {

		new Eingang();
	}

	public Eingang() {

		System.out.print("\n");
		System.out.println("  ║║ 	                            			       ║║");
		System.out.println("  ║║ 	    	Willkommen im Casino Royal		       ║║");
		System.out.println("  ║║ 	                            			       ║║");
		System.out
				.println("  ║║  Schön, dass du uns wieder hier besuchen kommst!          ║║");
		System.out.println("  ║║ 	                            			       ║║");
		System.out.println("  ║║ 	                            			       ║║");

		
		
		// erstellt ein Benutzerprofil
		new Spielerprofil();

		spielelobby();

	}

}
