import java.util.Scanner;
 
public class Coche_v1 {
	int gasolina;
	
	public Coche_v1(int gasolina){
		this.gasolina = gasolina;
		System.out.println("Tenemos " + gasolina + "litros de gasolina");
	}
	
	public void arrancar(){
		if (this.gasolina > 0){
			System.out.println("Aranca");
		}else {
			System.out.println("No aranca");
		}
	}
	
	public void conducir(){
		if (this.gasolina > 0 ){
			this.gasolina -= 1;
			System.out.println("Quedan " + this.gasolina + " litros");
		}else{
			System.out.println("No se mueve");
		}
	}

	public static void main(String[] ar) {
		for (int a = 1 ; a <= 5; a++){
			System.out.println("\n --------     Coche " + a + "----------------");
			Coche_v1 miCoche = new Coche_v1(3);
			miCoche.arrancar();
			for (int i = 0; i < 3; i++){
				miCoche.conducir();
				miCoche.arrancar();
			}
		}
	}
}