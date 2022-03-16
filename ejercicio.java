///////////////////////////////////////////////////
// METODO PARA SABER QUÉ NUMERO ES MAYOR

class Main {
	public static void main(String[] args) {
		int[] number = new int[] { 28, 50, 40, 200, 20, 44, 100, 153 };
		// Asumir que el mayor es el primero
		int highNumber = number[0];
		// Recorrer arreglo y ver si no es así
		// (comenzar desde el 1 porque el 0 ya lo tenemos contemplado arriba)
		for (int x = 1; x < number.length; x++) {
			if (number[x] > highNumber) {
				highNumber = number[x];
			}
		}
		System.out.println("El mayor es: " + highNumber);
	}

}


///////////////////////////////////////////////////
// DEVOVLER UN NUMERO EN LETRA

public String printNumberInWord(int num){
switch(numéricos){
	case 1:
		return "uno";
	case 2:
		return "dos";
	case 3:
		return "tres";
	case 4:
		return "cuatro";
	case 5:
		return "cinco";
	case 6:
		return "seis";
	case 7:
		return "siete";
	case 8:
		return "ocho";
	case 9:
		return "nueve";
	case 0:
		return "cero";
	default:
		return "";
 }
}


///////////////////////////////////////////////////
SABER SI UN NÚMERO ES PAR O IMPAR

public class Main{
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
      // declaro una variable para comprobar si   mis condicionales funcionan
        int numero = 5;
        if (esPar(numero)) {
            System.out.println("Sí es par");
        } else {
            System.out.println("No es par");
        }
    }
}


///////////////////////////////////////////////////
// CALCULAR EL PROMEDIO

class Main {
	public static void main(String[] args) {
		int arreglo[] = { 1, 3, 4, 90, 92 };
		// Para obtener la suma recorremos el arreglo y sumamos cada valor
		int suma = 0;
		for (int x = 0; x < arreglo.length; x++) {
			suma = suma + arreglo[x];
		}
		// El promedio es la suma dividida entre la cantidad de elementos
		float promedio = suma / arreglo.length;
		System.out.printf("Suma: %d. Promedio: %f", suma, promedio);
	}
}




