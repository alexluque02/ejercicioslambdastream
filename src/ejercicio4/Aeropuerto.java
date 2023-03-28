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
	
	public void agregar(String nombreCompania, LocalDate fecha, LocalTime hora, double duracion, int numPasajeros) {
		boolean noEncontrado=lista.stream()
						.noneMatch(x -> x.getFechaSalida().atTime(x.getHoraSalida())!=fecha.atTime(hora));
		
		if(noEncontrado) {
			lista.add(new Vuelos(nombreCompania, fecha, hora, duracion, numPasajeros));
		}
	}
	
	public void generarId(Vuelos v) {
		v.generarIdentificador();
	}
	public LocalDateTime calcularHoraLlegada(Vuelos v) {
		return v.getFechaSalida().atTime(v.getHoraSalida()).plusHours((long)v.getDuracion());
	}
	
	
	
	
	
	
	
	
}
