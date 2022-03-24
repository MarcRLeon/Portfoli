
package a1;

import java.util.Scanner;



public class examenparcialç {
    
    public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
     double edatlimit,edatjugador,preu,preucompetir,assegurança; 
     boolean si,no;
    
     
     
        System.out.println("Introdueix l'edat del jugador");
        edatjugador= entrada.nextInt();
       
        edatlimit= 14;
    
    if (edatjugador<edatlimit){
        
        preu= 20;
        
         System.out.println("El preu es...$"+ preu);
         
         
         
         
         System.out.println("Introdueix l'edat del jugador");
         edatjugador=entrada.nextInt();
         edatlimit= 18;
        
         if(edatjugador<edatlimit){
           
             preu= 40;   
             System.out.println("El preu es....$"+ preu);
             
             
             
             System.out.println("Introdueix l'edat del jugador");
             edatjugador= entrada.nextInt();
             
             if(edatjugador>=edatlimit){
                 
                 preu= 60;
                 System.out.println("El preu es...."+ preu);
                 
                 
               
                 
                 
                 
                 
                   
          }       
        }                
       }         
      }
     }    
    
    
  


