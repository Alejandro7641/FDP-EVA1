/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_ifanidado;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA1_17_IFANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int meses;
        Scanner capt = new Scanner (System.in);
        System.out.println("Dime un numero del 1 al 12");
        meses=capt.nextInt();
        if(meses==1){
            System.out.println("Enero");
        }
        else if(meses==2){
            System.out.println("Febrero");
        }
        else if(meses==3){
            System.out.println("Marzo");
        }
        else if(meses==4){
            System.out.println("Abril");
        }
        else if(meses==5){
            System.out.println("Mayo");
        }
        else if(meses==6){
            System.out.println("Junio");
        }
        else if(meses==7){
            System.out.println("Julio");
        }
        else if(meses==8){
            System.out.println("Agosto");
        }
        else if(meses==9){
            System.out.println("Septiembre");
        }
        else if(meses==10){
            System.out.println("Octubre");
        }
        else if(meses==11){
            System.out.println("Nobiembre");
        }
        else if(meses==12){
            System.out.println("Diciembre");
        }
        else{
            System.out.println("No corresponde a ningun mes del año");
        }
    }
    
}
