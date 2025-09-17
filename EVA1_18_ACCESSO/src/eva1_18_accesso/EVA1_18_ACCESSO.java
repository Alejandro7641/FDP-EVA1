/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_accesso;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA1_18_ACCESSO {
    final static String USUARIO = "Alejandro";
    final static String CONTRASEÑA = "1234";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        String usu, con;
        Scanner capt = new Scanner (System.in);
        System.out.println("----Bienbenido----");
        System.out.println("sistema de venta restaurante la c");
        System.out.println("introduce tu usuario");
        usu=capt.nextLine();
        System.out.println("introduce la contraseña");
        con=capt.nextLine();
        if(usu.equals(USUARIO)){
            if(con.equals(CONTRASEÑA)){
                System.out.println("Acceso consedido");
        }
            else{
            System.out.println("Accesos denegado");
        }
        }
        else{
            System.out.println("Accesos denegado");
        }
        
        
    }
    
}
