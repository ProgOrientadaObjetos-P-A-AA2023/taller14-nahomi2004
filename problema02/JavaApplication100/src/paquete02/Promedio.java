/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Promedio {
    private String nombre;
    private ArrayList<Notas> notas; 
    private double promedio;
    
    public Promedio(String n, ArrayList<Notas> calif){
        nombre = n;
        notas = calif;
    }

    public void establecerNombre(String p) {
        nombre = p;
    }

    public void establecerNotas(ArrayList<Notas> p) {
        notas = p;
    }

    public void establecerPromedio() {
        double suma = 0;
        for(int i=0; i< notas.size(); i++){
            suma += notas.get(i).obtenerCalif();
        }
        promedio = suma/notas.size();
    }

    public String obtenerNombre() {
        return nombre;
    }

    public ArrayList<Notas> obtenerNotas() {
        return notas;
    }

    public double obtenerPromedio() {
        return promedio;
    }
    
    @Override
    public String toString() {
       String cadena = String.format("Nombre: %s\t\nCalificaciones:\n", 
               obtenerNombre());
       
        for(int i=0; i< notas.size(); i++){
            obtenerNotas().get(i).obtenerCalif();
        }
        cadena = String.format("%s\tPromedio: %.2f\n", obtenerPromedio());
        return cadena;
    }
}
/*String cadena = "Libreta de Calificaciones\n";
        cadena = String.format("%sNombre: %s\nCalificaciones:\n", cadena, 
                obtenerEstudiante());
        
        for (int i = 0; i < obtenerCalificaciones().length; i++) {
            cadena = String.format("%s\t\t%s [%.2f] - %s - %s\n", cadena, 
                    obtenerCalificaciones()[i].obtenerNombreMateria(),
                    obtenerCalificaciones()[i].obtenerNota(),
                    obtenerCalificaciones()[i].obtenerProfesor().obtenerNombre(),
                    obtenerCalificaciones()[i].obtenerProfesor().obtenerTipo());
        }
        cadena = String.format("%sPromedio calificaciones: %.2f\n"
                + "Promedio cualitativo: %s\n",  
                cadena, obtenerPromedio(), obtenerPromedioCualitativo());
        return cadena;
    }*/