import java.util.Scanner;

public class Ex2 {
	public static void main(String[] arg) {
		Tiger tiger1 = new Tiger();
		Eagle eagle1 = new Eagle();
		tiger1.move();
		tiger1.name = "ȣ����";
		tiger1.age=7;
		eagle1.move();
		eagle1.name="����";
		eagle1.home="����ƴ";
		
		System.out.println("ȣ���� �̸��� " + tiger1.name);
	}
	
}
