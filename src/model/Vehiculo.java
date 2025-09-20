/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mucun
 */
public abstract class Vehiculo {
    //Atributos base de cada Vehiculo
    protected String Nombre;
    protected String Tamaño;
    protected int VelocidadFinal;
    protected int Aceleracion;
    protected int velocidadActual;
    
    //Constructor de cada vehiculo
    public Vehiculo(String Nombre, String Tamaño, int VelocidadFinal, int Aceleracion){
        this.Nombre = Nombre;
        this.Tamaño = Tamaño;
        this.VelocidadFinal = VelocidadFinal;
        this.Aceleracion = Aceleracion;
        this.velocidadActual = 0;
    }
    
    //Metodos de los Vehiculos
    public String getNombre(){return Nombre;}
    public String getTamaño(){return Tamaño;}
    public int getVelocidadFinal(){return VelocidadFinal;}
    public int getAceleracion(){return Aceleracion;}
    public int getVelocidadActual (){return velocidadActual;}
    
    public void acelerar(int incremento){
        velocidadActual = Math.min(velocidadActual + incremento, VelocidadFinal);
    }
    public void frenar(int decremento) {
      velocidadActual = Math.max(velocidadActual - decremento, 0);
    }
    
    public abstract void Avanzar();
}
