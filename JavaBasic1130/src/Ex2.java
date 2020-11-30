import java.util.Scanner;

public class Ex2 {
	public static void main(String[] arg) {
		Tiger tiger1 = new Tiger();
		Eagle eagle1 = new Eagle();
		tiger1.move();
		tiger1.name = "호돌이";
		tiger1.age=7;
		eagle1.move();
		eagle1.name="수리";
		eagle1.home="바위틈";
		
		System.out.println("호랑이 이름은 " + tiger1.name);
	}
	
}
