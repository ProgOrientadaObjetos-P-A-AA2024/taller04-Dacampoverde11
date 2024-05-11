/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteDos;

/**
 *
 * @author Usuario iTC
 */
public class Profesores {
    
    private String nombre;
    private String apellido;
    private double sueldoBase;
    private double sueldoTotal;
    private String cedula;
    
    public Profesores (){
        nombre = "José";
        apellido = "Sanchez";
        sueldoBase = 800;
        cedula = "0872538410";
    }
    
    public Profesores ( String n, String a, double x, String c){
        nombre = n;
        apellido = a;
        sueldoBase = x;
        cedula = c;
    }
    
    public void establecerNombre (String n){
        nombre = n;
    }
    
    public void establecerApellido (String n){
        apellido = n;
    }
    
    public void establecerSueldoBase (double n){
        sueldoBase = n;
    }
    
    public void calcularSueldoTotal (){
        sueldoTotal = sueldoBase + (sueldoBase*0.2);
    }
    
    public void establecerCedula (String n){
        cedula = n;
    }
    
    public String obtenerNombre (){
        return nombre;
    }
    
    public String obtenerApellido (){
        return apellido;
    }
    
    public double obtenerSueldoBase (){
        return sueldoBase;
    }
    
    public double obtenerSueldoTotal (){
        return sueldoTotal;
    }
    
    public String obtenerCedula (){
        return cedula;
    }
    
    public String toString (){
        String cadena = String.format("Nombre del docente: %s\n"
                + "Apellido del docente: %s\n"
                + "Cedula del docente: %s\n"
                + "Sueldo Base del docente: %.2f\n"
                + "Sueldo total del docente: %.2f\n",
                nombre,
                apellido,
                cedula,
                sueldoBase,
                sueldoTotal); 
        return cadena;
    }
}
