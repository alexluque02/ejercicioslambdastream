package ejercicio01;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu;
		String letra;
		List<Alumno> lista = new ArrayList <Alumno> ();
		Secretaria s = new Secretaria (lista);
		
		lista.add(new Alumno("Alex", "Luque", "1 DAM", 10, 20));
		lista.add(new Alumno("sahdfjnf", "Luqdsfue", "1 DAM", 8.75, 20));
		lista.add(new Alumno("Alsafex", "Lusdaque", "1 DAM", 7.75, 20));
		lista.add(new Alumno("Alasex", "Luqaue", "1 DAM", 5.75, 20));
		lista.add(new Alumno("sfAlex", "Lusdfque", "1 DAM", 9.75, 20));
		lista.add(new Alumno("Alfsfex", "Lfdauque", "1 DAM", 8.75, 20));
		lista.add(new Alumno("Alsadfex", "Lusafque", "1 DAM", 8.75, 20));
		lista.add(new Alumno("Aledx", "Luque", "1 DAM", 9.75, 20));
		lista.add(new Alumno("Alex", "Luque", "1 DAM", 8.75, 20));
		lista.add(new Alumno("Alex", "Luasfque", "1 DAM", 2.75, 20));
		
		do {
			imprimirMenu();
			menu=Leer.datoInt();
			switch(menu) {
			case 1:
				s.mostrarListaPasada(s.obtenerAlumnosAprobados());
				break;
			case 2:
				s.mostrarLista();
				break;
			case 3:
				System.out.println("Diga la letra");
				letra=Leer.dato();
				s.mostrarAlumnosEmpiezan(letra);
				break;
			case 4:
				System.out.println("El tamaño de la lista es: "+s.darTamanioLista());
				break;
			case 5:
				s.mostrarListaPasada(s.devolverMejoresAlumnos());
				break;
			case 6:
				s.mostrarListaPasada(s.devolverTres());
				break;
			case 7:
				System.out.println(s.delvolverMenor());
				break;
			case 8:
				System.out.println(s.devolverPrimerAlumno());
				break;
			case 9:
				s.mostrarListaPasada(s.devolverMayorDiezLetras());
				break;
			case 10:
				s.mostrarListaPasada(s.devolverAlumnosLetrayLargo());
				break;
			}
		}while(menu!=0);
		
	}

	public static void imprimirMenu() {
        System.out.println("1-Imprimir lista con filter\n" + "2-Mostrar todos los alumnos con forEach\n"
                + "3-Imprimir alumnos que empiezan por una letra\n" + "4-Tamaño de la lista con count(Long)\n"
                + "5-Obtener los alumnos con nota media mayor de 9 en el curso 1DAM\n"
                + "6-Imprimir los 3 primeros alumnos con limit\n" + "7-Obtener el alumno de menor edad\n"
                + "8-Obtener el primer alumno de la lista con findFirst()\n"
                + "9-Obtener alumnos que superen las 10 letras en su nombre\n"
                + "10-Obtener alumnos que empiecen por la letra A y tengan menos o igual de 6 letras\n" + "0- SALIR");
    }
}
