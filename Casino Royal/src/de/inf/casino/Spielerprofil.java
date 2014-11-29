package de.inf.casino;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Spielerprofil extends Methoden {

	private static String _name;
	private static Scanner filesc;

	public Spielerprofil(String Name) {

		set_name(Name);

		erstelleFile("PlayerFile.txt");

		checkSpieler();

	}

	public static void checkSpieler() {

		if (file.exists()) {
			try {
				filesc = new Scanner(file);
				while (filesc.hasNextLine()) {
					// scan for names on the content of the file
					String str = filesc.findInLine(_name);
					if (str != null) {

						// System.out.println(str);
					}
					// next line
					filesc.nextLine();
				}
				// schlieﬂe scanner objekt
				filesc.close();

			} catch (FileNotFoundException e) {
			}
		}
	}

	public static void newSpieler() {

	}

	public static void existSpieler() {

	}

	
	//getter und Setter
	public static String get_name() {
		return _name;
	}

	public static void set_name(String _name) {
		Spielerprofil._name = _name;
	}

}
