
public class evenNum2 {

	private static int[] arr = new int[700];
	private static int factor = 700;
	private static int ran = (int) ((Math.random() * factor) + 1);
	
	public static void main(String[] args) {
	
		fill();	//fills array list with random numbers
		//findEven();
	}

	public static int getRan() {
		int newGuess = (int) ((Math.random() * factor) + 1);
		ran = newGuess;
		return ran;
	}
	
	public static void fill() {
	
		for(int i = 0; i < arr.length; i++) {
			arr[i] = getRan();
			System.out.println(arr[i]);
		}
		
	}

	public static void findEven() {	//method will not work as written because Elements in arr have not been initialized?
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
				break;	// helps print the first occurrence of an even number
			}
			
		}
		
	}
}
