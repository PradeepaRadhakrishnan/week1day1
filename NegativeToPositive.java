package week1.day1;

public class NegativeToPositive {

	public static void main(String[] args) {
		int n = -40;
		int i=0;
		if (n<0) {
			i =n - (n * 2);
			System.out.println("The number" + n +" is converted to " +i);
			}
		else {
			System.out.println(n + "is positive number");
		}
		
		

	}

}
