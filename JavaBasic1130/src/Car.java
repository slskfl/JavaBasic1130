
public class Car {
	
	CarTire frontLetfTire = new CarTire("�տ���", 6);
	CarTire frontRightfTire = new CarTire("�տ�����", 2);
	CarTire backLetfTire = new CarTire("�ڿ���", 3);
	CarTire backRightfTire = new CarTire("�ڿ�����", 4);
	
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if (frontLetfTire.roll()==false) { 
			stop();
			return 1;
			}
		if (frontRightfTire.roll()==false) { 
			stop();
			return 2;
			}
		if (backLetfTire.roll()==false) { 
			stop();
			return 3;
			}
		if (backRightfTire.roll()==false) { 
			stop();
			return 4;
			}
		return 0;
	}
	
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
	
}
