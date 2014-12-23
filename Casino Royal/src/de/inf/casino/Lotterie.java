package de.inf.casino;

public class Lotterie extends Spiele {

	private String classname;
	private int[] Zahlen = new int[6];
	private String[] Zahlenoutput = new String[6];
	private int gewinnzahlen[] = new int[6];
	private int richtige = 0;
	private boolean keinedoppelten;
	private int _summe;

	public Lotterie() {

		clear();

		classname = this.getClass().getSimpleName();

		initialization(classname);

		einsatz();

		gameStart();

	}

	public void gameStart() {

		System.out.println("");
		System.out.println("Deine Zahlen:");
		for (int j = 0; j < 6; j++) {
			Zahlenoutput[j] = "-";
			System.out.print("   " + Zahlenoutput[j]);
		}

		for (int i = 0; i < 6; i++) {
			System.out.println("");
			System.out.println("Wähle 6 Zahlen aus 49 möglichen Zahlen");
			System.out.println("");

			intsc("neue Zahl");
			Zahlen[i] = _scint;

			if (Zahlen[i] < 1 || Zahlen[i] > 49) {
				System.out
						.println(" Es sind nur die Zahlen von 1 bis 49 verfügbar!");
				i--;
				delay(1000);
			} else {

				if (i == 0) {
					Zahlenoutput[i] = String.valueOf(Zahlen[i]);
				} else {
					for (int up = i - 1; up >= 0; up--) {
						keinedoppelten = true;
						if (Zahlen[i] == Zahlen[up]) {
							System.out
									.println("Du kannst keine doppelten Zahlen angeben!");
							Methoden.delay(1000);
							i--;
							keinedoppelten = false;
						}
					}

					if (keinedoppelten = true) {
						Zahlenoutput[i] = String.valueOf(Zahlen[i]);
					}
				}
			}
			clear();
			System.out.println("Deine bisherigen Zahlen:");
			for (int j = 0; j < 6; j++) {
				System.out.print("   " + Zahlenoutput[j]);
			}
			System.out.println("");
		}
		delay(1000);
		Gewinnzahlen();

	}

	public void Gewinnzahlen() {
		for (int i = 0; i < 6; i++) {
			gewinnzahlen[i] = 0 + (int) (Math.random() * 49);

			if (gewinnzahlen[i] == 0) {
				i--;
			} else {

				keinedoppelten = true;
				for (int up = i - 1; up >= 0; up--) {
					if (gewinnzahlen[i] == gewinnzahlen[up]) {
						keinedoppelten = false;
						i--;
					}
				}

				// überprühung
				if (keinedoppelten == true) {
					überprüfe(gewinnzahlen[i]);
				}
			}
		}

		clear();
		System.out
				.println("╔══════════════════════════════════════════════════════════════════════════╗");
		System.out
				.println("║                                                                          ║");
		System.out
				.println("╠  Deine Zahlen lauten:                Die Gewinnzahlen lauten:            ╣");
		System.out.print("╠ ");

		delay(200);
		System.out.print(" " + Zahlen[0]);

		for (int i = 1; i < 6; i++) {
			delay(200);
			System.out.printf("%4d", Zahlen[i]);
		}

		System.out.print("             ");

		for (int i = 0; i < 6; i++) {
			delay(200);
			System.out.printf("%4d", gewinnzahlen[i]);
		}
		System.out.println("              ╣");
		System.out
				.println("║                                                                          ║");
		System.out
				.println("╚══════════════════════════════════════════════════════════════════════════╝");
		auswertung();
	}

	public void überprüfe(int x) {
		for (int j = 0; j < 6; j++) {
			if (x == Zahlen[j]) {
				richtige = richtige + 1;
			}
		}

	}

	public void auswertung() {
		System.out.println("");
		System.out.println("");
		System.out.println(" DIE AUSWERTUNG ");
		System.out.println("");
		System.out.println("");
		System.out.println("du hast " + richtige + "-Mal richtig geraten");

		switch (richtige) {
		case 0: {
			System.out.println("Du hast leider nicht gewonnen!");
			break;
		}
		case 1: {
			_summe = _einsatz;
			System.out.println("Du hast " + _summe + " Chips gewonnen");
			break;
		}
		case 2: {
			_summe = _einsatz * (int) Math.pow(2, 2) - _einsatz;
			System.out.println("Du hast " + _summe + " Chips gewonnen");
			break;
		}
		case 3: {
			_summe = _einsatz * (int) Math.pow(2, 6) - _einsatz;
			System.out.println("Du hast " + _summe + " Chips gewonnen");
			break;
		}
		case 4: {
			_summe = _einsatz * (int) Math.pow(2, 10) - _einsatz;
			System.out.println("Du hast " + _summe + " Chips gewonnen");
			break;
		}
		case 5: {
			_summe = _einsatz * (int) Math.pow(2, 14) - _einsatz;
			System.out.println("Du hast " + _summe + " Chips gewonnen");
			break;
		}
		case 6: {
			_summe = _einsatz * (int) Math.pow(2, 17) - _einsatz;
			System.out.println("Du hast " + _summe + " Chips gewonnen");
			break;
		}

		}

		set_guthaben(get_guthaben() + _summe);

		System.out.println("Dein neues Guthaben: " + get_guthaben());
		
		nochmal(classname);
	}

}