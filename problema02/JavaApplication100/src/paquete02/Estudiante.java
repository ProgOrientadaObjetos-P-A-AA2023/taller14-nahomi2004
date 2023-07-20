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
public class Estudiante {
    private String nombre;
    private String apellido;
    private double[] notas;
    private double promedio;
    
    public Estudiante(String n, String a, double[] no){
        nombre = n;
        apellido = a;
        notas = no;
    }

    public void establecerNombre(String p) {
        nombre = p;
    }
    
    public void establecerApellido(String p) {
        apellido = p;
    }

    public void establecerNotas(double[] p) {
        notas = p;
    }

    public void establecerPromedio() {
        double suma = 0;
        for(int i=0; i< notas.length; i++){
            suma += notas[i];
        }
        promedio = suma/notas.length;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double[] obtenerNotas() {
        return notas;
    }

    public double obtenerPromedio() {
        return promedio;
    }
    
    @Override
    public String toString() {
       String cadena = String.format("%s %s\n"
               + "Calificaciones:", 
               obtenerNombre(),
               obtenerApellido());
       
        for(int i = 0; i < obtenerNotas().length; i++){
            cadena = String.format("%s\n\t%.2f", cadena, obtenerNotas()[i]);
        }
        cadena = String.format("%s\n\tPromedio: %.2f\n", cadena, obtenerPromedio());
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
                + "Estudiante cualitativo: %s\n",  
                cadena, obtenerPromedio(), obtenerPromedioCualitativo());
        return cadena;
    }*/