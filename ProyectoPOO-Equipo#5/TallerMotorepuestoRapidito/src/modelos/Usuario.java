package modelos;



/**
 * @author Yizark
 * @version 1.0
 * @created 28-Nov-2021 4:44:00 PM
 */
public class Usuario {

	private int contrasena;
	private String nombre;

	public Usuario(){

	}

    public Usuario(int contrasena, String nombre) {
        this.contrasena = contrasena;
        this.nombre = nombre;
    }

    public int getContrasena() {
        return contrasena;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

	public void finalize() throws Throwable {

	}
	public void iniciarSesion(){

	}
}//end Usuario