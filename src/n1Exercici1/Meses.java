package n1Exercici1;

import java.util.LinkedHashSet;

public class Meses {

	private LinkedHashSet<String> listaMeses;

	public Meses(LinkedHashSet<String> listaMeses) {
		this.listaMeses = listaMeses;
	}

	public LinkedHashSet<String> getListaMeses() {
		return listaMeses;
	}

	public void añadirMeses(LinkedHashSet<String> listaMeses, String mes) {
		listaMeses.add(mes);
	}

}