package MiniProyecto;

public class Ingreso {

	private int frecuencia;
	private String fechaing;
	private String horario;
	
	public Ingreso(int frecuencia, String fechaing, String horario) {
		
		this.frecuencia = frecuencia;
		this.fechaing = fechaing;
		this.horario = horario;
	}

	public Ingreso() {
		
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}

	public String getFechaing() {
		return fechaing;
	}

	public void setFechaing(String fechaing) {
		this.fechaing = fechaing;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
	
	
	
	
}


