package de.inf.casino;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Methoden {

	private static Scanner scannerint;
	public static int _scint;

	private static Scanner scannerstring;
	public static String _scstring;

	public static File file;

	public static String _name;
	public static int _alter;
	public static int _guthaben;
	public static int _startguthaben;

	// erstellt ein Benutzerprofil
	public static void profil() {

		new Spielerprofil();

	}

	// erstelle File
	public void erstelleFile(String FileName) {

		file = new File(FileName);
		if (!file.exists()) {
			try {
				file.createNewFile();

			} catch (IOException e) {

				System.out
						.println("Achtung! Datei konnte nicht erstellt werden!");
				System.out.println("!!! Terminate java !!!");
				delay(5000);

				System.exit(0);

			}

		}
	}

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

	// getter und Setter
	public static String get_name() {
		return _name;
	}

	public static String set_name() {

		stringsc("Dein Name");
		_name = _scstring;
		return _name;
	}

	public static int get_alter() {
		return _alter;
	}

	public static int set_alter() {

		intsc("Dein Alter");
		_alter = _scint;
		return _alter;
	}

	public static int get_guthaben() {
		return _guthaben;
	}

	public static int set_guthaben() {
		intsc("Dein Startguthaben");
		int sg = _scint;
		_guthaben = sg;
		_startguthaben = sg;
		return _guthaben;
	}
}
