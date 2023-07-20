/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import paquete02.*;
import paquete03.*;
/**
 *
 * @author Usuario
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Enlace etto=  new Enlace();
        
        etto.obtenerDataTrabajador();
        
        for (int i = 0; i < etto.obtenerArrayList().size(); i++) {
            System.out.printf("%s\n", etto.obtenerArrayList().get(i));
        }
    }
}

/*
double[] n1 = {9.2, 10.0, 7.5};
        double[] n2 = {8.1, 9.1, 5.5};
        double[] n3 = {7.1, 6.1, 9.2};
        double[] n4 = {8.1, 9.1, 8.2};
        double[] n5 = {4.4, 9.1, 7.2};
        double[] n6 = {7.2, 9.1, 7.2};
        double[] n7 = {8.1, 8.9, 5.9};
        
        Estudiante[] e1 = {new Estudiante("René Elizalde", n1), 
            new Estudiante("José Mora", n2), new Estudiante("Luis Suarez", n3),
            new Estudiante("Sara Diaz", n4), new Estudiante("Marco Salinas", n5),
            new Estudiante("Juan Silva", n6), new Estudiante("Rosa Jara", n7)};
       
        for (int i = 0; i < e1.length; i++) {
            Estudiante etto = e1[i];
            etto.establecerPromedio();
            System.out.println(etto);
        }
*/