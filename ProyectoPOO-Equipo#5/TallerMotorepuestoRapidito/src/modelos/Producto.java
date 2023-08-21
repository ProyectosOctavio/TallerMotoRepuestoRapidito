package modelos;

public class Producto {

    private int CodProducto;
    private String nombre;
    private String descripcion;
    private String estante;
    private float precio;
    private int stock;
    private int estado;

    public Producto() {
        
    }

    public Producto(int CodProducto, String nombre, String descripcion, String estante, float precio, int stock, int estado) {
        this.CodProducto = CodProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estante = estante;
        this.precio = precio;
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

    public String getEstante() {
        return estante;
    }

    public void setEstante(String estante) {
        this.estante = estante;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
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



}//end Producto