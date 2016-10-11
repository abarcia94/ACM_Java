public class Coche_v2 {
	int gasolina;
	
	public Coche_v2(int gasolina){
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
		
		Coche_v2[] concesionario = new Coche_v2[10]; // Inicializacion del array al q llamo concesionario
		
		for (int a = 0 ; a < concesionario.length; a++){
			System.out.println("\n --------     Coche " + a + "----------------");
			concesionario[a] = new Coche_v2(3); // Inicializacion del objeto coche en la posicion a del array
			
			concesionario[a].arrancar();
			concesionario[a].conducir();
			
			/*for (int i = 0; i < 1; i++){
				concesionario[a].conducir();
				concesionario[a].arrancar();
			}*/
		}
	}
}