import java.util.Scanner;
 
public class Coche {
	int gasolina;
	
	public Coche(int gasolina){
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
		Coche miCoche = new Coche(10);
		miCoche.arrancar();
		for (int i = 0; i < 8; i++){
			miCoche.conducir();
			miCoche.arrancar();
		}
	}
}