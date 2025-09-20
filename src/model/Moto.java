/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mucun
 */
public class Moto extends Vehiculo {
     public Moto (String Nombre, String Tamaño){
        super (Nombre,Tamaño, 150, 200);
        //150 de velocidad final, 200 de aceleracion
     }
     @Override
    public void Avanzar() {
        System.out.println(Nombre + " está avanzando a máxima velocidad (" + VelocidadFinal + " km/h)!");
    }
    
     // Método adicional para aumentar la velocidad
    public void activarTurbo() {
        System.out.println(Nombre + " activó el turbo! ¡Aceleración aumentada!");
        Aceleracion += 50; // Aumenta la aceleración
    }
     // Método para mostrar informacion específica
    public void mostrarEspecificaciones() {
        System.out.println("=== Motocicleta ===");
        System.out.println("Tipo: " + Nombre);
        System.out.println("Tamaño: " + Tamaño);
        System.out.println("Velocidad Máxima: " + VelocidadFinal + " km/h");
        System.out.println("Aceleración: " + Aceleracion + " km/h²");
    }
     }
