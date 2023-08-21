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
import modelos.Salida;

/**
 *
 * @author Jorge Chávez
 */
public class TSalida {
    private final Conexion conexion = new Conexion();
    private Connection conn; // Gestiona la conexion.
    private PreparedStatement mostrarRegistros;
    private PreparedStatement modificarRegistro;
    private ArrayList<Salida> lista = new ArrayList();
    
    public TSalida() {
        try {
            conn = conexion.getConexion();
            mostrarRegistros = conn.prepareStatement("Select * from Inventario");
            modificarRegistro = conn.prepareStatement("Update Inventario set nombre = ?,"
                    + " descripcion = ?, stock = ? where CodProducto = ?");
            lista = new ArrayList<>();

            lista = listarSalida();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }
    }

    /**
     *
     * @return
     */
    private ArrayList<Salida> listarSalida() {
        ArrayList<Salida> result = null;
        ResultSet rs = null;
        try {
            rs = mostrarRegistros.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                result.add(new Salida  (
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
            for (Salida R : lista) {
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


    public int modificarProductoBD(Salida salidas) {
        int result = 0;
        try {
            modificarRegistro.setString(1, salidas.getNombre());
            modificarRegistro.setString(2, salidas.getDescripcion());
            modificarRegistro.setInt(3, salidas.getStock());
            modificarRegistro.setInt(4, salidas.getCodProducto());
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
        for (Salida salidas  : lista) {
            switch (salidas.getEstado()) {
                case 1:
                    //Si es original no hace nada
                    break;
                case 2:
                    //Estado modificado
                    if (this.modificarProductoBD(salidas) != 0) {
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
        lista = this.listarSalida();
        return msn;
    }

    public ArrayList<Salida> getLista() {
        return lista;
    }
}
