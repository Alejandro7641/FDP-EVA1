/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_farenheit_celsius;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA1_8_FARENHEIT_CELSIUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);        
        // TODO code application logic here
        double celsius;
        System.out.println("cuantos grados farenheit quieres convertir a celsius? ");
        double farenheit=sc.nextDouble();
        celsius=(farenheit-32)*5/9;
        System.out.print(farenheit);
        System.out.print(" grados farenheit son ");
        System.out.print(celsius);
        System.out.print(" grados cesius ");
    }
    
}
