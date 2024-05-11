/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteUno;

import paqueteDos.Vehiculos;
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
        String cedula = "1150755815";
        String marca = "Toyota";
        int anio = 2005;
        double valorVehiculo = 9000;
        
        Vehiculos i1 = new Vehiculos ();
        i1.calcularValorMatricula();
        
        System.out.printf("%s\n",i1);
        
        Vehiculos i2 = new Vehiculos (cedula, marca, anio, valorVehiculo);
        i2.calcularValorMatricula();
        
        System.out.printf("%s\n",i2);
        
        
        
    }
    
}
