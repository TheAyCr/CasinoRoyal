package de.inf.casino;

public class BlackJack extends Spiele {

	public String classname;
	private int Kartenwert;
	private int[] _karten;
	private int _spielerKartenwert;
	private int _computerKartenwert;
	private int Runde = 1;

	public BlackJack() {

		clear();

		classname = this.getClass().getSimpleName();

		initialization(classname);

		einsatz();

		gameStart();
	}

	public void gameStart() {

		System.out.println("BLACK-JACK");
		System.out.println("");
		System.out.println("");

		System.out.println("Deine zwei Karten sind:");
		System.out.println("");

		karteziehen(2);
		System.out.println("");
		_spielerKartenwert = Kartenwert;
		

		if (_karten[0] == 0 && _karten[1] == 9) {
			System.out.println("");
			System.out.println("Der Wert ist 21 - BLACKJACK");
			nächsteRunde("Computer");

		} else if (_karten[0] == 0 && _karten[1] == 10) {
			System.out.println("");
			System.out.println("Der Wert ist 21 - BLACKJACK");
			nächsteRunde("Computer");

		} else if (_karten[0] == 0 && _karten[1] == 11) {
			System.out.println("");
			System.out.println("Der Wert ist 21 - BLACKJACK");
			nächsteRunde("Computer");

		} else if (_karten[0] == 0 && _karten[1] == 12) {
			System.out.println("");
			System.out.println("Der Wert ist 21 - BLACKJACK");
			nächsteRunde("Computer");

		} else {

			System.out.println("Das ergibt einen Wert von " + Kartenwert + ".");
			nächsteRunde("Spieler");

		}
	}

	public void karteziehen(int anzahlkarten) {

		_karten = new int[anzahlkarten];

		for (int k = 0; k <= (anzahlkarten - 1); k++) {

			_karten[k] = (int) (Math.random() * 12);

			int zufallskarte = _karten[k];

			switch (zufallskarte) {

			case (0):
				Kartenwert = Kartenwert + 1;
				System.out.println("Ass");
				break;

			case (1):
				Kartenwert = Kartenwert + 2;
				System.out.println("Zwei");
				break;

			case (2):
				Kartenwert = Kartenwert + 3;
				System.out.println("Drei");
				break;

			case (3):
				Kartenwert = Kartenwert + 4;
				System.out.println("Vier");
				break;

			case (4):
				Kartenwert = Kartenwert + 5;
				System.out.println("Fünf");
				break;

			case (5):
				Kartenwert = Kartenwert + 6;
				System.out.println("Sechs");
				break;

			case (6):
				Kartenwert = Kartenwert + 7;
				System.out.println("Sieben");
				break;

			case (7):
				Kartenwert = Kartenwert + 8;
				System.out.println("Acht");
				break;

			case (8):
				Kartenwert = Kartenwert + 9;
				System.out.println("Neun");
				break;

			case (9):
				Kartenwert = Kartenwert + 10;
				System.out.println("Zehn");
				break;

			case (10):
				Kartenwert = Kartenwert + 10;
				System.out.println("Bube");
				break;

			case (11):
				Kartenwert = Kartenwert + 10;
				System.out.println("Dame");
				break;

			case (12):
				Kartenwert = Kartenwert + 10;
				System.out.println("König");
				break;
			}
		}
	}

