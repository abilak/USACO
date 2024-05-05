package tres;


public class Main {
	
	static int multMode(int[] array) {
		int[] arr_of_modes = new int[array.length];
		
		for(int x = 0; x < array.length; x++) { 
			int count = 0;
			for(int i = 0; i < array.length; i++) { 
				if(array[x] == array[i]) { 
					count++;
				}
			}
			
			arr_of_modes[x] = count;
			
		}
		int max = arr_of_modes[0];
		for (int i = 1; i < arr_of_modes.length; i++) {

		      // compare all elements with max
		      // assign maximum value to max
		      max = Math.max(max, arr_of_modes[i]);

		}
		
		for(int p = 0; p < arr_of_modes.length; p++) { 
			if(arr_of_modes[p] == max) { 
				return array[p] * max;
			}
		}
		
		return 2;
		
	}
	
	public static void main(String[] args) {
		
			
		int[] arr = {1, 1, 2, 3, 4, 4, 1};
		
		System.out.println(multMode(arr));
	}
}
