package MiniProyecto;

public class Socio extends Persona {

	private int descAntiguedad;
	private int descCompetencia;
	private int descFuncionario;

	public Socio(String nombre, String apellido, int ci, int tel, String direccion, String fechanac, String canetsal, String sexo, int descAntiguedad,int descCompetencia,int descFuncionario) {
		super(nombre, apellido, ci, tel, direccion, fechanac, canetsal, sexo);
		this.descAntiguedad = descAntiguedad;
		this.descCompetencia = descCompetencia;
		this.descFuncionario = descFuncionario;
	}

	public int getDesca() {
		return descAntiguedad;
	}

	public void setDesca(int desca) {
		this.descAntiguedad = desca;
	}

	public int getDescc() {
		return descCompetencia;
	}

	public void setDescc(int descc) {
		this.descCompetencia = descc;
	}

	public int getDescf() {
		return descFuncionario;
	}

	public void setDescf(int descf) {
		this.descFuncionario = descf;
	}

	@Override
	public String toString() {
		return super.toString().concat(" descuento por antiguedad=" + descAntiguedad + ", descuento por competencia=" + descCompetencia + ", descuento por funcionario=" + descFuncionario + "");
	}

}
