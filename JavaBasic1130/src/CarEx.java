import java.util.Scanner;

public class CarEx {
	public static void main(String[] arg) {
		// CarTire, Car, HankookTire, KumhoTire
		
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
				case 1:
					System.out.println("�տ��� �ѱ�Ÿ�̾�� ��ü");
					car.frontLetfTire = new HankookTire("�տ���", 15);
					break;
				case 2:
					System.out.println("�տ����� ��ȣŸ�̾�� ��ü");
					car.frontLetfTire = new HankookTire("�տ�����", 13);
					break;
				case 3:
					System.out.println("�ڿ��� �ѱ�Ÿ�̾�� ��ü");
					car.frontLetfTire = new HankookTire("�ڿ���", 14);
					break;
				case 4:
					System.out.println("�ڿ��� ��ȣŸ�̾�� ��ü");
					car.frontLetfTire = new HankookTire("�ڿ�����", 17);
					break;
			}
			System.out.println("-------------------------");
		}
		
		
	}
	
}
