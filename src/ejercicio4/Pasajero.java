package ejercicio4;

import java.time.LocalDate;

public class Pasajero {

	String dni;
	String nombre;
	LocalDate fechaNacimiento;
	
	public Pasajero(String dni, String nombre, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Pasajero [dni=" + dni + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	
}
