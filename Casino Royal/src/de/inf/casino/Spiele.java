package de.inf.casino;

public class Spiele extends Methoden {


	public static void spielelobby() {

		System.out.print("\n");
		System.out.println("Welches Spiel möchtest du spielen?");
		System.out.println("");
		System.out.println("Du hast die Möglichkeit aus:");
		System.out.println("1. Roulette (1)");
		System.out.println("2. Lotterie (2)");
		System.out.println("3. BlackJack (3)");
		System.out.println("4. Slotmaschine (4)");
		System.out.println("");
		System.out.println("Zum Beenden, schreibe (stop), in die Konsole");
		System.out
				.println("Um zu sehe, wieviele Chips du noch hast, schreibe (chips), in die Konsole");
		System.out.println("");

		stringsc("Bitte wähle jetzt");
		String modus = _scstring;

		if (modus.equalsIgnoreCase("Roulette") || modus.equalsIgnoreCase("1")) {

			// TODO Roulette roulette = new Roulette();

		} else if (modus.equalsIgnoreCase("Lotterie")
				|| modus.equalsIgnoreCase("2")) {

			// TODO Lotterie lotterie = new Lotterie();
		}

		else if (modus.equalsIgnoreCase("BlackJack")
				|| modus.equalsIgnoreCase("3")) {
			
			//TODO BlackJack blackjack = new BlackJack();
		}

		
		else if (modus.equalsIgnoreCase("EinarmigerBandit")
				|| modus.equalsIgnoreCase("4")) {
			
			//TODO EinarmigerBandit einarmigerbandit = new EinarmigerBandit();
		}
		

		else if (modus.equalsIgnoreCase("exit")
				|| modus.equalsIgnoreCase("stop")
				|| modus.equalsIgnoreCase("ende")) {
			
			//TODO Ausgang ausgang = new Ausgang();
		}

		
		else if (modus.equalsIgnoreCase("chips")
				|| modus.equalsIgnoreCase("coins")) {

			System.out.println("Du hast noch " + _guthaben + " Chips");
			
			delay(4000);
			
			spielelobby();
		}

		else {
			System.out
					.println("Zur Verfügung steht nur Roulette(1), Lotterie(2), BlackJack(3) und EinarmigerBandit(3)");
			
			delay(5000);
			
			spielelobby();
		}
	}

}