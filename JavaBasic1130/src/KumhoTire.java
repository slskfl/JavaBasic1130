
public class KumhoTire extends CarTire {
	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
		@Override
		public boolean roll() {
			++accumulateRotation;
			if ( accumulateRotation < maxRotation ) {
				System.out.println(location + "��ȣŸ�̾� ���� : " +( maxRotation - accumulateRotation) + "ȸ");
				return true;
			}
			else {
				System.out.println( "***" + location + "Ÿ�̾� ��ũ ***"  );
				return false;
			}
		}
}
