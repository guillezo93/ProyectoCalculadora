import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean condicion = true;
        while (condicion) {

            System.out.println("**** Aplicación Calculadora ****");
            System.out.println("-----------------------------------");

            //Mostramos el Menu
            mostrarMenu();

            try {
                int operacion = teclado.nextInt();
                //Revisar que el valor ingresado este dentro de las opciones 1 / 5
                if (operacion >= 1 && operacion <= 4) {
                    //ejecutamos la funcion para realizar la operacion, luego de la verificacion
                    ejecutarOperacion(operacion, teclado);
                } else if (operacion == 5) {
                    System.out.println("Ha cerrado la aplicación, hasta pronto...");
                    condicion = false;
                } else {
                    System.out.println("Opción no valida (deberá colocar valor de 1 a 5 y su valor ingresado fue: " + operacion);
                }
                System.out.println();
            }
            catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Error: Debe ingresar un número entero valido");
                teclado.next(); // cambio el valor "no valido" para evitar un bucle infinito
                System.out.println();
            }

        } //fin del while

    } //fin del Main


    private static void mostrarMenu() {
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División");
        System.out.println("5 - Salir");

        System.out.print("¿Qué operación desea a realizar?: ");
    }

    private static void ejecutarOperacion(int operacion, Scanner teclado) {
        System.out.print("Proporciona valor operando1: ");
        double operando1 = teclado.nextDouble();
        System.out.print("proporciona valor operando2: ");
        double operando2 = teclado.nextDouble();

        //Resultado
        double resultado;

        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado de la Suma = " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("Resultado de la Resta = " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("Resultado de la Multiplicación = " + resultado);
            }
            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("Resultado de la División = " + resultado);
            }

            default -> {
                System.out.println("Opción no valida (deberá colocar valor de 1 a 5 y su valor ingresado fue: " + operacion);

            }
        }


    }
}
