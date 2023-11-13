package n1Exercici2;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculoDniTest {

	static HashMap<String, String> tablaCalculoDni;
	static CalculoDni newDni;

	@BeforeAll
	public static void paraTodosMetodos() {

		tablaCalculoDni = new HashMap<String, String>();
		newDni = new CalculoDni(tablaCalculoDni);
		newDni.añadirElementos(tablaCalculoDni);

	}

	@Test
	void testLetraDni() {

		assertAll(() -> assertEquals("38454426J", newDni.dniDefinitivo(38454426)),
				() -> assertEquals("38461642F", newDni.dniDefinitivo(38461642)),
				() -> assertEquals("38456654X", newDni.dniDefinitivo(38456654)),
				() -> assertEquals("38098890B", newDni.dniDefinitivo(38098890)),
				() -> assertEquals("38765567X", newDni.dniDefinitivo(38765567)),
				() -> assertEquals("38123456P", newDni.dniDefinitivo(38123456)),
				() -> assertEquals("38654321S", newDni.dniDefinitivo(38654321)),
				() -> assertEquals("38567890H", newDni.dniDefinitivo(38567890)),
				() -> assertEquals("38098765R", newDni.dniDefinitivo(38098765)),
				() -> assertEquals("38135790L", newDni.dniDefinitivo(38135790))

		);
	}

}