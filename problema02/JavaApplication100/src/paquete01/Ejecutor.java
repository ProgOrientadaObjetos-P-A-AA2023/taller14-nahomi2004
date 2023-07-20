/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;
import java.util.ArrayList;
import paquete02.*;
/**
 *
 * @author Usuario
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Notas> notas;
        double[] n;
        // ArrayList<Double> n;
        
        
        Promedio p1 =  new Promedio("René Elizalde", n);
        n = new double[3];
        for(int i=0; i<n.length; i++){
           n[0] = 9.2;
           n[1] = 10.0;
           n[2] = 7.5;
        }
        /*calificacionesEstudiante = new Calificacion[numerocalificaciones];

        for (int i = 0; i < numerocalificaciones; i++) {
            System.out.printf("Ingrese nombre de materia %d\n", i + 1);
            materia = entrada.nextLine();
            System.out.printf("Ingrese calificación %d\n", i + 1);
            nota = entrada.nextDouble();
            entrada.nextLine();*/
    }
    
}
/*
René Elizalde
  Calificaciones:
  9.2
  10.0
  7.5
  Promedio ?

José Mora
  Calificaciones:
  8.1
  9.1
  5.5
  Promedio ?

Luis Suarez
  Calificaciones:
  7.1
  6.1
  9.2
  Promedio ?

Sara Diaz
  Calificaciones:
  8.1
  9.1
  8.2
  Promedio ?

Marco Salinas
  4.4
  8.9
  9.2
  Promedio ?

Juan Silva
  Calificaciones:
  10.0
  9.1
  7.2
  Promedio ?

Rosa Jara
  Calificaciones:
  8.1
  8.9
  5.9
  Promedio ?
*/