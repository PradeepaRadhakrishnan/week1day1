package week1day2;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		int num = 153;
		int temp, arm = 0, rem = 0;
		temp = num;
		while (temp>0) {
			rem = rem%10;
			arm = arm +(rem*rem*rem);
			rem = rem /10;
		}
		
		if (num == rem) {
			System.out.println("It is Armstrong Number");
		}
		else {
			System.out.println("It is not Armstrong Number");

		}
		}
		
		
		 

	}

