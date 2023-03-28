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
	
	public void mostrarListaPasada(List<Alumno> lista) {
		lista.forEach(System.out::println);
	}
	
	public void mostrarLista() {
		lista.forEach(System.out::println);
	}
	
	public void mostrarAlumnosEmpiezan(String letra){
		lista.stream()
			.filter(x -> x.getNombre().toUpperCase().startsWith(letra.toUpperCase()))
			.toList()
			.forEach(System.out::println);
	}
	
	public long darTamanioLista() {
		return lista.stream()
				.count();
	}
	
	public List<Alumno> devolverMejoresAlumnos(){
		return lista.stream()
				.filter(x -> x.getNotaMedia()>9)
				.toList();
	}
	
	public List<Alumno> devolverTres(){
		return lista.stream()
				.limit(3)
				.toList();
	}
	
	public Alumno delvolverMenor() {
		return lista.stream()
			.min((a, b) -> a.getEdad()>b.getEdad()?1:(a.getEdad()<b.getEdad()?-1:0))
			.get();
	}
	
	public Alumno devolverPrimerAlumno() {
		return lista.stream()
				.findFirst()
				.get();
	}
	
	public List <Alumno> devolverMayorDiezLetras(){
		return lista.stream()
				.filter(x -> x.getNombre().length()>10)
				.toList();
	}
	
	public List <Alumno> devolverAlumnosLetrayLargo(){
		return lista.stream()
				.filter(x->x.getNombre().toUpperCase().startsWith("A"))
				.filter(x->x.getNombre().length()<=6)
				.toList();
	}
}