	public void nächsteRunde(String art) {

		if (art.equals("Spieler")) {

			boolean idiotensicher = true;
			while (idiotensicher) {

				System.out.println("Möchtest du noch eine Karte ziehen?");

				stringsc("Ja (j),(1) oder Nein (n),(2)");
				String neuekarte = _scstring;

				if (neuekarte.equalsIgnoreCase("ja")
						|| neuekarte.equalsIgnoreCase("j")
						|| neuekarte.equalsIgnoreCase("1")) {

					idiotensicher = false;
					clear();
					System.out.println("BLACK-JACK");
					System.out.println("");
					System.out.println("");
					System.out.println("Deine neue Karte:");
					System.out.println("");
					karteziehen(1);
					System.out.println("");
					_spielerKartenwert = Kartenwert;
					
					System.out.println("Das ergibt einen Wert von " + Kartenwert + ".");
					
					if (Kartenwert >= 21){
						
						auswertung();
						break;
					}
					
					nächsteRunde("Spieler");
				}

				else if (neuekarte.equalsIgnoreCase("nein")
						|| neuekarte.equalsIgnoreCase("n")
						|| neuekarte.equalsIgnoreCase("2")) {

					idiotensicher = false;
					nächsteRunde("Computer");

				} else {
					System.out.println("");
					System.out
							.println("Es wird nur (ja),(j),(1) oder (nein),(n),(2) als Antwort aktzeptiert!");
				}
			}
		}

		else if (art.equals("Computer")) {
			
			Kartenwert = 0;

			if (Runde == 1) {

				Runde++;
				
				clear();
				System.out.println("ⓒⓞⓤⓟⓘⓔⓡ");
				System.out.println("");
				System.out.println("");
				System.out.println("Computers Karten:");
				System.out.println("");

				karteziehen(2);
				System.out.println("");
				_computerKartenwert = Kartenwert;


				if (_karten[0] == 0 && _karten[1] == 9) {
					System.out.println("");
					System.out.println("Der Wert ist 21 - BLACKJACK");
					delay(3000);
					auswertung();
					return;

				} else if (_karten[0] == 0 && _karten[1] == 10) {
					System.out.println("");
					System.out.println("Der Wert ist 21 - BLACKJACK");
					delay(3000);
					auswertung();
					return;

				} else if (_karten[0] == 0 && _karten[1] == 11) {
					System.out.println("");
					System.out.println("Der Wert ist 21 - BLACKJACK");
					delay(3000);
					auswertung();
					return;

				} else if (_karten[0] == 0 && _karten[1] == 12) {
					System.out.println("");
					System.out.println("Der Wert ist 21 - BLACKJACK");
					delay(3000);
					auswertung();
					return;

				} else {
					System.out.println("Der Computer hat einen Kartenwert von "
							+ Kartenwert + ".");

					delay(3000);

					nächsteRunde("Computer");
				}
			}

			if (Runde >= 2) {

				Runde++;
				
				if (_computerKartenwert <= 15) {

					System.out.println("");
					System.out.println("Der Coupier nimmt noch eine Karte.");
					karteziehen(1);
					_computerKartenwert = Kartenwert;
					
					System.out.println("");
					System.out.println("Der Computer hat einen Kartenwert von "
							+ _computerKartenwert + ".");
					System.out.println("");
					delay(3000);
					nächsteRunde("computer");

				} else {

					System.out.println("");
					System.out.println("Der Coupier nimmt keine Karte mehr.");
					delay(3000);
					auswertung();
					return;
				}
			}
		}
	}

	public void auswertung() {

		if ((_spielerKartenwert > _computerKartenwert && _spielerKartenwert <= 21)
				|| (_computerKartenwert >= 21)) {

			// Spieler gewinnt
			set_guthaben(_guthaben + _einsatz * 2);

			System.out.println("");
			System.out.println("");

			if (_spielerKartenwert > _computerKartenwert
					&& _spielerKartenwert <= 21) {

				System.out.println("GEWONNEN!");
				System.out.println("Dein Kartenwert (" + _spielerKartenwert
						+ ") ist höher als der Kartenwert des Coupier ("
						+ _computerKartenwert + ").");
				System.out.println("Du hast " + _einsatz + " Chips gewonnen!");
				System.out.println("");
				System.out.println("Du hast nun " + get_guthaben() + " Chips.");
				nochmal(classname);
				
			}

			if (_computerKartenwert >= 21) {

				System.out.println("GEWONNEN!");
                System.out.println("Der Kartenwert des Coupier (" + _computerKartenwert +") ist höher als 21.");
                System.out.println("Du hast " + _einsatz + " Chips gewonnen!");
                System.out.println("");
                System.out.println("Du hast nun " + get_guthaben() + " Chips.");
			}

		}

		else if ((_spielerKartenwert < _computerKartenwert && _computerKartenwert <= 21)
				|| (_spielerKartenwert >= 21)) {

			// computer gewinnt

			System.out.println();
			System.out.println();

			if (_spielerKartenwert < _computerKartenwert
					&& _spielerKartenwert <= 21) {

				System.out.println("VERLOREN!");
				System.out.println("Der Kartenwert des Computers(" + _computerKartenwert
						+ ") ist höher als dein Kartenwert("
						+ _spielerKartenwert + ").");
				System.out.println("Du hast " + _einsatz + " Chips verloren!");
				System.out.println("");
				System.out.println("Du hast nun " + get_guthaben() + " Chips.");
				nochmal(classname);
				
			}

			if (_spielerKartenwert >= 21) {

				System.out.println("VERLOREN!");
				System.out.println("Dein Kartenwert (" + _spielerKartenwert +") ist höher als 21.");
				System.out.println("Du hast " + _einsatz + " Chips verloren!");
				System.out.println("");
				System.out.println("Du hast nun " + get_guthaben() + " Chips.");
				nochmal(classname);
			}

			

		} else {

			// unendschieden

			set_guthaben(get_guthaben() + _einsatz);
			
			System.out.println("Es ist unentschieden.");
            System.out.println("Du verlierst nichts.");
            System.out.println("Dein Kartenwert (" + _spielerKartenwert +") ist gleich mit dem des Computers (" + _computerKartenwert +").");
            System.out.println("");
            System.out.println("Du hast immernoch " + get_guthaben() + " Chips.");
            nochmal(classname);
		}

	}
}
