package ejercicio01;

import java.util.List;

public class Secretaria {

	List <Alumno> lista;

	public Secretaria(List<Alumno> lista) {
		super();
		this.lista = lista;
	}

	public List<Alumno> getLista() {
		return lista;
	}

	public void setLista(List<Alumno> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Secretaria [lista=" + lista + "]";
	}
	
	public List<Alumno> obtenerAlumnosAprobados(){
		return lista.stream()
				.filter(x->x.getNotaMedia()>5.0)
				.toList();
	}
	
	public void mostrarLista() {
		lista.forEach(System.out::println);
	}
	
	
}
