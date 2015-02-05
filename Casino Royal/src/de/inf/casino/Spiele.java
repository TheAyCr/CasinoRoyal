package de.inf.casino;

public class Spiele extends Methoden {

	private static String _modus;
	public static int _einsatz;

	public static void spielelobby() {

		clear();
		System.out.println("");
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

			// TODO new Roulette();

		} else if (_modus.equalsIgnoreCase("Lotterie")
				|| _modus.equalsIgnoreCase("2")) {

			new Lotterie();
		}

		else if (_modus.equalsIgnoreCase("BlackJack")
				|| _modus.equalsIgnoreCase("3")) {

			new BlackJack();
		}

		else if (_modus.equalsIgnoreCase("EinarmigerBandit")
				|| _modus.equalsIgnoreCase("4")) {

			// TODO new EinarmigerBandit();
		}

		else if (_modus.equalsIgnoreCase("exit")
				|| _modus.equalsIgnoreCase("stop")
				|| _modus.equalsIgnoreCase("ende")) {

			new Ausgang();
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
	public static void initialization (String classname) {
		clear();
		System.out.println("Du startest jetzt den Spielmodus " + classname);
		System.out.print("");
		printGuthaben();
		System.out.println("");
		System.out.println("");
	}

	// Einsatz eines Spiels
	public static void einsatz() {

		clear();
		System.out.println("Wie hoch ist dein Einsatz für dieses Spiel?");
		System.out.println("");

		intsc("Einsatz");

		if (get_guthaben() - _scint >= 0) {

			set_guthaben(get_guthaben() - _scint);
			_einsatz = _scint;
			System.out.println("");
			System.out.println("");
		}

		else {
			System.out.println("");
			System.out.println("Du darfst hier keine Schulden machen!");
			System.out.println("Möchtest du jetzt das Spiel beenden?");

			stringsc("Ja (j),(1) oder Nein (n),(2)");
			if (_scstring.equalsIgnoreCase("Ja")
					|| _scstring.equalsIgnoreCase("1")) {

				spielelobby();
			} else {
				delay(3000);
				einsatz();
			}

		}

	}

	public static void nochmal(String classname) {

		System.out.println("");
		System.out.println("");
		System.out.println("Dieses Spiel nocheinmal spielen?");

		stringsc("Ja (j),(1) oder Nein (n),(2)");

		if (_scstring.equalsIgnoreCase("ja") || _scstring.equalsIgnoreCase("j")
				|| _scstring.equalsIgnoreCase("1")) {

			if (classname.equals("Lotterie")) {
				new Lotterie();
			}
			if (classname.equals("Roulette")) {
				// TODO new Roulette();
			}
			if (classname.equals("BlackJack")) {
				new BlackJack();
			}
			if (classname.equals("Slotmaschine")) {
				// TODO new Slotmaschine();
			}
		} else {
			spielelobby();
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