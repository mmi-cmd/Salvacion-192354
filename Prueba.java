import java.util.Scanner;
public class Prueba {
    

    public static void main(String[] args) {
        final int MAX_NUMBER = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero que desea verificar");
        int number = scanner.nextInt();
        int cantidadDivisores = 0;

        // Verificar si el número ingresado es primo
        if (number > 1) { // Solo verificamos números mayores que 1
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    cantidadDivisores++;
                }
            }

            if (cantidadDivisores == 2) {
                System.out.println("El numero " + number + " es primo");
            } else {
                System.out.println("El numero " + number + " no es primo");
            }
        } else {
            System.out.println("El numero " + number + " no es primo");
        }

        System.out.println("Los numeros primos hasta " + MAX_NUMBER + " son: ");
        for (int numero = 2; numero <= MAX_NUMBER; numero++) {
            cantidadDivisores = 0;
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    cantidadDivisores++;
                }
            }
            if (cantidadDivisores == 2) {
                System.out.println(numero);
            }
        }

        scanner.close();
    }
}


