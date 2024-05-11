/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteUno;

import paqueteDos.Profesores;

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
        String nombre, apellido, cedula;
        double sueldo;
        
        nombre = "Monica";
        apellido = "Songor";
        cedula = "1900635705";
        sueldo = 750.30;
        
        Profesores p1 = new Profesores ();
        p1.calcularSueldoTotal();
        
        System.out.printf("%s\n",p1);
        
        Profesores p2 = new Profesores (nombre, apellido,  sueldo, 
                cedula);
        p2.calcularSueldoTotal();
        
        System.out.printf("%s\n",p2);
    }
    
}
