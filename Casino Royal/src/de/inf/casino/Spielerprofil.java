package de.inf.casino;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Spielerprofil extends Methoden {

	private static Scanner filesc;
	private static FileWriter fw;
	private static boolean ergebniss;
	private static Scanner read;

	public Spielerprofil() {

		scset_name();

		erstelleFile("PlayerFile.txt");

		checkSpieler();

	}

	public static void checkSpieler() {

		if (SpielerDB.exists()) {
			try {
				filesc = new Scanner(SpielerDB);
				while (filesc.hasNext() && ergebniss == false) {

					if (filesc.next().equalsIgnoreCase(_name)) {

						ergebniss = true;
						existSpieler();

					}
				}

				if (!filesc.hasNext() && ergebniss == false) {
					filesc.close();
					newSpieler();
				}

			} catch (FileNotFoundException e) {
				System.out.println("FUCK fehler im Spielerpofiel");

			}

		}

	}

	public static void newSpieler() {

		System.out.println("Willkommen " + get_name()
				+ " du bist das Erste mal hier.");
		System.out.println("Bitte gebe dein Alter und dein Startguthaben an:");
		delay(2000);

		scset_alter();
		scset_startguthaben();

		try {
			fw = new FileWriter(SpielerDB, true);

			fw.write("Name: ");
			fw.write(_name);
			fw.write(" Alter: ");
			fw.write(new Integer(get_alter()).toString());
			fw.write(" Guthaben: ");
			fw.write(new Integer(get_guthaben()).toString());
			fw.write("\n");

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void existSpieler() {

		System.out.println("Du wurdest in der DB gefunden!");
		System.out.println("");

		try {
			read = new Scanner(new File("PlayerFile.txt"));
		} catch (Exception e) {

		}

		while (read.hasNext()) {

			if (read.next().equalsIgnoreCase(_name)) {

				String name = _name;
				set_name(name);
				read.next();
				set_alter(read.nextInt());
				read.next();
				set_guthaben(read.nextInt());

				System.out.println("Name: " + get_name());
				System.out.println("Alter: " + get_alter());
				System.out.println("Guthaben: " + get_guthaben());

				delay(3500);
			}
		}

	}

}
