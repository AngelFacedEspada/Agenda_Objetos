
public class Usuario {

	private String nombre;
	private int numero;
	
	public Usuario(String nombre, int numero) {
		super();
		this.nombre = nombre;
		this.numero = numero;
	}

	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Usuario(int numero) {
		super();
		this.numero = numero;
	}

	public Usuario() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", numero=" + numero + "]";
	}
	
	
}
