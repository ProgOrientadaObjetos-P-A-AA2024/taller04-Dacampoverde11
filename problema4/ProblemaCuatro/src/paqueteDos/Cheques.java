/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteDos;

/**
 *
 * @author Usuario iTC
 */
public class Cheques {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comision;
    
    public Cheques (){
        nombreCliente = "Antonio Valencia";
        nombreBanco = "Banco de Loja";
        valorCheque = 15000;
        
    }
    
    public Cheques (String n, String b, double v){
        nombreCliente = n;
        nombreBanco = b;
        valorCheque = v;
                
    }
    
    public void establecerNombre(String n){
        nombreCliente = n;        
    }
    
    public void establecerBanco(String n){
        nombreBanco = n;        
    }
    
    public void establecerValorCheque(double n){
        valorCheque = n;
    }
    
    public void calcularComision (){
        comision = valorCheque * (0.003/100);        
    }
    
    public String obtenerNombre(){
        return nombreCliente;
    }
    
    public String obtenerBanco(){
        return nombreBanco;
    }
    
    public double obtenerValorCheque(){
        return valorCheque;
    }
    
    public double obtenerComision(){
        return comision;
    }
    
    public String toString (){
        String cadena = String.format("Nombre del cliente: %s\n"
                + "Nombre del banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Comision del banco: %.2f\n"               
                + "Valor final: %.2f\n",
                obtenerNombre(),
                obtenerBanco(),
                obtenerValorCheque(),
                obtenerComision(),
                comision+valorCheque);
                 
        return cadena;
    }
}
