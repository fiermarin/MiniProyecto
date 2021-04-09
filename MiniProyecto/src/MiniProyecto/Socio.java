package MiniProyecto;

public class Socio extends Persona {

	private int desca;
	private int descc;
	private int descf;

	public Socio(String nombre, String apellido, int ci, int tel, String direccion, String fechanac, String canetsal,
			String sexo, int desca,int descc,int descf) {
		super(nombre, apellido, ci, tel, direccion, fechanac, canetsal, sexo);
		this.desca = desca;
		this.descc = descc;
		this.descf = descf;

	}

	public int getDesca() {
		return desca;
	}

	public void setDesca(int desca) {
		this.desca = desca;
	}

	public int getDescc() {
		return descc;
	}

	public void setDescc(int descc) {
		this.descc = descc;
	}

	public int getDescf() {
		return descf;
	}

	public void setDescf(int descf) {
		this.descf = descf;
	}

}
