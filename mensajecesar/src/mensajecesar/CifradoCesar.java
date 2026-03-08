package mensajecesar;

import java.util.Scanner;

public class CifradoCesar {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// El programa utilizara algoritmo de cesar

	}

	public String cifradoCesar(String text, int llave) {
		StringBuilder cifrado = new StringBuilder();

		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			
			if (Character.isLetter(c)) {
				char pie= Character.isUpperCase(c) ? 'A':'a';
			}
			
			
		}

		return "";
	}
}
