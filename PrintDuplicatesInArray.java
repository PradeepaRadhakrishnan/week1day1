package week1day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
 		int[] Arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
 		int count = 0;
 		
 		int lengthArr = Arr.length;
 		System.out.println("Length of an Array:" +lengthArr);
 		
 		System.out.println("Duplicate elements in given array:");
 		
 		for(int i=0; i<Arr.length-1; i++) {
 			
 			for(int j=i+1; j<Arr.length; j++) {
 				
 				if(Arr[i] == Arr[j]) 
 				{
 					count = count+1;
 				}
 				if(count>0) { 
 					
 				}
 				System.out.println(Arr[j]);

 				}
 			}
 		
 		
					
 			
 		}	
 			
 		

	}


