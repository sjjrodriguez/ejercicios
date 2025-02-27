import  java.util.Random;
public class aleatorio {
    public static void main(String[] args) {

        int max=10;
        int min=1;
        int rondas;
        int suma1=0;
        int suma2=0;
        Random ale = new Random();
        rondas = ale.nextInt((max - min +1))+min;
        System.out.println("el numero de rondas es " + rondas);

        for(int i=1;i<=rondas;i++){
            int dado1;
            int dado2;
            dado1 = ale.nextInt((6 - 1 +1))+min;
            suma1 +=dado1 ;
            dado2 = ale.nextInt((6 - 1 +1))+min;
            suma2 +=dado2 ;
            System.out.println("ronda "+i+" : dado1= "+dado1+" dado2 "+dado2);

        }
        System.out.println();
        System.out.println("tu suma del dado 1 es " +suma1);
        System.out.println("tu suma del dado dos es "+ suma2);
        System.out.println();

        if (suma1>suma2){
            System.out.println("la suma del dado uno "+suma1 + " es mayor que la suma del dado dos "+suma2);
        }
        else {
            System.out.println("la suma del dado dos "+suma2 + " es mayor que la suma del dado uno "+suma1);
        }
    }
}
