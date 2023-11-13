package n1Exercici3;

public class Ticket {

	private Ticket() {
		
	}
	
	public static void crearTicketEntrada( int capacidad, int numSolicitud) {

		int i=1;
		int j=0;
		int[] aforo = new int[capacidad];
	
		while (i<=numSolicitud) {
				aforo[j]=i;
				System.out.println("Ticket Num: BS028N" + i);
				i++;
				j++;
			}
		}
}