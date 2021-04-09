package MiniProyecto;
import java.util.Arrays;
import java.util.Scanner;

public class Funcionario extends Persona{
	private float[] horario = new float[2];
	private String[] dias = new String[7];
	private String cargo;

	public Funcionario(String nombre, String apellido, int ci, int telefono, String direccion, String fechaNacimiento, String carnetSalud, String sexo, float[] horario, String[] dias, String cargo) {
		super(nombre, apellido, ci, telefono, direccion, fechaNacimiento, carnetSalud, sexo);
		this.horario = horario;
		this.dias = dias;
		this.cargo = cargo;
	}

	public float[] getHorario() {
		return horario;
	}

	public void setHorario(float[] horario) {
		this.horario = horario;
	}

	public String[] getDias() {
		return dias;
	}

	public void setDias(String[] dias) {
		this.dias = dias;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public boolean incentivo(String[] dias,float[] horario) {
		float horarioCompleto=0;
		int cantidadDias=0;
		Boolean incentivo;
		for (int i=0;i<horario.length;i++) {
			float entrada= horario[0];
			float salida= horario[1];
			horarioCompleto=salida-entrada;	
		}
		for (int j=0; j<dias.length;j++) {
			cantidadDias= 0;
			if (dias[j]!="No") {
				cantidadDias++;
			}
		}
		if (cantidadDias>4&&horarioCompleto>8) {
			incentivo=true;
		}
		else {
			incentivo=false;				
		}
		return incentivo;
	}

	public void trabajar() {
		Scanner[]diasTrabajo=new Scanner[7];
		System.out.println("Ingrese los dias de trabajo");
		diasTrabajo[0]= new Scanner(System.in);
		diasTrabajo[1]= new Scanner(System.in);
		diasTrabajo[2]= new Scanner(System.in);
		diasTrabajo[3]= new Scanner(System.in);
		diasTrabajo[4]= new Scanner(System.in);
		diasTrabajo[5]= new Scanner(System.in);
		diasTrabajo[6]= new Scanner(System.in);
		Scanner[] horarioTrabajo=new Scanner[2];
		System.out.println("ingrese en horario de entrada");
		horarioTrabajo[0]= new Scanner(System.in);
		System.out.println("ingrese horario de salida");
		horarioTrabajo[1]=new Scanner(System.in);
	}

	@Override
	public String toString() {
		return super.toString().concat("  horario=" + Arrays.toString(horario) + ", dias=" + Arrays.toString(dias) + ", cargo="
				+ cargo + "");
	}

}
