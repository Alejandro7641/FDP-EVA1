/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22_bisiesto;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA1_22_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner capt = new Scanner (System.in);
        int year, resi4, resi100, resi400;
        System.out.println("Año a verificar");
        year=capt.nextInt();
        resi4= year%4;
        resi100= year%100;
        resi400= year%400;
        if(resi4==0){
            System.out.print("El año ");
            System.out.print(year);
            System.out.print(" Es bisiesto");}
            else if(resi100==0){
            System.out.print("El año ");
            System.out.print(year);
            System.out.print(" no es bisiesto");}
                    else if(resi400==0){
            System.out.print("El año ");
            System.out.print(year);
            System.out.print(" Es bisiesto");
            }
            else{
            System.out.print("El año ");
            System.out.print(year);
            System.out.print(" No es bisiesto");
            }
        
    }
    
}
