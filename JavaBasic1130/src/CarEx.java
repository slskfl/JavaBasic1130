import java.util.Scanner;

public class CarEx {
	public static void main(String[] arg) {
		// CarTire, Car, HankookTire, KumhoTire
		
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
				case 1:
					System.out.println("앞왼쪽 한국타이어로 교체");
					car.frontLetfTire = new HankookTire("앞왼쪽", 15);
					break;
				case 2:
					System.out.println("앞오른쪽 금호타이어로 교체");
					car.frontLetfTire = new HankookTire("앞오른쪽", 13);
					break;
				case 3:
					System.out.println("뒤왼쪽 한국타이어로 교체");
					car.frontLetfTire = new HankookTire("뒤왼쪽", 14);
					break;
				case 4:
					System.out.println("뒤왼쪽 금호타이어로 교체");
					car.frontLetfTire = new HankookTire("뒤오른쪽", 17);
					break;
			}
			System.out.println("-------------------------");
		}
		
		
	}
	
}
