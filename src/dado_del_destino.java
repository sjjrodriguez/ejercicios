import java.util.Random;
import java.util.Scanner;

public class dado_del_destino {
    public static void main(String[] args) {
        int vidas = 5;
        int puntos = 0;
        int rondas=1;
        Scanner scanner = new Scanner(System.in);
        Random ale = new Random();
        boolean continuar = true;
        System.out.println("tus puntos son: " + puntos);
        System.out.println("tus vidas son: " + vidas);
            while (continuar) {
                System.out.println("ronda "+rondas);
                rondas=rondas+1;
                System.out.println("------------------------------------------");
                int numero = ale.nextInt((6 - 1 + 1)) + 1;
                System.out.println("Lanzando el dado...");
                System.out.println("Salió el número: " + numero);
                if (numero == 1) {
                    System.out.println("perdiste una vida");
                    vidas = vidas - 1;
                    System.out.println("tus vidas son "+vidas);
                } else if (numero == 2) {
                    System.out.println("ganaste un punto");
                    puntos = puntos + 1;
                    System.out.println("tus puntos son: "+puntos);

                } else if (numero == 4) {
                    System.out.println("ganaste un punto");
                    puntos = puntos + 1;
                    System.out.println("tus puntos son: "+puntos);

                } else if (numero == 3) {
                    System.out.println("no paso nada");
                    System.out.println("tus puntos son: "+puntos);

                } else if (numero == 5) {
                    System.out.println("no paso nada");
                    System.out.println("tus puntos son: "+puntos);

                } else if (numero == 6) {
                    System.out.println("ganaste 3 puntos");
                    puntos = puntos + 3;
                    System.out.println("tus puntos son: "+puntos);

                }
                System.out.println("------------------------------------------");
                System.out.println("desea seguir jugando 1.SI 2.NO");
                int pregunta = scanner.nextInt();
                if (pregunta == 2) {
                    continuar = false;
                }
                if (puntos > 10) {
                    System.out.println("------------------------------------------");
                    System.out.println("GANASTE, felicidades");
                    continuar = false;
                }
                if (vidas <= 0) {
                    System.out.println("------------------------------------------");
                    System.out.println("PERDISTE,lastima");

                    continuar = false;

                }
            }

        }
    }
