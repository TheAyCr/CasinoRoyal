package de.inf.casino;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Methoden {

	private static Scanner scannerint;
	public static int _scint;

	private static Scanner scannerstring;
	public static String _scstring;
	
	public static File file;

	// erstellt ein Benutzerprofil
	public static void profil() {

		stringsc("Dein Name");
		String name = _scstring;

		Spielerprofil player = new Spielerprofil(name);

		stringsc("Dein Alter");
		String alter = _scstring;

		startguthaben();

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

	// FileWriter
	public static void filewriter(String path, String input) throws IOException {

		FileOutputStream spielerListe = new FileOutputStream(path);

		for (int i = 0; i < input.length(); i++) {
			spielerListe.write((byte) input.charAt(i));
		}

		spielerListe.close();

		System.out.println("Datei ist geschrieben!");

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

	// definiert das Startguthaben
	public static void startguthaben() {

		intsc("Euro");
		int sg = _scint;
		Spiele._chips = sg;
		Spiele._startchips = sg;

	}
}
