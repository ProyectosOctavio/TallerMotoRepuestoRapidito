/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Jorge Chávez
 */
public class Salida {
    private int CodProducto;
    private String nombre;
    private String descripcion;
    private int stock;
    private int estado;

    public Salida() {
        
    }

    public Salida(int CodProducto, String nombre, String descripcion, int stock, int estado) {
        this.CodProducto = CodProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
        this.estado = estado;
    }

    public int getCodProducto() {
        return CodProducto;
    }

    public void setCodProducto(int CodProducto) {
        this.CodProducto = CodProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
