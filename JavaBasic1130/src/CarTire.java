
public class CarTire {
	public int maxRotation; //�ִ� ȸ�� ��
	public int accumulateRotation; // ���� ȸ�� ��
	public String location;
	
	public CarTire(String location, int maxRotaion) {
		this.location = location;
		this.maxRotation = maxRotaion;
	}
	
	public boolean roll() {
		++accumulateRotation;
		if ( accumulateRotation < maxRotation ) {
			System.out.println(location + "Ÿ�̾� ���� : " +( maxRotation - accumulateRotation) + "ȸ");
			return true;
		}
		else {
			System.out.println( "***" + location + "Ÿ�̾� ��ũ ***"  );
			return false;
		}
	}
}
