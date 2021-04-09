package MiniProyecto;

public class Competencia {
	private String nombre;
	private String fecha;
	private String lugar;
	private String nivel;
	
	public Competencia(String nombre, String fecha, String lugar, String nivel) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.lugar = lugar;
		this.nivel = nivel;
	}

	public Competencia() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
}


