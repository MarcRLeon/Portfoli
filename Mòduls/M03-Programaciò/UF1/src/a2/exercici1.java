package a2;

import java.util.Scanner;

public class exercici1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x, i;
        float resultat;

        System.out.println("Introdueix un nombre natural");
        x = entrada.nextInt();

        if (x % 2 == 0) {
            System.out.println("El nombre es parell");

        } else  {
            System.out.println("El nombre es imaparell");

        }

    }

}
