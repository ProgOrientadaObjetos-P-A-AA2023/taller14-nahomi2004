/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import paquete02.*;
/**
 *
 * @author Usuario
 */
public class Enlace {
   private Connection conn;
    ArrayList<Estudiante> lista = new ArrayList<>();

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/base001.base";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarTrabajador(Estudiante est1) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO estudiante (nombre,"
                    + "apellido, calificacion1, calificacion2, calificacion3) "
                    + "values ('%s', '%s', '%s', %s, '%s')",
                    est1.obtenerNombre(),
                    est1.obtenerApellido(),
                    est1.obtenerNotas()[0],
                    est1.obtenerNotas()[1],
                    est1.obtenerNotas()[2]);
            // System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public void obtenerDataTrabajador() {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from estudiante;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                double [] aux = {rs.getDouble("calificacion1"),
                                rs.getDouble("calificacion2"),
                                rs.getDouble("calificacion3")};
                
                Estudiante est1 = new Estudiante(rs.getString("nombre"),
                rs.getString("apellido"), aux);
                est1.establecerPromedio();
                lista.add(est1);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarEstudiante");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<Estudiante> obtenerArrayList() {
        return lista;
    }
}
