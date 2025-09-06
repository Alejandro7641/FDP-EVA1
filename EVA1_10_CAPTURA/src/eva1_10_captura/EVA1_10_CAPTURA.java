/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_captura;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA1_10_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double velocidad, distancia, tiempo;
        Scanner input = new Scanner (System.in);
    System.out.println("Que distancia recorres");
    distancia=input.nextDouble();
    System.out.println("En cuanto tiempo lo recores");
    tiempo=input.nextDouble();
    velocidad=distancia/tiempo;
    System.out.print("tienes una velosidad de ");
    System.out.print(velocidad);
    System.out.print(" m/s");
    }
 
}
