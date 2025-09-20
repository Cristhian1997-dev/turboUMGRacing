/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mucun
 */
import java.util.Random;

public class IAJugador extends Jugador {
    //Atributos usando el random() para que sea la cpu quien controle
    private Random random;
    private String dificultad; //Eleccion de dificultad
    
    public IAJugador(String nombre, Vehiculo vehiculo, String dificultad){
        super(nombre, vehiculo);
        this.random = new Random();
        this.dificultad = dificultad;
    }
    
    //Metodo para que la CPU tome decisiones segun la dificultad
    public void tomarDecision(){
        switch(dificultad){
            case "Dificil":
            if (random.nextDouble() < 0.7){
                super.usarTurbo();
            }
                break;
            case "Medio":
                if (random.nextDouble() < 0.4){
                    super.usarTurbo();
                }
                break;
            case "Facil":
                if (random.nextDouble() < 0.1){
                    super.usarTurbo();
                }
                break;
        }
    }
    @Override
        public String getNombre(){
        return super.getNombre() + " (CPU)";
    }
    }