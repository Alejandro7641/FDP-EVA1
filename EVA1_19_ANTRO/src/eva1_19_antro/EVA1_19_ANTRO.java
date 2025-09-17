/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_antro;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA1_19_ANTRO {
    final static int EDAD = 18;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean credencial;
        int edad;
        Scanner capt = new Scanner (System.in);
        System.out.println("----Bienbenido----");
        System.out.println("Que edad tienes?");
        edad=capt.nextInt();
        System.out.println("Traes tu credencial?(true of false)");
        credencial=capt.nextBoolean();
        if((edad>=EDAD)&&(credencial==true)){
            System.out.println("Puedes pasar");
            }else{
            System.out.println("No puedes pasar");
        }
    }
          }
            
    
