package de.inf.casino;

public class Spiele extends Methoden {

	private static String _modus;
	private static int _einsatz;

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
		_modus = _scstring;

		if (_modus.equalsIgnoreCase("Roulette") || _modus.equalsIgnoreCase("1")) {

			// TODO Roulette roulette = new Roulette();

		} else if (_modus.equalsIgnoreCase("Lotterie")
				|| _modus.equalsIgnoreCase("2")) {

			new Lotterie();
		}

		else if (_modus.equalsIgnoreCase("BlackJack")
				|| _modus.equalsIgnoreCase("3")) {

			// TODO BlackJack blackjack = new BlackJack();
		}

		else if (_modus.equalsIgnoreCase("EinarmigerBandit")
				|| _modus.equalsIgnoreCase("4")) {

			// TODO EinarmigerBandit einarmigerbandit = new EinarmigerBandit();
		}

		else if (_modus.equalsIgnoreCase("exit")
				|| _modus.equalsIgnoreCase("stop")
				|| _modus.equalsIgnoreCase("ende")) {

			// TODO Ausgang ausgang = new Ausgang();
		}
		
		else if (_modus.equalsIgnoreCase("test")) {

			replace_guthaben(8);
		}

		else if (_modus.equalsIgnoreCase("chips")
				|| _modus.equalsIgnoreCase("coins")) {

			printGuthaben();

			delay(3000);

			spielelobby();
		}

		else {
			System.out
					.println("Zur Verfügung steht nur Roulette(1), Lotterie(2), BlackJack(3) und EinarmigerBandit(4)");

			delay(4000);

			spielelobby();
		}
	}

	// Start eines Spiels
	public static void gameStart(String classname) {
		clear();
		System.out.println("Du startest jetzt den Spielmodus " + classname);
		System.out.print("");
		printGuthaben();
		System.out.println("");
		System.out.println("");
	}

	// Einsatz eines Spiels
	public static void einsatz() {

		System.out.println("Wie hoch ist dein Einsatz für dieses Spiel?");
		System.out.println("");

		intsc("Einsatz");
		_einsatz = _scint;

		@SuppressWarnings("unused")
		boolean Schulden;
		while (Schulden = false) {
			if (get_guthaben() - _einsatz >= 0) {
				Schulden = true;
				set_guthaben(get_guthaben() - _einsatz);
				break;
			} else {
				System.out.println("Du darfst hier keine Schulden machen!");
				delay(4000);
				einsatz();
			}
		}

	}

	// getter und setter
	public static String get_modus() {
		return _modus;
	}

	public static void set_modus(String _modus) {
		Spiele._modus = _modus;
	}

}