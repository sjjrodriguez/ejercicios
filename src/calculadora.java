import java.util.Random;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Random ale = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        int numero1 = ale.nextInt(100) + 1;
        int numero2 = ale.nextInt(100) + 1;


        while (continuar) {
            System.out.println("El número 1 es: " + numero1 + " | El número 2 es: " + numero2);
            System.out.println("Seleccione una operación:");
            System.out.println("+: suma | -: resta | *: multiplicación | /: división | ^: potencia | %: módulo");

            double resultado = 0;
            boolean operacionValida = true;

            String operacion = scanner.next();

            switch (operacion) {
                case "+" -> resultado = numero1 + numero2;
                case "-" -> resultado = numero1 - numero2;
                case "*" -> resultado = numero1 * numero2;
                case "/" -> resultado = (double) numero1 / numero2;
                case "^" -> resultado = Math.pow(numero1, numero2);
                case "%" -> resultado = numero1 % numero2;
                default -> System.out.println("No es una operación válida.");

            }
            if (operacionValida) {
                System.out.println(numero1 + " " + operacion + " " + numero2 + " = " + resultado);
            }

            System.out.println("¿Desea realizar otra operación? |1: Sí| 2: No|");
            int decision = scanner.nextInt();
            if (decision == 2) {
                continuar = false;
            }
        }

        System.out.println("Calculadora finalizada.");
        scanner.close();
    }
}

