
package a2;

import java.util.Scanner;


public class exercici7 {

    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int a,b,c;
        
        
        System.out.println("Introdueix el nombre a:");
        a= entrada.nextInt();
        System.out.println("Introdueix el nombre b=");
        b= entrada.nextInt();
        System.out.println("Introdueix el nombre c=");
        c=entrada.nextInt();
        
        
        if ((a<b)&&(b<c)){
            System.out.println("El nombre menor es a="+ a);

        } else if((b<a)&&(a<c)){
            System.out.println("El nombre menor es b="+b);

        } else if ((c<b)&&(b<a)){
            System.out.println("El nombre menor es c="+c);
        
  }      
 } 
}
