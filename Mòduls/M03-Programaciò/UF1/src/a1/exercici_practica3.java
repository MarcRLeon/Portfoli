package a1;

import java.util.Scanner;

public class exercici_practica3 {

    public static int iva_superreduit = 4;
    public static int iva_reduit = 8;
    public static int iva = 21;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x = 100, categoria, Iva1, Iva2, Iva3, Medicaments = 1.23, farines = 0.87, medicaments_veterinaris = 2, aigues = 0.29, cosmetics = 2.43, begudes_alcoholiques = 6.45;
        
        System.out.println("Quin es el preu basic del prodcute?");
        

        Iva1 = (x * iva_superreduit) / 100;
        Iva2 = (x * iva_reduit) / 100;
        Iva3 = (x * iva) / 100;

        System.out.println("Quina es la categoria del producte?");
        categoria = entrada.nextInt();

        switch ((int) categoria) {

            case 1:
                System.out.println("S'aplica al producte un iva del =" + Iva1);
                ;
                break;
            case 2:
                System.out.println("S'aplica al producte un iva del =" + Iva1);
                ;
                break;
            case 3:
                System.out.println("S'aplica al producte un iva del =" + Iva2);
                break;
            case 4:
                System.out.println("S'aplica al producte un iva del =" + Iva2);
                break;
            default:
                System.out.println("S'aplica al producte un iva del =" + Iva3);

        }

    }

}
