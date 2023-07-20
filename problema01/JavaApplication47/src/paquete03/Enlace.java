/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author D E L L
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import paquete02.Trabajador;

public class Enlace {

    private Connection conn;
    ArrayList<Trabajador> lista = new ArrayList<>();

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/trabajadores.bd";
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

    public void insertarTrabajador(Trabajador t1) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO trabajadores (nombres,"
                    + "cedula, correo, sueldo, mes) "
                    + "values ('%s', '%s', '%s', %s, '%s')",
                    t1.obtenerNombres(),
                    t1.obtenerCedula(),
                    t1.obtenerCorreo(),
                    t1.obtenerSueldo(),
                    t1.obtenerMes());
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
            String data = "Select * from trabajadores;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                Trabajador t1 = new Trabajador();
                t1.establecerNombres(rs.getString("nombres"));
                t1.establecerCedula(rs.getString("cedula"));
                t1.establecerCorreo(rs.getString("correo"));
                t1.establecerSueldo(rs.getInt("sueldo"));
                t1.establecerMes(rs.getString("mes"));
                lista.add(t1);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarTrabajador");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<Trabajador> obtenerArrayList() {
        return lista;
    }
}
