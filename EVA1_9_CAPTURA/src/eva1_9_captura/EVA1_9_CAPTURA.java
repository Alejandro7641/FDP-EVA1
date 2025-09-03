/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_captura;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA1_9_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nombre;
        Scanner input = new Scanner (System.in);
        int edad;
        double Prom;
        System.out.println("introduce tu nombre completo");
        Nombre=input.nextLine();
        System.out.println("introduce tu edad");
        edad=input.nextInt();
        System.out.println("introduce tu promedio de la preparatoria");
        Prom=input.nextDouble();
        System.out.println("el nombre es");
        System.out.println(Nombre);
        System.out.println("la edad es");
        System.out.println(edad);
        System.out.println("el promedio es");
        System.out.println(Prom);
    }
    
}
