package MiniProyecto;
import MiniProyecto.Socio;

public class Gimnasio {
	private String nombre;
	private String espacio;
    private Actividad actividad1 = null;
    private Club club1 = null;
    
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Gimnasio(String nombre, String espacio) {
		this.nombre = nombre;
		this.espacio = espacio;
	}

	public Gimnasio() {
	}

	public String getEspacio() {
		return espacio;
	}

	public void setEspacio(String espacio) {
		this.espacio = espacio;
	}

	@Override
	public String toString() {
		return "Gimnasio nombre=" + nombre + ", espacio=" + espacio + "";
	}
}