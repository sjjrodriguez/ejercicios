import  java.util.Random;
import  java.util.Scanner;
public class juego_casino {
    public static void main(String[] args) {
        Random ale = new Random();
        Scanner scanner = new Scanner(System.in);
        int sigue = 1;
        System.out.println("ingrese el valor a apostar");
        int dinero = scanner.nextInt();
        while (sigue == 1) {
            int numero = ale.nextInt((3 - 1 +1))+1;
            System.out.println("-----------------------------------------------------");
            System.out.println("el numero que salio fue "+numero);
            if (numero == 1) {
                int premio = dinero * 2;
                System.out.println("felicidades su dinero ahora es " + premio);
                System.out.println("-----------------------------------------------------");
                System.out.println("||escriba 1 si desea continuar||escriba 2 si desea retirars ||");
                dinero=premio;
                int desicion=scanner.nextInt();
                    if(desicion==2) {
                        sigue = 2;
                    }
            } else if (numero == 2) {
                int perdida = dinero / 2;
                System.out.println("aun tienes oportunidades de ganar su dinero es " + perdida);
                System.out.println("-----------------------------------------------------");
                dinero=perdida;
                System.out.println("||escriba 1 si desea continuar||escriba 2 si desea retirars ||");
                int desicion=scanner.nextInt();
                if(desicion==2) {
                    sigue = 2;
                }
            } else if (numero == 3) {
                System.out.println("perdiste");
                sigue=2;
            }

        }
        System.out.println("-----------------------------------------------------");
        System.out.println("se acabo el juego");
    }
}