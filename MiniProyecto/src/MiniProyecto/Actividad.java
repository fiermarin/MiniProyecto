package MiniProyecto; 

public class Actividad {
	private String dia;
	private String hora;
	private String sexo;
	private String lugar;
	private int edadmax;
	private int edadmin;
	
	public Actividad(String dia, String hora, String sexo, String lugar, int edadmax, int edadmin) {
		this.dia = dia;
		this.hora = hora;
		this.sexo = sexo;
		this.lugar = lugar;
		this.edadmax = edadmax;
		this.edadmin = edadmin;
	}

	public Actividad() {
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getEdadmax() {
		return edadmax;
	}

	public void setEdadmax(int edadmax) {
		this.edadmax = edadmax;
	}

	public int getEdadmin() {
		return edadmin;
	}

	public void setEdadmin(int edadmin) {
		this.edadmin = edadmin;
	}
}
