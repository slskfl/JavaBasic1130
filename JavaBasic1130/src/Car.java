
public class Car {
	
	CarTire frontLetfTire = new CarTire("앞왼쪽", 6);
	CarTire frontRightfTire = new CarTire("앞오른쪽", 2);
	CarTire backLetfTire = new CarTire("뒤왼쪽", 3);
	CarTire backRightfTire = new CarTire("뒤오른쪽", 4);
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
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
		System.out.println("[자동차가 멈춥니다.]");
	}
	
}
