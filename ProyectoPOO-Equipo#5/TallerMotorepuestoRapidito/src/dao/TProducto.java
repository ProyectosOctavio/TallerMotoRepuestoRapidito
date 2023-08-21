package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.Producto;

/**
 *
 * @author Jorge Chávez 
 */
public class TProducto {
    
    private final Conexion conexion = new Conexion();
    private Connection conn; // Gestiona la conexion.
    private PreparedStatement mostrarRegistros;
    private PreparedStatement insertarRegistro;
    private PreparedStatement modificarRegistro;
    private PreparedStatement eliminarRegistro;
    private ArrayList<Producto> lista = new ArrayList();
    
    public TProducto() {
        try {
            conn = conexion.getConexion();
            mostrarRegistros = conn.prepareStatement("Select * from Inventario");
            insertarRegistro = conn.prepareStatement("Insert Into Inventario (CodProducto,"
                    + " nombre, descripcion, estante, precio, stock) Values(?, ?, ?, ?, ? , ?)");
            modificarRegistro = conn.prepareStatement("Update Inventario set nombre = ?,"
                    + " descripcion = ?, estante = ?, precio = ?, stock = ? where CodProducto = ?");
            eliminarRegistro = conn.prepareStatement("Delete From Inventario where CodProducto = ?");
            lista = new ArrayList<>();

            lista = listarProducto();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }
    }

    /**
     *
     * @return
     */
    private ArrayList<Producto> listarProducto() {
        ArrayList<Producto> result = null;
        ResultSet rs = null;
        try {
            rs = mostrarRegistros.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                result.add(new Producto  (
                        rs.getInt("CodProducto"), 
                        rs.getString("nombre"), 
                        rs.getString("descripcion"), 
                        rs.getString("estante"), 
                        rs.getFloat("precio"), 
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

     
    public int addProducto(int CodProducto, String nombre, String descripcion,
            String estante, float precio, int stock) {
        int b = 0;
        try {
            lista.add(new Producto(
                    CodProducto,
                    nombre,
                    descripcion,
                    estante,
                    precio,
                    stock,
                    4
            ));
            b = 1;
            return b;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return b;
    }

   
    public int modificarProducto(int CodProducto, String nombre, String descripcion,
            String estante, float precio, int stock) {
        try {
            Producto productos = new Producto(
                    CodProducto,
                    nombre,
                    descripcion,
                    estante,
                    precio,
                    stock,
                    2 // estado Modificado en la lista, no guardado en la BD
            );
            for (Producto R : lista) {
                if (R.getCodProducto()== R.getCodProducto()) {
                    R.setNombre(productos.getNombre());
                    R.setDescripcion(productos.getDescripcion());
                    R.setEstante(productos.getEstante());
                    R.setPrecio(productos.getPrecio());
                    R.setStock(productos.getStock());
                    if (R.getEstado() != 0) {
                        R.setEstado(productos.getEstado());
                    }
                    return 1;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    public int eliminarProducto(int CodProducto) {
        try {
            for (Producto R : lista) {
                if (R.getCodProducto()== CodProducto) {
                    R.setEstado(3); //estado Eliminado en la lista,
                    //aun no eliminado en la base de datos.
                    return 1;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    public int agregarProductoBD(Producto productos) {
        int result = 0;
        try {
            insertarRegistro.setInt(1, productos.getCodProducto());
            insertarRegistro.setString(2, productos.getNombre());
            insertarRegistro.setString(3, productos.getDescripcion());
            insertarRegistro.setString(4, productos.getEstante());
            insertarRegistro.setFloat(5, productos.getPrecio());
            insertarRegistro.setInt(6, productos.getStock());
            result = insertarRegistro.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            conexion.close(conn);
        }
        return result;
    }

    public int modificarProductoBD(Producto productos) {
        int result = 0;
        try {
            modificarRegistro.setString(1, productos.getNombre());
            modificarRegistro.setString(2, productos.getDescripcion());
            modificarRegistro.setString(3, productos.getEstante());
            modificarRegistro.setFloat(4, productos.getPrecio());
            modificarRegistro.setInt(5, productos.getStock());
            modificarRegistro.setInt(6, productos.getCodProducto());
            result = modificarRegistro.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            conexion.close(conn);
        }
        return result;
    }

    public int eliminarProductoBD(Producto productos) {
        int result = 0;
        try {
            eliminarRegistro.setInt(1, productos.getCodProducto());

            result = eliminarRegistro.executeUpdate();
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
        for (Producto productos  : lista) {
            switch (productos.getEstado()) {
                case 1:
                    //Si es original no hace nada
                    break;
                case 2:
                    //Estado modificado
                    if (this.modificarProductoBD(productos) != 0) {
                        modificados++;
                    } else {
                        errorModificados++;
                        msnError += "\n - Error al modificar ";
                    }
                    break;
                case 3:
                    //Estado eliminado
                    if (this.eliminarProductoBD(productos) != 0) {
                        eliminados++;
                    } else {
                        errorEliminados++;
                        msnError += "\n - Error al eliminar ";
                    }
                    break;
                case 4:
                    //Estado nuevo registro
                    if (this.agregarProductoBD(productos) != 0) {
                        nuevos++;
                    } else {
                        errorNuevos++;
                        msnError += "\n -Error al agregar nuevo registro ";
                    }
                    break;
                default:
                    msnError += "\n Revise el registro ";
                    break;
            }
        }
        msn = "Registros guardados: " + nuevos + "\nRegistros editados: " + modificados
                + "\nRegistros eliminados: " + eliminados;

        if (!msnError.equals("Errores en: ")) {
            msn += "\n" + msnError;
        }
        lista = this.listarProducto();
        return msn;
    }

    public ArrayList<Producto> getLista() {
        return lista;
    }
}//end DaoTrabajador

