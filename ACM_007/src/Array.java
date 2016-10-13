import java.util.Scanner;


public class Array {
	static String[] clases = {"Clase 1", "Clase 2", "Clase 3", "Clase 4", "Clase 5"};
	public static void main(String[] ar) {
		int[] cadena = new int[5];
		
		for (int a= 0; a < cadena.length; a++){
			cadena[a]= a+1;
			
			System.out.println( "Posicion : " + a + " - " + cadena[a] + " - " + clases[a]);
		}
		
	}

}
