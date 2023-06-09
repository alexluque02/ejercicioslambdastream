package ejercicio4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		List <Vuelos> listaVuelos = new ArrayList <Vuelos> ();
		Map<Pasajero, Vuelos> billetes = new HashMap <Pasajero, Vuelos> ();
		Aeropuerto a = new Aeropuerto(listaVuelos);
		GestionBilletes gb = new GestionBilletes(billetes);
		int menu=1, dia, mes, anio, horaSalida, minuto, numPasajeros;
		double duracion;
		String nombreCompania, id, dni, nombre;
		LocalDate fecha;
		LocalTime hora;
		a.agregar("Ryanair", LocalDate.of(2023, 3, 25), LocalTime.of(15, 30), 2.30, 120);
		a.agregar("Lufthansa", LocalDate.of(2021, 2, 24), LocalTime.of(14, 30), 1, 120);
		a.agregar("Iberia", LocalDate.of(2023, 3, 23), LocalTime.of(15, 30), 0.30, 120);
		a.agregar("Vueling", LocalDate.of(2023, 3, 22), LocalTime.of(15, 30), 2.30, 120);
		a.agregar("Fly Emirates", LocalDate.of(2023, 3, 21), LocalTime.of(15, 30), 7.45, 120);
		a.agregar("Fly Emirates", LocalDate.of(2023, 3, 20), LocalTime.of(15, 30), 2.30, 120);
		a.agregar("AirBerlin", LocalDate.of(2023, 3, 19), LocalTime.of(15, 30), 1.30, 120);
		a.agregar("Airbus", LocalDate.of(2023, 3, 18), LocalTime.of(15, 30), 0.45, 120);
		a.agregar("Ryanair", LocalDate.of(2023, 3, 17), LocalTime.of(15, 30), 2.10, 120);
		a.agregar("Ryanair", LocalDate.of(2023, 3, 16), LocalTime.of(15, 30), 3.30, 120);
		a.agregar("Vueling", LocalDate.of(2023, 3, 15), LocalTime.of(15, 30), 2.30, 120);
		a.agregar("Iberia", LocalDate.of(2023, 3, 14), LocalTime.of(15, 30), 5.30, 120);
		a.agregar("Iberia", LocalDate.of(2023, 3, 13), LocalTime.of(15, 30), 2.30, 120);
		a.agregar("Lufthansa", LocalDate.of(2023, 3, 12), LocalTime.of(15, 30), 2, 120);
		a.agregar("Fly Emirates", LocalDate.of(2023, 3, 11), LocalTime.of(15, 30), 2.30, 120);
		a.agregar("Emirates Dubai", LocalDate.of(2023, 3, 10), LocalTime.of(15, 30), 1.20, 120);
		a.agregar("France", LocalDate.of(2023, 3, 9), LocalTime.of(15, 30), 2.22, 120);
		a.agregar("Ryanair", LocalDate.of(2023, 3, 8), LocalTime.of(15, 30), 2.30, 120);
		
		do { 
			try {
				System.out.println("1. Añadir un vuelo\n"
						+ "2. Mostrar vuelos\n"
						+ "3. Calcular hora de llegada para un vuelo\n"
						+ "4. Vender un billete\n"
						+ "5. Mostrar Billetes");
				menu=Leer.datoInt();
				switch(menu) {
				case 1:
					System.out.println("Diga el nombre de la compañía");
					nombreCompania=Leer.dato();
					System.out.println("Diga la día de salida");
					dia=Leer.datoInt();
					System.out.println("Diga el mes");
					mes=Leer.datoInt();
					System.out.println("Diga el año");
					anio=Leer.datoInt();
					fecha=LocalDate.of(anio, mes, dia);
					System.out.println("Diga la hora");
					horaSalida=Leer.datoInt();
					System.out.println("Diga el minuto");
					minuto=Leer.datoInt();
					hora=LocalTime.of(horaSalida, minuto);
					System.out.println("Diga la duración del vuelo");
					duracion=Leer.datoDouble();
					System.out.println("Diga el número de pasajeros");
					numPasajeros=Leer.datoInt();
					if(a.agregar(nombreCompania, fecha, hora, duracion, numPasajeros)) {
						System.out.println("Agregado con éxito");
					}else {
						System.out.println("Las fechas coinciden. Inténtelo de nuevo");
					}
					break;
				case 2:
					a.mostrarTodosLosVuelos();
					break;
				case 3:
					a.mostrarTodosLosVuelos();
					System.out.println("Diga el id del vuelo");
					id=Leer.dato();
					System.out.println("La hora e llegada del vuelo es: "+a.calcularHoraLlegada(a.buscarPorId(id)));
					break;
				case 4:
					System.out.println("Diga el dni del pasajero");
					dni=Leer.dato();
					System.out.println("Diga el nombre del pasajero");
					nombre=Leer.dato();
					System.out.println("Qué día nació");
					dia=Leer.datoInt();
					System.out.println("Qué mes");
					mes=Leer.datoInt();
					System.out.println("Qué año");
					anio=Leer.datoInt();
					fecha=LocalDate.of(anio, mes, dia);
					System.out.println("Diga el id del vuelo que quiere comprar");
					id=Leer.dato();
					gb.agregarBillete(new Pasajero(dni, nombre, fecha), a.buscarPorId(id));
					break;
				case 5:
					gb.mostrarBilletesVendidos();
					break;
					
				}
			}catch(Exception e) {
				System.out.println("Error");
			}
		}while(menu!=0);
	}
}
