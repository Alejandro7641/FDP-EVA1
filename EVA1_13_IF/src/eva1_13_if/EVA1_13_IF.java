/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad, año, añoactual;
        Scanner capt = new Scanner (System.in);
        System.out.println("en que año estas");
        añoactual=capt.nextInt();
        System.out.println("en que año naciste");
        año=capt.nextInt();
        edad=añoactual-año;
        if(edad>=18){
            System.out.println("Ya puedes comprar bebidas alcolicas");
        }
        else{
            System.out.println("Todavia no puedes comprar bebidas alcolicas");
        }
    }
    
}
