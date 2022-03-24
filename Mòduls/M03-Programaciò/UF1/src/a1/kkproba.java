package a1;

import java.util.Scanner;

public class kkproba {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int segons = 60, minuts, minuts1, temps_real;
        System.out.println("minuts =");
        minuts = entrada.nextInt();

        minuts1 = segons * minuts;
        System.out.println("segons = " + minuts1);
        
        temps_real = minuts1 /5;
        System.out.println("El total es ="+ (float) temps_real);

    }

}
