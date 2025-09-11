/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_mayor;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA1_15_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numero1, numero2;
        Scanner capt = new Scanner (System.in);
        System.out.println("cual es el primer numero");
        numero1=capt.nextDouble();
        System.out.println("cual es el segundo numero");
        numero2=capt.nextDouble();
        if(numero1>numero2){
            System.out.print(numero1);
            System.out.print(" es el numero mayor");
        }
        if(numero2>numero1){
            System.out.print(numero2);
            System.out.print(" es el numero mayor");
        }
        else{
            System.out.print("los valores son iguales");
        }
    }
    
}
