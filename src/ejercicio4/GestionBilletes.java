package ejercicio4;

import java.util.Map;

public class GestionBilletes {

	Map <Pasajero, Vuelos> billetes;

	public GestionBilletes(Map<Pasajero, Vuelos> billetes) {
		super();
		this.billetes = billetes;
	}

	public Map<Pasajero, Vuelos> getBilletes() {
		return billetes;
	}

	public void setBilletes(Map<Pasajero, Vuelos> billetes) {
		this.billetes = billetes;
	}

	@Override
	public String toString() {
		return "GestionBilletes [billetes=" + billetes + "]";
	}
	
	public void agregarBillete(Pasajero pasajero, Vuelos vuelo) {
	    if (billetes.containsKey(pasajero)) {
	        Vuelos vueloExistente = billetes.get(pasajero);
	        if (vueloExistente.equals(vuelo)) {
	            System.out.println("El pasajero ya ha reservado este vuelo.");
	            return;
	        }
	    }
	    billetes.put(pasajero, vuelo);
	    System.out.println("Billete agregado exitosamente para " + pasajero.getNombre() + " en el vuelo " + vuelo.getId());
	}
	
	public void mostrarBilletesVendidos() {
		billetes.forEach((x, y) -> System.out.println("Pasajero: "+x+ "Vuelo: "+y));
	}
}
