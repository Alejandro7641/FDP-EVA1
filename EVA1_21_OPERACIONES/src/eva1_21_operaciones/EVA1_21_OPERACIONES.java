/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_operaciones;

/**
 *
 * @author alexn
 */
public class EVA1_21_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor=2, expo=3;
        double resu;
        resu = Math.pow(valor, expo);
        System.out.println("2 al cubo es =");
        System.out.println(resu);
        int valor2=100;
        double resu2;
        resu2 = Math.sqrt(valor2);
        System.out.println("raiz cuadrada de 100 es = ");
        System.out.println(resu2);
        int valor3=125;
        double resu3;
        resu3=Math.pow(valor3, 1/3);
        System.out.println("loa raiz cubica de 125 es = ");
        System.out.println(resu3);
        System.out.println("1/3 es = ");
        System.out.println(1.0/3.0);
        int num1=2024, num2=4;
        int residuo;
        residuo= num1 % num2;
        System.out.println("2024/4 el resultado es ");
        System.out.println(residuo);
}
   } 
