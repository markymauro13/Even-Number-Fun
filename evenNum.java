
public class evenNum {

	//Pick first Even Number.(input: (8, 2, 7, 6, 9), output:(8))
	
	private static int[] arr = {8, 2, 7, 6, 9};
	
	public static void main(String[] args) {
		findEven();
	}
	
	public static void findEven() {
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
				break;	// helps print the first occurrence of an even number
			}
			
		}
		
	}

}
