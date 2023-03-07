package clase1;

public class Ejercicio1 {

	public static void main (String[] parametro) {
		
		//a.
		int numeroInicio = 5;
		int numeroFin = 14;
		while (numeroInicio <= numeroFin){
			System.out.println(numeroInicio);
			numeroInicio = (numeroInicio + 1);
			}
		
		//b.
		int numeroInicio = 5;
		int numeroFin = 14;
		while (numeroInicio <= numeroFin){
			if (numeroInicio % 2 == 0) {
				System.out.println(numeroInicio);
				}
			numeroInicio = numeroInicio + 1;
			}
		
		//c.
		int numeroInicio = 5;
		int numeroFin = 14;
		boolean par = true;
		while (numeroInicio <= numeroFin)
			if (numeroInicio % 2 == 0) {
				if (par == true) {
					System.out.println(numeroInicio);
					}
				}
			else {
				if (par == false) {
					System.out.println(numeroInicio);
					}
				}
		numeroInicio = numeroInicio + 1;

		//d.
		int numeroInicio = 5;
		int numeroFin = 14;
		for (int i=numeroFin; i>=numeroInicio;i--) {
			if (i%2 == 0){
				System.out.println(i);
				}
			}
    }
}
