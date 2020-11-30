
public class CarTire {
	public int maxRotation; //최대 회전 수
	public int accumulateRotation; // 누적 회전 수
	public String location;
	
	public CarTire(String location, int maxRotaion) {
		this.location = location;
		this.maxRotation = maxRotaion;
	}
	
	public boolean roll() {
		++accumulateRotation;
		if ( accumulateRotation < maxRotation ) {
			System.out.println(location + "타이어 수명 : " +( maxRotation - accumulateRotation) + "회");
			return true;
		}
		else {
			System.out.println( "***" + location + "타이어 펑크 ***"  );
			return false;
		}
	}
}
