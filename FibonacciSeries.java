package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n1 = 0 , n2 = 1, range = 8, n3;
		
		System.out.println(n1+" "+n2);
		
		for (int i=2; i<range; ++i) {
			
		    n3=n1+n2;
			n1=n2;
			n2=n3;
			
			System.out.println(+n3 );

			
			
			
		}
			
		
		
		
		 
			
		
		

	}

}
