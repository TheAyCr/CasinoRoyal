package de.inf.casino;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Methoden {

	private static Scanner scannerint;
	public static int _scint;

	private static Scanner scannerstring;
	public static String _scstring;

	public static File SpielerDB;

	public static String _name;
	public static int _alter;
	public static int _guthaben;
	public static int _startguthaben;

	// erstelle File
	public void erstelleFile(String FileName) {

		SpielerDB = new File(FileName);
		if (!SpielerDB.exists()) {
			try {
				SpielerDB.createNewFile();

			} catch (IOException e) {

				System.out
						.println("Achtung! Datei konnte nicht erstellt werden!");
				System.out.println("!!! Terminate java !!!");
				delay(5000);

				System.exit(0);

			}

		}
	}

	// check das Alter der Spieler
	public static void checkalter() {

		if (_alter >= 18) {

		}

		else {

			System.out.println("");
			System.out.println("");
			System.out
					.println("Achtung! Du musst Mindestens 18 Jahre alt sein um im Casino spielen zu dürfen.");
			System.out.println("");
			System.out.println("");

			delay(6000);
			new Eingang();
		}
	}

	// Integer scanner und überprüfung auf Integer TODO
	public static void intsc(String waswillstdu) {

		scannerint = new Scanner(System.in);
		System.out.print(waswillstdu + ": ");

		if (scannerint.hasNextInt()) {
			int temp = scannerint.nextInt();
			if (temp > 0) {
				_scint = temp;
			} else {
				System.out.println("Bitte gebe einen positiven Wert z.B. 1 , 80, 7532 ein!");
				System.out.println("");
				delay(1000);
				intsc(waswillstdu);
			}

		} else {
			System.out
					.println("Bitte gebe einen ganzzahligen Wert z.B. 1 , 80, 7532 ein!");
			System.out.println("");
			delay(1000);
			intsc(waswillstdu);
		}

	}

	// String scanner
	public static void stringsc(String waswillstdu) {
		
		scannerstring = new Scanner(System.in);
		System.out.print(waswillstdu + ": ");
		
		if (scannerstring.hasNext()){
			_scstring = scannerstring.nextLine();
		}
		else{
			System.out.println("Bitte gebe NUR Buchstaben und Zahlen ein!");
			System.out.println("");
			delay(1000);
			stringsc(waswillstdu);
		}
	}

	// delay
	public static void delay(int x) {
		try {
			Thread.sleep(x);
		} catch (Exception e) {
		}
	}

	// System out prints
	public static void clear() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}

	public static void printGuthaben() {
		System.out.println("Du hast noch ein Guthaben von " + _guthaben
				+ " Chips");
	}

	// Benutzereingaben
	public static void scset_name() {
		stringsc("Dein Name");
		_name = _scstring;

	}

	public static void scset_alter() {
		intsc("Dein Alter");
		_alter = _scint;

	}

	public static void scset_startguthaben() {
		intsc("Dein Startguthaben");
		int sg = _scint;
		_guthaben = sg;
		_startguthaben = sg;

	}

	// getter und Setter
	public static String get_name() {
		return _name;
	}

	public static void set_name(String name) {
		_name = name;
	}

	public static int get_alter() {
		return _alter;
	}

	public static void set_alter(int alter) {
		_alter = alter;
	}

	public static int get_guthaben() {
		return _guthaben;
	}

	public static void set_guthaben(int newguthaben) {

		String guthaben = String.valueOf(get_guthaben());
		String neuesguthaben = String.valueOf(newguthaben);

		try {
			BufferedReader replaceGuthaben = new BufferedReader(new FileReader(
					"PlayerFile.txt"));
			String line;
			String input = "";

			while ((line = replaceGuthaben.readLine()) != null)
				input += line + '\n';

			if (newguthaben != get_guthaben()) {

				input = input.replaceAll(guthaben, neuesguthaben);

				// überschreibt file
				FileOutputStream überschreibGuthaben = new FileOutputStream(
						"PlayerFile.txt");
				überschreibGuthaben.write(input.getBytes());

				überschreibGuthaben.close();

			}

			replaceGuthaben.close();
			
			_guthaben = newguthaben;

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
