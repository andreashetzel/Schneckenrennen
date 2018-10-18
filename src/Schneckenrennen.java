
public class Schneckenrennen {

	public static void main(String[] args) {
		
		Rennschnecke schnecki1 = new Rennschnecke("Hasi", "Glitscho", 3);
		Rennschnecke schnecki2 = new Rennschnecke("Baerchen", "Rasanto", 5);

		
		schnecki1.krieche();
		System.out.println(schnecki1);
		schnecki1.krieche();
		System.out.println(schnecki1);
	}

}
