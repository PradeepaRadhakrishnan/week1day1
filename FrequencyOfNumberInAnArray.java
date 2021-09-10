package week1day2;

public class FrequencyOfNumberInAnArray {

	public static void main(String[] args) {
		int[] arr = new int[] {3,4,2,5,1,2,6,3,6,2,4,7,1};
		int[] fr = new int [arr.length];
		
		int visted = -1;
		
		for(int i = 0; i<arr.length; i++) {
			int count = 1;
			
			for(int j= i+1; j<arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					count++;
					fr[j] = visted;
					
					}
			}
			if(fr[i]!=visted)
				fr[i] = count;
			}
		System.out.println("Element Frequency");
		
		for(int i =0; i<fr.length; i++) {
			
			if(fr[i]!=visted)
				
				System.out.println(" "+ arr[i]  +" occured "+fr[i] +" times " );
			
		}
		
		

	}

}
