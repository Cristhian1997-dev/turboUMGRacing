/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mucun
 */
public class Camioneta extends Vehiculo {
    public Camioneta (String Nombre, String Tamaño){
        super (Nombre,Tamaño, 100, 75);
        //100 de velocidad final, 50 de aceleracion
     }
    @Override
    public void Avanzar() {
        System.out.println(Nombre + " está avanzando a máxima velocidad (" + VelocidadFinal + " km/h)!");
    }
    
     //Metodo para aumentar la aceleracion 
    public void activarTurbo() {
        System.out.println(Nombre + " activó el Nitro! ¡Velocidad aumentada!");
        Aceleracion += 50; // Aumenta la aceleración
    }
     // Método para mostrar informacion específica
    public void mostrarEspecificaciones() {
        System.out.println("=== Camioneta ===");
        System.out.println("Tipo: " + Nombre);
        System.out.println("Tamaño: " + Tamaño);
        System.out.println("Velocidad Máxima: " + VelocidadFinal + " km/h");
        System.out.println("Aceleración: " + Aceleracion + " km/h²");
    }
}