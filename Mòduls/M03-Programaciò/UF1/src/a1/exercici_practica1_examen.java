package a1;

import java.util.Scanner;

public class exercici_practica1_examen {

    public static int descompte = 10;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, resultat1, resultat2;

        System.out.println("x:");
        x = entrada.nextInt();

        resultat1 = (x * descompte) / 100; // Aixo es el %
        resultat2 = x - resultat1; //Aqui s'aplica el %

        if (resultat1 > 10) {
            System.out.println("No hi ha descompte");

           

        } else
          System.out.println("El descompte es:" + resultat2);
        
        
        

    }

}
