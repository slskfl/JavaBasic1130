import java.util.Scanner;

public class Ex1 {
	public static void main(String[] arg) {
		int[] nums = { 52, 87, 20, 96, 33};
		int sum = 0;
		boolean on;
		for ( int i=0; i<nums.length; i++) {
			on = findNumber(nums[i]);
			if (on==true) {
				sum+=nums[i];
			}
		}
		System.out.println("배열 중에 홀수의 합 : " + sum);
	 }
	private static boolean findNumber( int num) {
		boolean oddnum =false;
		if(num%2==1) {
			oddnum = true;
		}
		return oddnum;
	}
	
}
