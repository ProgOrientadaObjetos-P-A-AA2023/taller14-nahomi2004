/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Usuario
 */
public class Notas {
    private double calif;

    public Notas(double ca){
        calif = ca;
    }

    public Notas() {
    }
    
    public void establecerCalif(double p) {
        calif = p;
    }

    public double obtenerCalif() {
        return calif;
    }
    
    
}
