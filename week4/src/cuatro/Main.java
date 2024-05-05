package cuatro;


public class Main {
	static int multiplyAdj(int[] arr){
		
		if(arr.length == 1) { 
			return (int) (Math.pow(arr[0], 3));
		}
		
		int[] new_arr = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) { 
			if(i == 0) { 
				new_arr[i] = arr[i]* arr[i+1]*arr[arr.length-1];
			}
			
			else if(i == arr.length-1) { 
				new_arr[i] = arr[arr.length-1] * arr[0] * arr[arr.length-2];
			}
			
			else { 
				new_arr[i] = arr[i] * arr[i+1] * arr[i-1];
			}
		}
		int sum = 0;
		for(int x = 0; x < new_arr.length; x++) { 
			sum+=new_arr[x];
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {12};
		System.out.println(multiplyAdj(arr));
	}
}
