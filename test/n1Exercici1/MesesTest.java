package n1Exercici1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.LinkedHashSet;
import org.junit.jupiter.api.BeforeAll;
import java.util.ArrayList;
import static org.junit.Assert.assertNotNull;

class MesesTest {

	static LinkedHashSet<String> listaMeses;
	static Meses listado;

	@BeforeAll
	public static void paraTodosMetodos() {

		listaMeses = new LinkedHashSet<String>();
		listado = new Meses(listaMeses);

		listado.añadirMeses(listaMeses, "Enero");
		listado.añadirMeses(listaMeses, "Febero");
		listado.añadirMeses(listaMeses, "Marzo");
		listado.añadirMeses(listaMeses, "Abril");
		listado.añadirMeses(listaMeses, "Mayo");
		listado.añadirMeses(listaMeses, "Junio");
		listado.añadirMeses(listaMeses, "Julio");
		listado.añadirMeses(listaMeses, "Agosto");
		listado.añadirMeses(listaMeses, "Septiembre");
		listado.añadirMeses(listaMeses, "Octubre");
		listado.añadirMeses(listaMeses, "Noviembre");
		listado.añadirMeses(listaMeses, "Diciembre");

	}

	@Test
	public void testLongitudListado() {

		assertEquals(12, listado.getListaMeses().size());
		// assertEquals(11, listado.getListaMeses().size());
	}

	@Test
	public void testListadoNull() {

		// LinkedHashSet<String> listaMeses = null;
		// Meses listado=new Meses(listaMeses);
		assertNotNull("No es null", listado.getListaMeses());

	}

	@Test
	public void testPosicionListado() {

		ArrayList<String> listaMesesARL = new ArrayList<String>(listado.getListaMeses());
		assertEquals(8, listaMesesARL.indexOf("Agosto"));
		// assertEquals(7, listaMesesARL.indexOf("Agosto"));

	}

}