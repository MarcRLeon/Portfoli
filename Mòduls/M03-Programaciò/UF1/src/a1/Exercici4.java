
package a1;

import java.util.Scanner;


public class Exercici4 {

   
    public static void main(String[] args) {
        float longitud, area, volum;
        int radi = 3;
        Scanner entrada = new Scanner(System.in);
        longitud = (float) (2*Math.PI*radi);
        area = (float) Math.PI*(radi*radi);
        volum =  (float) (4*Math.PI*(radi*radi*radi)/3);
    
        System.out.println("La seva longitud es:"+ longitud);
        System.out.println("La seva area es:"+ area);
        System.out.println("El seu volum es:"+ volum);
    }
    
}
