
import java.util.Scanner;


public class Exercici6 {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); 
        
        double a,b,c,sol1,sol2;        
        System.out.println("Introdueix els coeficients de l'equacio de segon grau");
        a= entrada.nextInt();
        b= entrada.nextInt();
        c= entrada.nextInt();
        
        sol1=(-b + Math.sqrt((int) ((b*b)-4*a*c))/2*a);
        sol2= (-b - Math.sqrt((int) ((b*b)-4*a*c))/2*a);
        
        System.out.printf("La primera solucio de l'equacio es x1 =%+.3f%n", sol1);
        System.out.printf("La segona solucio de l'equacio es x1 =%+.3f%n", sol2);
        
        System.out.printf("%1$f %1$f %1$f%n", sol1);

        
        
    }
    
}
