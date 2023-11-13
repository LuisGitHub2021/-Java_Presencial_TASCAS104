package n1Exercici3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TicketTest {

	@Test
	void testRegistroFueraListado() {
		
		assertDoesNotThrow(() -> { 
			Ticket.crearTicketEntrada(10, 10);
					});
		
	}
}