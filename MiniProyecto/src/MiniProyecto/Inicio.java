package MiniProyecto;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Inicio {

	public static void main(String[] args) {
		Scanner sn = new Scanner (System.in);
		int opcion = 0;
		boolean salir = false;

		while (!salir) {
			System.out.println("--------------------------------------------------");
			System.out.println("|      	SISTEMA DE GESTION DE CLUB               |");
			System.out.println("--------------------------------------------------");
			System.out.println("|                                                |");
			System.out.println("| 1- Club                                        |");
			System.out.println("| 2- Funcionario                                 |");
			System.out.println("| 3- Socio                                       |");
			System.out.println("| 4- Gimnasio                                    |");
			System.out.println("| 5- Cuota                                       |");
			System.out.println("| 6- Actividad                                   |");
			System.out.println("| 7- Competencia                                 |");
			System.out.println("| 9- Salir                                       |");
			System.out.println("|                                                |");
			System.out.println("| Seleccione una opción:                         |");
			System.out.println("--------------------------------------------------");
			opcion = sn.nextInt();

			try {
				switch (opcion) {
					case 1:
						//Opciones de Club
						String nombreClub;
						String direccionClub;
						String telefonoClub;
						String webClub;
	
						System.out.println("--------------------------------------------------");
						System.out.println("|                  1- CLUB                       |");
						System.out.println("--------------------------------------------------");
						System.out.println("Ingrese Nombre:");
						nombreClub = sn.nextLine();
						nombreClub = sn.nextLine();
						System.out.println("Ingrese Direccion: ");
						direccionClub = sn.nextLine();
						System.out.println("Ingrese Teléfono");
						telefonoClub = sn.nextLine();
						System.out.println("Ingrese Direccion Web");
						webClub = sn.nextLine();
	
						Club miClub = new Club(nombreClub, direccionClub, telefonoClub, webClub);
						System.out.println("Se creo el club: "+ miClub.toString());
						break;
					case 2:
						//Opciones Funcionario
						String nombreFuncionario;
						String apellidoFuncionario;
						int ciFuncionario;
						int telefonoFuncionario;
						String direccionFuncionario;
						String fechaNacimientoFuncionario;
						String carnetSaludFuncionario;
						String sexoFuncionario;
						float[] horarioFuncionario = new float[2];
						String[] diasFuncionario = new String[7];
						String cargoFuncionario;
						
						System.out.println("--------------------------------------------------");
						System.out.println("|                  2- Funciario                  |");
						System.out.println("--------------------------------------------------");
						System.out.println("Ingrese Nombre:");
						nombreFuncionario = sn.nextLine();
						nombreFuncionario = sn.nextLine();
						System.out.println("Ingrese Apellido: ");
						apellidoFuncionario = sn.nextLine();
						System.out.println("Ingrese Cedula: ");
						ciFuncionario = sn.nextInt();
						System.out.println("Ingrese Telefono: ");
						telefonoFuncionario = sn.nextInt();
						System.out.println("Ingrese Direccion: ");
						direccionFuncionario = sn.nextLine();
						direccionFuncionario = sn.nextLine();
						System.out.println("Ingrese Fecha Nacimiento: ");
						fechaNacimientoFuncionario = sn.nextLine();
						System.out.println("Ingrese Carnet de Salud: ");
						carnetSaludFuncionario = sn.nextLine();
						System.out.println("Ingrese Sexo: ");
						sexoFuncionario = sn.nextLine();
						System.out.println("Ingrese horario entrada: ");
						horarioFuncionario[0]= sn.nextInt();
						System.out.println("Ingrese horario salida: ");
						horarioFuncionario[1]= sn.nextInt();
						System.out.println("¿Cuantos días trabaja?");
						int diasTrabajo = sn.nextInt();
						for(int i = 0; i < diasTrabajo; i++) {
							System.out.println("¿Que día trabaja?");
							
							diasFuncionario[i] = sn.next();
						}
						System.out.println("¿Que cargo tiene?");
						cargoFuncionario = sn.next();
						
						Funcionario miFuncionario = new Funcionario(nombreFuncionario, apellidoFuncionario, ciFuncionario, telefonoFuncionario, direccionFuncionario, fechaNacimientoFuncionario, carnetSaludFuncionario, sexoFuncionario, horarioFuncionario, diasFuncionario, cargoFuncionario);
						System.out.println("Se creo el funcionario: "+ miFuncionario.toString());
						break;
					case 3:
						//Opciones Socio
						String nombreSocio;
						String apellidoSocio;
						int ciSocio;
						int telefonoSocio;
						String direccionSocio;
						String fechaNacimientoSocio;
						String carnetSaludSocio;
						String sexoSocio;
						int descAntiguedad;
						int descCompetencia;
						int descFuncionario;
						
						System.out.println("--------------------------------------------------");
						System.out.println("|                     3- Socio                   |");
						System.out.println("--------------------------------------------------");
						System.out.println("Ingrese Nombre:");
						nombreFuncionario = sn.nextLine();
						nombreFuncionario = sn.nextLine();
						System.out.println("Ingrese Apellido: ");
						apellidoFuncionario = sn.nextLine();
						System.out.println("Ingrese Cedula: ");
						ciFuncionario = sn.nextInt();
						System.out.println("Ingrese Telefono: ");
						telefonoFuncionario = sn.nextInt();
						System.out.println("Ingrese Direccion: ");
						direccionFuncionario = sn.nextLine();
						direccionFuncionario = sn.nextLine();
						System.out.println("Ingrese Fecha Nacimiento: ");
						fechaNacimientoFuncionario = sn.nextLine();
						System.out.println("Ingrese Carnet de Salud: ");
						carnetSaludFuncionario = sn.nextLine();
						System.out.println("Ingrese Sexo: ");
						sexoFuncionario = sn.nextLine();
						System.out.println("Ingrese descuento por antiguedad si corresponde: ");
						descAntiguedad = sn.nextInt();
						System.out.println("Ingrese descuento por competencia si corresponde: ");
						descCompetencia = sn.nextInt();
						System.out.println("Ingrese descuento por funcionario si corresponde: ");
						descFuncionario = sn.nextInt();
						
						Socio miSocio = new Socio(nombreFuncionario, apellidoFuncionario, ciFuncionario, telefonoFuncionario, direccionFuncionario, fechaNacimientoFuncionario, carnetSaludFuncionario, sexoFuncionario, descAntiguedad, descCompetencia, descFuncionario);
						System.out.println("Se creo el socio: "+ miSocio.toString());
						break;
					case 4:
						//Opciones gimnasio
						String nombreGimnasio;
						String espacioGimnasio;
						
						System.out.println("--------------------------------------------------");
						System.out.println("|                   4- Gimnasio                  |");
						System.out.println("--------------------------------------------------");
						System.out.println("Ingrese Nombre:");
						nombreGimnasio = sn.next();
						System.out.println("Ingrese el espacio del gimnasio:");
						espacioGimnasio = sn.next();
						
						Gimnasio miGimnasio = new Gimnasio(nombreGimnasio, espacioGimnasio);
						System.out.println("Se creo el gimnasio: "+ miGimnasio.toString());
						break;
					case 5:
						//Opciones Cuota
						int costoCuota;
						String fechaCuota;
						String comprobanteCuota;
						
						System.out.println("--------------------------------------------------");
						System.out.println("|                    5- Cuota                    |");
						System.out.println("--------------------------------------------------");
						System.out.println("Ingrese costo cuota:");
						costoCuota = sn.nextInt();
						System.out.println("Ingrese fecha de pago:");
						fechaCuota = sn.next();
						System.out.println("Ingrese comprobante de pago:");
						comprobanteCuota = sn.next();
						
						Cuota miCuota = new Cuota(costoCuota, fechaCuota, comprobanteCuota);
						System.out.println("Se creo el pago: "+ miCuota.toString());
						break;
					case 6:
						//Opciones Actividad
						String diaActividad;
						String horaActividad;
						String sexoActividad;
						String lugarActividad;
						int edadmaxActividad;
						int edadminActividad;
						
						System.out.println("--------------------------------------------------");
						System.out.println("|                  6- Actividad                  |");
						System.out.println("--------------------------------------------------");
						System.out.println("Ingrese día actividad:");
						diaActividad = sn.next();
						System.out.println("Ingrese hora de actividad:");
						horaActividad = sn.next();
						System.out.println("Ingrese sexo de actividad:");
						sexoActividad = sn.next();
						System.out.println("Ingrese lugar de actividad:");
						lugarActividad = sn.next();
						System.out.println("Ingrese edad maxima de actividad:");
						edadmaxActividad = sn.nextInt();
						System.out.println("Ingrese edad minima de actividad:");
						edadminActividad = sn.nextInt();
						
						Actividad miActividad = new Actividad(diaActividad, horaActividad, sexoActividad, lugarActividad, edadmaxActividad, edadminActividad);
						System.out.println("Se creo la actividad: "+ miActividad.toString());
						break;
					case 7:
						//Opciones Competencia
						String nombreCompetencia;
						String fechaCompetencia;
						String lugarCompetencia;
						String nivelCompetencia;
						
						System.out.println("--------------------------------------------------");
						System.out.println("|                 7- Competencia                 |");
						System.out.println("--------------------------------------------------");
						System.out.println("Ingrese nombre de competencia:");
						nombreCompetencia = sn.next();
						System.out.println("Ingrese fecha de competencia:");
						fechaCompetencia = sn.next();
						System.out.println("Ingrese lugar de competencia:");
						lugarCompetencia = sn.next();
						System.out.println("Ingrese nivel de competencia:");
						nivelCompetencia = sn.next();
						
						Competencia miCompetencia = new Competencia(nombreCompetencia, fechaCompetencia, lugarCompetencia, nivelCompetencia);
						System.out.println("Se creo la competencia: "+ miCompetencia.toString());
						break;
					case 9:
						salir = true;
						break;
				}
			} catch (InputMismatchException e) {
				System.out.println(e);
				sn.next();
			}
		}

	}
}
