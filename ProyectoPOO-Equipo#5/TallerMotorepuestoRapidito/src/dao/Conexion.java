/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Conexion {

    private static final String SERVIDOR = "Localhost";
    private static final String USUARIO = "sa ";
    private static final String PW = "1234";
    private static final String NOMBREBD = "RTaller";
    private static final String PUERTO = "1433";
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public Connection getConexion() {
        try {
            String connectionUrl = "jdbc:sqlserver://" + SERVIDOR + ": " + PUERTO
                    + "; Databasename= " + NOMBREBD + "; user= " + USUARIO
                    + "; password = " + PW + ";";
            Class.forName(DRIVER);
            return (DriverManager.getConnection(connectionUrl));
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);   
        }
        return null;
    }
    
    public void close(Connection conn) {
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } 
}
