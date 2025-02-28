import java.util.Scanner;
public class IMS {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("ingrese su peso en kg");
        double peso = scanner.nextDouble();
        System.out.println("ingrese su estatura en metros");
        double estatura   =scanner.nextDouble();
        double IMS = peso/(estatura*estatura);
        System.out.println("su indice de masa muscular es " + IMS);
        if (IMS<18.5){
            System.out.println("usted se encuentra bajo de peso");
        }
        else if (IMS>=18.5 && IMS<24.9) {
            System.out.println("su peso es normal");
        }
        else if (IMS>=25 && IMS<26.9) {
            System.out.println("sobre peso grado 1");
        } else if (IMS>27 && IMS<29.9) {
            System.out.println("sobre peso grado 2");
        } else if (IMS>30 && IMS<34.9) {
            System.out.println("obesidad tipo 1");

        } else if (IMS>35 && IMS<39.9) {
            System.out.println("obesidad tipo 2");
        } else if (IMS>40 && IMS<49.9) {
            System.out.println("obesidad tipo 3 (morbida");
        } else if (IMS>50) {
            System.out.println("obesidad de tipo 4(extrema)");
        }
        System.out.println("codigo realizado por juan sebastian rodriguez blanco");
    }
}
