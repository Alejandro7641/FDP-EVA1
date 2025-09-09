/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_if;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA1_12_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int calif;
        Scanner input = new Scanner (System.in);
        System.out.println("inserta la calificacion");
        calif=input.nextInt();
        if(calif>=70){
            System.out.println("acreditaste la materia");
        }
        else{
            System.out.println("no acreditaste la materia");
        }
    }
    
    
}
