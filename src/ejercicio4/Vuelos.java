package ejercicio4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class Vuelos {

	private String id;//Concatenará un string y un int
	private String nombreCompania;
	private LocalDate fechaSalida;
	private LocalTime horaSalida;
	private double duracion;
	private int numPasajeros;
	
	public Vuelos(String nombreCompania, LocalDate fechaSalida, LocalTime horaSalida, double duracion,
			int numPasajeros) {
		super();
		this.nombreCompania = nombreCompania;
		this.fechaSalida = fechaSalida;
		this.horaSalida = horaSalida;
		this.duracion = duracion;
		this.numPasajeros = numPasajeros;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombreCompania() {
		return nombreCompania;
	}

	public void setNombreCompania(String nombreCompania) {
		this.nombreCompania = nombreCompania;
	}

	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public LocalTime getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(LocalTime horaSalida) {
		this.horaSalida = horaSalida;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	@Override
	public String toString() {
		return "Vuelos [id=" + id + ", nombreCompania=" + nombreCompania + ", fechaSalida=" + fechaSalida
				+ ", horaSalida=" + horaSalida + ", duracion=" + duracion + ", numPasajeros=" + numPasajeros + "]";
	}
	
	public void generarIdentificador() {
		Random num=new Random (System.nanoTime());
		int numeroAleatorio=num.nextInt(9999-1000+1)+1000;
		this.id=this.nombreCompania.substring(0, 2).concat(String.valueOf(numeroAleatorio));
	}
}
