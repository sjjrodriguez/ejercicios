import  java.util.Random;
import  java.util.Scanner;
public class advinar_numero {
    public static void main(String[] args) {
        int numero;
        int adivinanza;
        int correcto=0;
        Random ale = new Random();
        Scanner scanner =new Scanner(System.in);
        numero = ale.nextInt((50 - 1 +1))+1;
        System.out.println(numero);

        for (int i =1; i<=3; i++) {
            System.out.println("ingrese un numero del 1-50");
             adivinanza = scanner.nextInt();
             if (adivinanza>numero){
                 System.out.println("el mumero ha adivinar es menor");
             } else if (adivinanza<numero) {
                 System.out.println("el numero ha adivinar  es mayor");
             } else if (adivinanza==numero) {
                 System.out.println("el numero es correcto");
                 correcto=adivinanza;
                 break;
             }
        }
        if(correcto==numero) {
            System.out.println("----------------------------------------");
            System.out.println("GANASTE");
        }
        else {
                System.out.println("----------------------------------------");
                System.out.println("PERDISTE");
                System.out.println("el numero era: "+numero);
               }


    }
}
