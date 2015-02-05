package de.inf.casino;

public class Ausgang extends Methoden {

	
	public int _startguthaben = Eingang._startguthaben;

	public Ausgang() {
		System.out.print("\f");
		System.out.println("");
		System.out.println("");
		System.out
				.println("◅ ║ Danke und auf Wiedersehen sag Ihr Casino Royal VallaDeluxe ║ ▻");
		System.out
				.println("◅ ║                   Bis zum nächsten Mal!                    ║ ▻");
		System.out.println("");
		System.out.println("");

		StatsAbfrage();
	}

	public void StatsAbfrage() {

		boolean idiotensicher = true;
		
		
		while (idiotensicher) {

			System.out.println("Möchtest du noch deine Statistiken sehen?");

			stringsc("Ja (j),(1) oder Nein (n),(2)");
			String stats = _scstring;

			if (stats.equalsIgnoreCase("ja") || stats.equalsIgnoreCase("j")
					|| stats.equalsIgnoreCase("1")) {

				idiotensicher = false;

				stats();

			}

			else if (stats.equalsIgnoreCase("nein")
					|| stats.equalsIgnoreCase("n")
					|| stats.equalsIgnoreCase("2")) {

				idiotensicher = false;

				System.out.print("\f");
				System.out.println("");
				System.out.println("");
				System.out
						.println("║║ Danke und auf Wiedersehen sag Ihr Casino Royal VallaDeluxe ║║");
				System.out
						.println("║║                   Bis zum nächsten Mal!                    ║║");
				System.out.println("");
				System.out.println("");

				System.exit(0);
			}
		}
	}

	
	
	public void stats() {

		String umsatzart;
		
		int umsatz = get_guthaben() - _startguthaben;

		if (umsatz > 0) {

			umsatzart = "Gewinn";

		} else if (umsatz < 0) {

			umsatz = umsatz * (-1);
			umsatzart = "Verlust";

		} else {

			umsatzart = "Gewinn";

		}

		System.out.print("\f");
		System.out.println("");
		System.out.println("");
		System.out
				.println("║║ Danke und auf Wiedersehen sag Ihr Casino Royal VallaDeluxe ║║");
		System.out
				.println("║║                   Bis zum nächsten Mal!                    ║║");
		System.out.println("");
		System.out.println("");

		Methoden.delay(1000);

		System.out.print("\f");
		System.out.println("");
		System.out
				.println("║║ Danke und auf Wiedersehen sag Ihr Casino Royal VallaDeluxe ║║");
		System.out
				.println("║║                   Bis zum nächsten Mal!                    ║║");
		System.out.println("");
		System.out.println("");
		System.out.println("");

		Methoden.delay(150);

		System.out.print("\f");
		System.out
				.println("║║ Danke und auf Wiedersehen sag Ihr Casino Royal VallaDeluxe ║║");
		System.out
				.println("║║                   Bis zum nächsten Mal!                    ║║");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");

		Methoden.delay(150);

		System.out.print("\f");
		System.out
				.println("║║                   Bis zum nächsten Mal!                    ║║");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out
				.println("║║                         Statistik                          ║║");

		Methoden.delay(150);

		System.out.print("\f");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out
				.println("║║                         Statistik                          ║║");
		System.out.println("");

		Methoden.delay(150);

		System.out.print("\f");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out
				.println("║║                         Statistik                          ║║");
		System.out.println("");
		System.out.println("");

		Methoden.delay(150);

		System.out.print("\f");
		System.out.println("");
		System.out.println("");
		System.out
				.println("║║                         Statistik                          ║║");
		System.out.println("");
		System.out.println("");
		System.out.println("Du hast am Anfang " + _startguthaben
				+ " Euro eingezahlt.");

		Methoden.delay(150);

		System.out.print("\f");
		System.out.println("");
		System.out
				.println("║║                         Statistik                          ║║");
		System.out.println("");
		System.out.println("");
		System.out.println("Du hast am Anfang " + _startguthaben
				+ " Euro eingezahlt.");
		System.out
				.println("Am Ende des Tages hattest du " + get_guthaben() + " Chips.");

		Methoden.delay(150);

		System.out.print("\f");
		System.out
				.println("║║                         Statistik                          ║║");
		System.out.println("");
		System.out.println("");
		System.out.println("Du hast am Anfang " + _startguthaben
				+ " Euro eingezahlt.");
		System.out
				.println("Am Ende des Tages hattest du " + get_guthaben() + " Chips.");
		System.out.println("Du hast einen " + umsatzart + " von " + umsatz
				+ " Euro gemacht");
		System.exit(0);
	}

}
