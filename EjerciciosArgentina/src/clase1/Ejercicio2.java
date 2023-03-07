package clase1;

public class Ejercicio2 {
	
	public static void main (String[] parametro) {
		float ingresosMensuales = 500000;
		int cantidadVehiculos = 2;
		int antigüedadVehiculo = 4;
		int cantidadInmuebles = 3;
		boolean poseeEmbarcaciónDeLujo = true;

		if ((ingresosMensuales>=489083) || (cantidadVehiculos>=3) || (antigüedadVehiculo<=5) || (cantidadInmuebles>=3) || (poseeEmbarcaciónDeLujo==true)) { 
			System.out.println("Pertenece a ingresos altos");
			} 
		else {
			System.out.println("No pertenece a ingresos altos");
			}

	}

}
