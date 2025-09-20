/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mucun
 */
public class Jugador {
    //Atributos del jugador
    private String nombre;
    private Vehiculo vehiculo;
    private int distanciaRecorrida;
    
    //Constructor
    public Jugador (String nombre, Vehiculo vehiculo){
        this.nombre = nombre;
        this.vehiculo = vehiculo;
        this.distanciaRecorrida = 0;
    }
    
    //Metodos Getter y Setter
    public String getNombre() { return nombre; }
    public Vehiculo getVehiculo() { return vehiculo; }
    public int getDistanciaRecorrida() { return distanciaRecorrida; }
    public void setDistanciaRecorrida(int distancia) { this.distanciaRecorrida = distancia; }
    
    // Método para acciones especiales del jugador humano
    public void usarTurbo() {
        if (vehiculo instanceof AutoSport) {
            ((AutoSport) vehiculo).activarTurbo();
            System.out.println(nombre + " usó el turbo!");
        }
    }
}
