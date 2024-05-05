package tres;

import java.util.Arrays;

public class Main {
	static int[] copyAndSwap(int[] array){
		int[] swapped_arr;
		if(array.length == 1) { 
			swapped_arr = new int[0];
			return swapped_arr;
		}
		if(array.length % 2 == 0) { 
			swapped_arr = new int[array.length];
			for(int i = 0; i < array.length; i+= 2) { 
				swapped_arr[i] = array[i+1];
				swapped_arr[i+1] = array[i];
			}
		}
		
		else { 
			swapped_arr = new int[array.length-1];
			int[] new_arr = new int[array.length-1];
			int remove_index = (array.length/2);
			for (int i = 0, k = 0; i < array.length; i++) {
	            if (i == remove_index) {
	                continue;
	            }
	            new_arr[k++] = array[i];
	        }
			for(int i = 0; i < new_arr.length; i+= 2) { 
				swapped_arr[i] = new_arr[i+1];
				swapped_arr[i+1] = new_arr[i];
			}
		}
		
	    return swapped_arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {574, -328, 675};
		System.out.println(Arrays.toString(copyAndSwap(arr)));
	}
}
