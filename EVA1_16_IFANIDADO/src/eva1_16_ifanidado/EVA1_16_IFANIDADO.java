/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_ifanidado;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA1_16_IFANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numerodia;
        Scanner capt = new Scanner (System.in);
        System.out.println("Dime un numero del 1 al 7");
        numerodia=capt.nextInt();
        if(numerodia==1){
            System.out.println("Domingo");
        }
        else if(numerodia==2){
            System.out.println("Lunes");
        }
        else if(numerodia==3){
            System.out.println("Martes");
        }
        else if(numerodia==4){
            System.out.println("Miercoles");
        }
        else if(numerodia==5){
            System.out.println("Jueves");
        }
        else if(numerodia==6){
            System.out.println("Viernes");
        }
        else if(numerodia==7){
            System.out.println("Sabado");
        }
        else{
            System.out.println("No corresponde a ningun dia de la semana");
        }
    }
    
}
