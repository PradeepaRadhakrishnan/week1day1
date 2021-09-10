package week1day2;

public class Palindrome {

	public static void main(String[] args) {
		
		int num = 454;
		int temp, rem = 0;
		temp = num;
		
		while(num>0) {
			rem = num%10;
			rem = (rem*10)+num;
			num = num/10;
			}
		if(temp == rem) {
			System.out.println("The number is Palindrom");
			}
		else {
			System.out.println("The number is Palindrome");
		}
		
		
		
		
		

	}

}
