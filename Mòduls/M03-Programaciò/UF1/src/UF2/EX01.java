package UF2;

import java.util.Scanner;

public class EX01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int calculadora = suma(6, 8);
        int resta = resta(6, 8);
        int multiplicacio = multiplicacio(6, 8);
        int divisio = divisio(6,8);

    }

    public static int suma(int a, int b) {
        int suma = (a + b);
        return (suma);

    }

    public static int resta(int a, int b) {
        int resta = (a-b);
        return(resta);

    }
    public static int multiplicacio(int a, int b){
    int multiplicacio = (a*b);
    return(multiplicacio);
    
    }
    public static int divisio(int a, int b){
    int divisio = (a/b);
    return(divisio);
    
    
    }

}
