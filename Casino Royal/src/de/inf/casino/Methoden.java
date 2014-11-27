package de.inf.casino;

import java.util.Scanner;

public class Methoden {

	private static Scanner scannerint;
	private static int _scint;

	private static Scanner scannerstring;
	private static String _scstring;

	// Integer scanner und überprüfung auf Integer
	public static void intsc(String waswillstdu) {

		scannerint = new Scanner(System.in);
		System.out.print(waswillstdu + ": ");

		if (scannerint.hasNextInt()) {
			_scint = scannerint.nextInt();

		} else {
			System.out
					.println("Bitte einen Integer (Ganzzahliger Wert) eingeben!");
			System.out.println("");
			delay(1000);
			System.out.print(waswillstdu + ": ");
			intsc(waswillstdu);
		}

	}

	// String scanner
	public static void stringsc(String waswillstdu) {
		scannerstring = new Scanner(System.in);
		System.out.print(waswillstdu + ": ");
		_scstring = scannerstring.nextLine();
	}

	// delay
	public static void delay(int x) {
		try {
			Thread.sleep(x);
		} catch (Exception e) {
		}
	}

	// definiert das Startguthaben
	public static void startguthaben() {

		intsc("Euro");
		int sg = _scint;
		Spiele._chips = sg;
		Spiele._startchips = sg;

	}
}
