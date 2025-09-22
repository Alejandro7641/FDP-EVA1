/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_calificaciones;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA1_20_CALIFICACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int calif;
        Scanner capt = new Scanner (System.in);
        System.out.println("Cual es tu calificacion?");
        calif=capt.nextInt();
        if((calif>=90)&&(calif<=100)){
            System.out.println("Obtuviste una A");
        }
        else if((calif>=80)&&(calif<=89)){
            System.out.println("Obtuviste una B");
        }
        else if((calif>=70)&&(calif<=79)){
            System.out.println("Obtuviste una C");
        }
        else if((calif>=60)&&(calif<=69)){
            System.out.println("Obtuviste una D");
        }
        else if((calif>=0)&&(calif<=59)){
            System.out.println("Obtuviste una F");
        }
        else{
            System.out.println("calificacion no valida");
        }
    }
    
}
