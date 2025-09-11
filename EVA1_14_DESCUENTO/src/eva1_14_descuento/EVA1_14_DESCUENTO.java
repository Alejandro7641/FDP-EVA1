/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_descuento;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA1_14_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double precio, preciofinal;
        Scanner capt = new Scanner (System.in);
        System.out.println("cuanto es el monto a pagar");
        precio=capt.nextDouble();
        if(precio>=1000){
            preciofinal=precio-(precio*0.15);
            System.out.print("recibiste un descuento del 15% tu monto a pagar es de ");
            System.out.print(preciofinal);
            
        }
       
    }
    
}
