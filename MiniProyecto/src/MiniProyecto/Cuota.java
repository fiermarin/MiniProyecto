package MiniProyecto;
import MiniProyecto.Socio;

public class Cuota {
	private int costo;
	private String fecha;
	private String comprobante;
	private Socio socio1 = null;
	
	public Cuota(int costo, String fecha, String comprobante) {
		this.costo = costo;
		this.fecha = fecha;
		this.comprobante = comprobante;
	}

	public Cuota() {
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getComprobante() {
		return comprobante;
	}

	public void setComprobante(String comprobante) {
		this.comprobante = comprobante;
	}

	@Override
	public String toString() {
		return "Cuota costo=" + costo + ", fecha=" + fecha + ", comprobante=" + comprobante + "";
	}
	
	
}
