package ejercicio4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Aeropuerto {

	List <Vuelos> lista;

	public Aeropuerto(List<Vuelos> lista) {
		super();
		this.lista = lista;
	}

	public List<Vuelos> getLista() {
		return lista;
	}

	public void setLista(List<Vuelos> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Aeropuerto [lista=" + lista + "]";
	}
	
	public boolean agregar(String nombreCompania, LocalDate fecha, LocalTime hora, double duracion, int numPasajeros) {
		boolean noEncontrado=lista.stream()
						.noneMatch(x -> fecha.atTime(hora).equals(x.getFechaSalida().atTime(x.getHoraSalida())));
		
		if(noEncontrado) {
			Vuelos v1=new Vuelos(nombreCompania, fecha, hora, duracion, numPasajeros);
			lista.add(v1);
			v1.generarIdentificador();
			return true;
		}else {
			return false;
		}
	}
	
	public LocalDateTime calcularHoraLlegada(Vuelos v) {
		return v.getFechaSalida().atTime(v.getHoraSalida()).plusHours((long)v.getDuracion());
	}
	
	public void mostrarTodosLosVuelos() {
		lista.forEach(System.out::println);
	}
	
	public Vuelos buscarPorId(String id) {
		return lista.stream()
				.filter(x -> x.getId().equalsIgnoreCase(id))
				.findFirst()
				.get();
	}
	
	
	
	
	
	
}
