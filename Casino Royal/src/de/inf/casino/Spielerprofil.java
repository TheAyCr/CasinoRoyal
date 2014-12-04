package de.inf.casino;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Spielerprofil extends Methoden {

	private static Scanner filesc;
	private static FileWriter fw;
	private static boolean ergebniss;

	public Spielerprofil() {

		set_name();

		erstelleFile("PlayerFile.txt");

		checkSpieler();

	}

	public static void checkSpieler() {

		if (file.exists()) {
			try {
				filesc = new Scanner(file);
				while (filesc.hasNext()) {

					if (filesc.nextLine() == _name) {

						ergebniss = true;
						System.out.println(ergebniss + get_name());

						existSpieler();

					} else {
						ergebniss = false;
						filesc.close();
						System.out.println("newSpieler " + get_name());
						newSpieler();
						// System.exit(0);
					}
				}

			} catch (FileNotFoundException e) {
			}
		}
	}

	public static void newSpieler() {

		try {
			fw = new FileWriter(file);
			fw.write(get_name());
			fw.write("\n");
			fw.write(set_alter());
			fw.write("\n");
			fw.write(set_guthaben());

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void existSpieler() {

		System.out.println("Spieler in DB gefunden!");

	}

}
