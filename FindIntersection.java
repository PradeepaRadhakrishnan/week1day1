package week1day2;

public class FindIntersection {

	public static void main(String[] args) {
	
		int[] numArr1= {3,2,11,4,6,7};
		int[] numArr2 = {1,2,8,4,9,7};
		
		for(int i = 0; i < numArr1.length; i++) {
            
			for(int j = 0; j<numArr2.length; j++) {
				
				if(numArr1[i] == numArr2[j]) {
					System.out.println(numArr1[i]);
				}
			}

			
		}
		}
			
			
		
		

	}

