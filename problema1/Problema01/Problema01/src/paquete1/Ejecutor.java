/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import paquete2.LibretaNotas;

/**
 *
 * @author utpl
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LibretaNotas libreta1 = new LibretaNotas("Daniel Campoverde", 10, 9, 10);
        libreta1.calcularPromedio();
        LibretaNotas libreta2 = new LibretaNotas("Eric Toledo", 5, 5, 10);
        libreta2.calcularPromedio();

        System.out.printf("%s\n", libreta1);
        System.out.printf("%s\n", libreta2);
    }

}
