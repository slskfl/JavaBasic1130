
public class HankookTire extends CarTire {
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
		@Override
		public boolean roll() {
			++accumulateRotation;
			if ( accumulateRotation < maxRotation ) {
				System.out.println(location + "�ѱ�Ÿ�̾� ���� : " +( maxRotation - accumulateRotation) + "ȸ");
				return true;
			}
			else {
				System.out.println( "***" + location + "Ÿ�̾� ��ũ ***"  );
				return false;
			}
		}
}
