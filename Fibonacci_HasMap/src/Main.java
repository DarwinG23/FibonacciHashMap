// --------------------------------------------------------
// Autor: Darwin Granda
// Fecha: 27/09/2021
// Versión: 1.0
// --------------------------------------------------------
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char continuar = 's'; // Variable de tipo char
        while (continuar == 's' || continuar == 'S'){
            Scanner teclado = new Scanner(System.in); // Crear un objeto de tipo Scanner
            System.out.println("Ingrese la posición de su fibonacci: ");// Imprimir en consola
            int numero = teclado.nextInt();// Leer un numero entero
            Fibonacci fibonacci = new Fibonacci();// Crear un objeto de tipo Fibonacci
            System.out.println("Su fibonacci es: " + fibonacci.calcularFibonacci(numero));// Imprimir en consola el resultado
            System.out.println("Desea elegir otro número? digite s/n");
            continuar = teclado.next().charAt(0); // Leer un carácter
        }

    }
}