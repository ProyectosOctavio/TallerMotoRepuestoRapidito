/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import modelos.Venta;

/**
 *
 * @author Soldier2075
 */
public class TVenta {
  private final Conexion conexion = new Conexion();
    private Connection conn; // Gestiona la conexion.
    private PreparedStatement mostrarRegistros;
    private PreparedStatement insertarRegistro;
    private PreparedStatement modificarRegistro;
    private PreparedStatement eliminarRegistro;
    private ArrayList<Venta> lista = new ArrayList();
    
    public TVenta() {
        try {
            conn = conexion.getConexion();
            mostrarRegistros = conn.prepareStatement("Select * from Inventario");
            insertarRegistro = conn.prepareStatement("Insert Into Inventario (CodProducto,"
                    + " nombre, descripcion, estante, precio, stock, salida) Values(?, ?, ?, ?, ? , ?, ?)");
            modificarRegistro = conn.prepareStatement("Update Inventario set nombre = ?,"
                    + " descripcion = ?, estante = ?, precio = ?, stock = ?, salida = ? where CodProducto = ?");
            eliminarRegistro = conn.prepareStatement("Delete From Inventario where CodProducto = ?");
            lista = new ArrayList<>();

            lista = listarVenta();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }
    }

    /**
     *
     * @return
     */
    private ArrayList<Venta> listarVenta() {
        ArrayList<Venta> result = null;
        ResultSet rs = null;
        try {
            rs = mostrarRegistros.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                result.add(new Venta  (
                        rs.getInt("CodProducto"), 
                        rs.getString("nombre"), 
                        rs.getString("descripcion"), 
                        rs.getString("estante"), 
                        rs.getFloat("precio"), 
                        rs.getInt("stock"), 
                        rs.getInt("salida"),
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

     
    public int addProducto(int CodProducto, String nombre, String descripcion,
            String estante, float precio, int stock, int salida) {
        int b = 0;
        try {
            lista.add(new Venta(
                    CodProducto,
                    nombre,
                    descripcion,
                    estante,
                    precio,
                    stock,
                    salida,
                    4
            ));
            b = 1;
            return b;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return b;
    }

   
    public int modificarProducto(int CodProducto, String nombre, String descripcion, String estante, float precio, int stock, int salida) {
        int b = 0;
        try {
            for (Venta R : lista) {
                if (R.getCodProducto() == R.getCodProducto()) {
                    b = 1;
                    R.setNombre(nombre);
                    R.setDescripcion(descripcion);
                    R.setEstante(estante);
                    R.setPrecio(precio);
                    R.setStock(stock);
                    R.setSalida(salida);
                    R.setEstado(2);
                    return b;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

   public int modificarProductoBD(Venta ventas) {
        int result = 0;
        try {
            modificarRegistro.setString(1, ventas.getNombre());
            modificarRegistro.setString(2, ventas.getDescripcion());
            modificarRegistro.setString(3, ventas.getEstante());
            modificarRegistro.setFloat(4, ventas.getPrecio());
            modificarRegistro.setInt(5, ventas.getStock());
            modificarRegistro.setInt(6, ventas.getSalida());
            modificarRegistro.setInt(7, ventas.getCodProducto());
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
        for (Venta ventas  : lista) {
            switch (ventas.getEstado()) {
                case 1:
                    //Si es original no hace nada
                    break;
                case 2:
                    //Estado modificado
                    if (this.modificarProductoBD(ventas) != 0) {
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
        msn = "Registros guardados: "  + modificados;

        if (!msnError.equals("Errores en: ")) {
            msn += "\n" + msnError;
        }
        lista = this.listarVenta();
        return msn;
    }

    public ArrayList<Venta> getLista() {
        return lista;
    }
   }
