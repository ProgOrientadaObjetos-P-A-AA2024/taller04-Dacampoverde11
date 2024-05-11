/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteUno;

import paqueteDos.Cheques;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Enrique Iglesias";
        String banco = "Banco Pichincha";
        double valor = 19500;
        
        Cheques cheque1 = new Cheques ();
        cheque1.calcularComision();
        System.out.printf("%s\n",cheque1);
        
        Cheques cheque2 = new Cheques (nombre, banco, valor);
        cheque2.calcularComision();
        System.out.printf("%s\n",cheque2);
        
        
    }
    
}
