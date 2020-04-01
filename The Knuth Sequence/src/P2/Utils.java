package P2;

import java.util.Random;

public class Utils {
	// Functie pentru calcularea factorialului unui numar
	public static double calcFactorial(double value) {
		if (value > 100) { // Pentru numerele mai mari de 100 se returneaza chiar numarul
			return value;
		}
		double factorial = 1;
		for (int integer = 1; integer <= value; integer++) {
			factorial = factorial * integer;
		}
		return factorial;
	}

	// Functie pentru generarea unui numar random <= 15
	public static Integer generateRandom() {
		Random rand = new Random();
		Integer number = rand.nextInt(50) + 1;
		return number;
	}

}
