
public class HankookTire extends CarTire {
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
		@Override
		public boolean roll() {
			++accumulateRotation;
			if ( accumulateRotation < maxRotation ) {
				System.out.println(location + "한국타이어 수명 : " +( maxRotation - accumulateRotation) + "회");
				return true;
			}
			else {
				System.out.println( "***" + location + "타이어 펑크 ***"  );
				return false;
			}
		}
}
