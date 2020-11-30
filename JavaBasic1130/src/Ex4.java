import java.util.Scanner;

public class Ex4 {
	public static void main(String[] arg) {
		// Tire, Snow
		
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
	}
	
}
