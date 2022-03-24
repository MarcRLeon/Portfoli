package a4;

import java.util.Scanner;

public class Ex2_marc_rodó {

    public static int MINIM = 1;
    public static int MAXIM = 10;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, enters, i;

        System.out.println("**** MENU *****");

        System.out.println("Opcio 1- El mes gran i la suma");
        System.out.println("Opcio 2- Array aleatori parells/senars");
        System.out.println("Opcio 3- Array ordenat sense repetir");
        System.out.println("Opcio 4- SORTIR");

        System.out.println("Escull una opcio");
        x = entrada.nextInt();

        if (x == 1) {
            System.out.println("Opcio 1");
            System.out.print("Escriu quants enters entraras entre (1-10):");
            enters = entrada.nextInt();

            if (enters >= 10) {
                System.out.println("ERROR!");

            }

        }
        if (x == 2) {
            System.out.println("Opcio 2:");
            System.out.println("L'array generat amb els valors es:");

        }
        if (x == 3) {
            System.out.println("Opcio 3:");
            System.out.println("Escriu 10 numeros enters:");

        }
        if (x == 4) {
            System.out.println("FORA!");

        }
        if (x>4){
            System.out.println("ERROR!");
        
        
        }
        if(x<1){
            System.out.println("ERROR!");
        
        
        }
     
        
        
        
        }

    }

