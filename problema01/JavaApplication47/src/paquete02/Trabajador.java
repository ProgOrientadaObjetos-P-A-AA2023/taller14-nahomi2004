/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author D E L L
 */
public class Trabajador {

    /*
    cédula, nombres, correo, sueldo, mes del sueldo.
     */
    private String cedula;
    private String nombres;
    private String correo;
    private double sueldo;
    private String mes;
    Scanner entrada;

    public Trabajador() {
        this.entrada = new Scanner(System.in);
    }

    public Trabajador(String c, String n, String co, double s, String m) {
        cedula = c;
        nombres = n;
        correo = co;
        sueldo = s;
        mes = m;        
    }

    public int Menu() {
        System.out.println("");
        System.out.println("Ingresar un trabajador [1]");
        System.out.println("Salir                  [0]");
        return entrada.nextInt();
    }

    public String obtenerCedula() {
        return cedula;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public void establecerNombres(String n) {
        nombres = n;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public void establecerCorreo(String n) {
        correo = n;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerSueldo(double n) {
        sueldo = n;
    }

    public String obtenerMes() {
        return mes;
    }

    public void establecerMes(String n) {
        mes = n;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombres: %s\n"
                + "Cédula: %s\n"
                + "Correo: %s\n"
                + "Sueldo: %.2f\n"
                + "Mes del sueldo: %s\n",
                obtenerNombres(),
                obtenerCedula(),
                obtenerCorreo(),
                obtenerSueldo(),
                obtenerMes());
        return cadena;
    }
}
