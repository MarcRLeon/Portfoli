package a1;

import java.util.Scanner;


public class Exercici3 {
    
    
    

    public static void main(String[] args) {
        
       float alsada, amplada, perimetre,superficie;          
       Scanner entrada = new Scanner(System.in);
       
       
       System.out.print("Introdueix l'alcada del rectangle:");
       alsada = entrada.nextFloat();
       System.out.print("Introdueix l'amplada del recatangle:");
       amplada = entrada.nextFloat();
       
       perimetre = 2 *(alsada + amplada);
       superficie = amplada * alsada;
       
        System.out.println("El perimetre del rectangle es:"+ perimetre);
        System.out.println("La superficie del recatngle es"+ superficie);
       
    }
    
}
