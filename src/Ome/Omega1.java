package Ome;
import java.util.Scanner;

public class Omega1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Area: ");
        int area = in.nextInt();
        
        System.out.print("Altura: ");
        int altura = in.nextInt();
        
        if(altura == 0){
            System.out.println("La altura no puede ser 0");
        } else {
            int op = (2 * area) / altura;
            System.out.println("Resultado: " + op);
        }
        in.close();
    }
}