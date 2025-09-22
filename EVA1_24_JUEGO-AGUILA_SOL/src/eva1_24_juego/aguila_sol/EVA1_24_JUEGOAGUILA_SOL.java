/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_24_juego.aguila_sol;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA1_24_JUEGOAGUILA_SOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner capt = new Scanner (System.in);
        int usuario;
        double resultado=Math.random();
        System.out.println(resultado);
        System.out.println("Aguila o Sello? (0/1)");
        usuario=capt.nextInt();
        if((usuario==0) && (resultado>0.5)){
            System.out.println("Salio aguila");
            System.out.println("Ganaste");
            }
        else if((usuario==0) && (resultado<0.5)){
            System.out.println("Salio sol");
            System.out.println("perdiste");
            }
        if((usuario==1) && (resultado<0.5)){
            System.out.println("Salio sol");
            System.out.println("Ganaste");
            }
        else if((usuario==1) && (resultado>0.5)){
            System.out.println("Salio aguila");
            System.out.println("perdiste");
            }
    }
    
}
