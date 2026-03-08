package mensajecesar;

import java.util.Scanner;

public class CifradoCesar {
	static Scanner sc = new Scanner(System.in); 

	public static void main(String[] args) {
		// El programa utilizara algoritmo de cesar

	}

	public String cifradoCesar(String text, int llave) {
		StringBuilder cifrado = new StringBuilder(); // Instancia  del StringBuilder
		/*
		 * Antes de nada en este caso no podemos utilizar un for Each ya que estamos
		 * recorriendo texto que no es un array de texto si queremos recorrer texto
		 * array tendremos que convertirlo con .tocharArray pero aun sonando raro el for
		 * tradicional es mejor en este caso que el for Each por respuesta Una vez
		 * recorrido la variable text condicinamos que si character es la letra c
		 * entonces que la convierta en mayñuscula el interrogante actua como tercer
		 * operador que le indica al programa que ?'letra'es correcto : 'LETRA' es
		 * incorrecto
		 */

		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);

			if (Character.isLetter(c)) {
				char pie = Character.isUpperCase(c) ? 'A' : 'a';

				int posOr = c - pie;
				int posDesplazada = ((posOr + llave));
				char letracod=(char) (pie+posDesplazada);
				cifrado.append(letracod);
			}else {
				cifrado.append(c);
			}

		}

		return cifrado.toString();
	}
	
	// Está función se encarga de descrifrar el mensaje
	public  String descrifrador(String textoCifrado,int clave) {
		return cifradoCesar(textoCifrado ,- clave);
	}
	
	public void pedidaDatos() {
		
	}
}
