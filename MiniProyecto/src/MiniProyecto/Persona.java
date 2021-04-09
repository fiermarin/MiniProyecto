package MiniProyecto;

public class Persona {
	private String nombre;
	private String apellido;
	private int ci;
	private int telefono;
	private String direccion;
	private String fechaNacimiento;
	private String carnetSalud;
	private String sexo;

	public Persona() {
		//super();
	}

	public Persona(String nombre, String apellido, int ci, int telefono, String direccion, String fechaNacimiento,
			String carnetSalud, String sexo) {
		//super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.ci = ci;
		this.telefono = telefono;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
		this.carnetSalud = carnetSalud;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCarnetSalud() {
		return carnetSalud;
	}

	public void setCarnetSalud(String carnetSalud) {
		this.carnetSalud = carnetSalud;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
