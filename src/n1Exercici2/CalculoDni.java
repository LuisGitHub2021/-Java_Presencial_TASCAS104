package n1Exercici2;

import java.util.HashMap;

public class CalculoDni {

	private HashMap<String, String> tablaCalculoDni;
	private String dniDefinitivo;

	public CalculoDni(HashMap<String, String> tablaCalculoDni) {
		this.tablaCalculoDni = tablaCalculoDni;
		
	}

	public HashMap<String, String> getTablaCalculoDni() {
		return tablaCalculoDni;
	}
	
	public String getDniDefinitivo() {
		return dniDefinitivo;
	}

	public HashMap<String, String> añadirElementos (HashMap<String, String> tablaCalculoDni) {
		/*
		 * 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 T R W A G M Y F P
		 * D X B N J Z S Q V H L C K E
		 */
		
		tablaCalculoDni.put( "0", "T");
		tablaCalculoDni.put( "1", "R");
		tablaCalculoDni.put( "2", "W");
		tablaCalculoDni.put( "3", "A");
		tablaCalculoDni.put( "4", "G");
		tablaCalculoDni.put( "5", "M");
		tablaCalculoDni.put( "6", "Y");
		tablaCalculoDni.put( "7", "F");
		tablaCalculoDni.put( "8", "P");
		tablaCalculoDni.put( "9", "D");
		tablaCalculoDni.put( "10", "X");
		tablaCalculoDni.put( "11", "B");
		tablaCalculoDni.put( "12", "N");
		tablaCalculoDni.put( "13", "J");
		tablaCalculoDni.put( "14", "Z");
		tablaCalculoDni.put( "15", "S");
		tablaCalculoDni.put( "16", "Q");
		tablaCalculoDni.put( "17", "V");
		tablaCalculoDni.put( "18", "H");
		tablaCalculoDni.put( "19", "L");
		tablaCalculoDni.put( "20", "C");
		tablaCalculoDni.put( "21", "K");
		tablaCalculoDni.put( "22", "E");
		
		return tablaCalculoDni;
		//tablaCalculoDni.put(num, letra);
		
	
	
	}
	

	public String dniDefinitivo(int numDniInt) {

		int letraInt = numDniInt % 23;

		String letra = String.valueOf(letraInt);
		String numDni = String.valueOf(numDniInt);

		dniDefinitivo = numDni + tablaCalculoDni.get(letra);

		return dniDefinitivo;

	}

}