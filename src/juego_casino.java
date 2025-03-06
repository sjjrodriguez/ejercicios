import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class juego_casino {
    public static void main(String[] args) {
        Random ale = new Random();
        Scanner scanner = new Scanner(System.in);
        int sigue = 1;

        System.out.println("Ingrese el valor a apostar:");
        int dinero = scanner.nextInt();

        while (sigue == 1) {
            int numero = ale.nextInt(3) + 1;
            System.out.println("-----------------------------------------------------");
            System.out.println("El número que salió fue: " + numero);

            if (numero == 1) {
                dinero *= 2;
                System.out.println("¡Felicidades! Su dinero ahora es: " + dinero);
            } else if (numero == 2) {
                dinero /= 2;
                System.out.println("Aún tienes oportunidades de ganar. Su dinero es: " + dinero);
            } else {
                dinero = 0;
                System.out.println("¡Perdiste!");
                sigue = 2;
            }
            // Código para mostrar la imagen
            mostrarImagen();

            System.out.println("|| Escriba 1 si desea continuar || Escriba 2 si desea retirarse ||");
            int decision = scanner.nextInt();
            if (decision == 2) {
                sigue = 2;
            }

        }

        System.out.println("-----------------------------------------------------");
        System.out.println("Su dinero final es: " + dinero);
        System.out.println("Se acabó el juego");

    }
    public static void mostrarImagen() {
        JFrame frame = new JFrame("Imagen");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Cargar imagen desde la carpeta resources
        ImageIcon icono = new ImageIcon(juego_casino.class.getResource("/resources/apuesta.jpg"));

        // Validar si la imagen se cargó correctamente
        if (icono.getIconWidth() == -1) {
            System.out.println("Error: No se pudo cargar la imagen. Verifique la ruta.");
            return;
        }

        Image imagen = icono.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        JLabel etiqueta = new JLabel(new ImageIcon(imagen));
        frame.add(etiqueta);

        frame.setVisible(true);


    }
}

