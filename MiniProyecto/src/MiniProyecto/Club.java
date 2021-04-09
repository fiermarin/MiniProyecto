package MiniProyecto;

public class Club {
	private String nombre;
	private String direccion;
	private String telefono;
	private String paginaWeb;

	public Club() {
	}

	public Club(String nombre, String direccion, String telefono, String paginaWeb) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.paginaWeb = paginaWeb;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	@Override
	public String toString() {
		return "" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", pagina Web="
				+ paginaWeb + "";
	}
}
