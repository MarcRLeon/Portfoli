
package a2;

import java.util.Scanner;


public class exercici9 {


    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int a,b,c;
        
        
        System.out.println("Introdueix el nombre a:");
        a= entrada.nextInt();
        System.out.println("Introdueix el nombre b:");
        b= entrada.nextInt();
        System.out.println("Introdueix el nombre c:");
        c= entrada.nextInt();
        
        if((a>b)&&(b>c)){
            System.out.println("Els numeros en ordre creixent son:");
            System.out.println("a:"+a );
            System.out.println("b:"+ b);
            System.out.println("c:"+ c);
            
        } else if((b>a)&&(a>c)){
            System.out.println("Els numeros en ordre creixent son:");
            System.out.println("b:"+b);
            System.out.println("a:"+a);
            System.out.println("c:"+c);

        } else if((c>a)&&(a>b)){
            System.out.println("Els numeros en ordre creixent son:");
            System.out.println("c:"+c);
            System.out.println("a:"+ a);
            System.out.println("b:"+ b);

           } else if ((a>c)&&(c>b)){
               System.out.println("Els numeros en ordre creixent son:");
               System.out.println("a:"+ a);
               System.out.println("c:"+ c);
               System.out.println("b:"+ b);

            } else if((b>c)&&(c>a)){
                
                System.out.println("Els numeros en ordre creixent son:");
                System.out.println("b:"+ b);
                System.out.println("c:"+ c);
                System.out.println("a:"+ a);

            } else if((c>b)&&(b>a)){
                System.out.println("Els numeros en ordre creixent son:");
                System.out.println("c:"+ c);
                System.out.println("b:"+ b);
                System.out.println("a:"+ a);
   
   
   
   } 
  }  
 }  

    

