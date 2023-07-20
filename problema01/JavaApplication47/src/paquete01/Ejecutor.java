/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author D E L L
 */
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import paquete03.Enlace;
import paquete02.Trabajador;

public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Enlace enlace = new Enlace();
        Scanner entrada = new Scanner(System.in);
        Trabajador aux = new Trabajador();
        int op;

        do {
            op = aux.Menu();
            switch (op) {
                case 1 -> {
                    System.out.println("Por favor, ingrese su/s: ");
                    System.out.print("Nombres: ");
                    String nombre = entrada.next();
                    entrada.next();
                    System.out.print("Cédula: ");
                    String cd = entrada.next();
                    System.out.print("Correo: ");
                    String email = entrada.next();
                    System.out.print("Mes de sueldo: ");
                    String mes = entrada.next();
                    System.out.print("Sueldo: ");
                    double sueldo = entrada.nextDouble();

                    Trabajador t1 = new Trabajador(cd, nombre, email, sueldo, mes);

                    enlace.insertarTrabajador(t1);
                }

                case 0 -> {
                    System.out.println("");
                    System.out.println("Gracias y adiós");
                }

                default -> {
                    System.err.println("Opción inválida...");
                    System.out.println("Adiós");
                }
            }
        } while (op != 0);

        enlace.obtenerDataTrabajador();
        System.out.println("");
        
        if (enlace.obtenerArrayList().size() > 0) {
            System.out.println("INFORMACIÓN DE TRABAJADOR/ES");

            for (int i = 0; i < enlace.obtenerArrayList().size(); i++) {
                System.out.printf("Trabajador %d\n", i + 1);
                System.out.printf("%s\n", enlace.obtenerArrayList().get(i));
            }

        } else {
            System.out.println("No hay información que imprimir");
        }
    }
}
/*
    Generar un programa que permita ingresar por teclado información que 
    corresponde a sueldos de trabajadores. Por cada trabajador ingresar: 
    cédula, nombres, correo, sueldo, mes del sueldo.
    La información debe quedar registrada en un base de datos.

    El proceso de ingreso es iterativo hasta que el usuario decida lo contrario.
 */
