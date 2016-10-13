import java.util.Scanner;

public class Array {
	static String[] clases = {"Clase 1", "Clase 2", "Clase 3", "Clase 4", "Clase 5"};
	static int[] cadena = new int[50];
	static int a;
	
	public static void esPar() {
		if (cadena[a] % 2 == 0){
			System.out.println( "Posicion : " + a + " - " + cadena[a]);
		}
	}
	public static void main(String[] ar) {
		
		for (a= 0; a < cadena.length; a++){
			cadena[a]= a+1;
			esPar();
			
			//System.out.println( "Posicion : " + a + " - " + cadena[a] + " - " + clases[a]);
			/*if (cadena[a] % 2 == 0){
				System.out.println( "Posicion : " + a + " - " + cadena[a]);
			}*/
			
		}
		
		
	}

}
