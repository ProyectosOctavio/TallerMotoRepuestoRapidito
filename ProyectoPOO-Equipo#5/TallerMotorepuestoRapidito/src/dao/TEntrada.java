/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.Entrada;

/**
 *
 * @author Jorge Chávez
 */
public class TEntrada {
    private final Conexion conexion = new Conexion();
    private Connection conn; // Gestiona la conexion.
    private PreparedStatement mostrarRegistros;
    private PreparedStatement modificarRegistro;
    private ArrayList<Entrada> lista = new ArrayList();
    
    public TEntrada() {
        try {
            conn = conexion.getConexion();
            mostrarRegistros = conn.prepareStatement("Select * from Inventario");
            modificarRegistro = conn.prepareStatement("Update Inventario set nombre = ?,"
                    + " descripcion = ?, stock = ? where CodProducto = ?");
            lista = new ArrayList<>();

            lista = listarEntrada();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }
    }

    /**
     *
     * @return
     */
    private ArrayList<Entrada> listarEntrada() {
        ArrayList<Entrada> result = null;
        ResultSet rs = null;
        try {
            rs = mostrarRegistros.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                result.add(new Entrada  (
                        rs.getInt("CodProducto"), 
                        rs.getString("nombre"), 
                        rs.getString("descripcion"), 
                        rs.getInt("stock"), 
                        1
                ));
         
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                conexion.close(conn);
            }
        }
        return result;
    }

    public int modificarProducto(int CodProducto, String nombre, String descripcion,
             int stock) {
        int b = 0;
        try {
            for (Entrada R : lista) {
                if (R.getCodProducto() == R.getCodProducto()) {
                    b = 1;
                    R.setNombre(nombre);
                    R.setDescripcion(descripcion);
                    R.setStock(stock);
                    R.setEstado(2);
                    return b;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }


    public int modificarProductoBD(Entrada entradas) {
        int result = 0;
        try {
            modificarRegistro.setString(1, entradas.getNombre());
            modificarRegistro.setString(2, entradas.getDescripcion());
            modificarRegistro.setInt(3, entradas.getStock());
            modificarRegistro.setInt(4, entradas.getCodProducto());
            result = modificarRegistro.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            conexion.close(conn);
        }
        return result;
    }

    public String actualizarBD() {
        String msn = "";
        String msnError = "Errores en: ";
        int nuevos = 0, modificados = 0, eliminados = 0;
        int errorNuevos = 0, errorModificados = 0, errorEliminados = 0;
        for (Entrada entradas  : lista) {
            switch (entradas.getEstado()) {
                case 1:
                    //Si es original no hace nada
                    break;
                case 2:
                    //Estado modificado
                    if (this.modificarProductoBD(entradas) != 0) {
                        modificados++;
                    } else {
                        errorModificados++;
                        msnError += "\n - Error al modificar ";
                    }
                    break;
                default:
                    msnError += "\n Revise el registro ";
                    break;
            }
        }
        msn = "Registros guardados: " + modificados;

        if (!msnError.equals("Errores en: ")) {
            msn += "\n" + msnError;
        }
        lista = this.listarEntrada();
        return msn;
    }

    public ArrayList<Entrada> getLista() {
        return lista;
    }
}
