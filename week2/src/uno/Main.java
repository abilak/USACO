package uno;

public class Main {
	
	static int splitIndex(int[] array) {
	    int count = -1;
	    for(int x = 0; x<= array.length; x++) { 
	    	int[] temp_arr = new int[x];
	    	for (int i = 0; i < temp_arr.length; i++) {
	            temp_arr[i] = array[0 + i];
	        }
	    	int[] rest_arr = new int[array.length - x];
	    	
	    	for (int p = x; p < array.length; p++) {
	            rest_arr[p-x] = array[p];
	        }
	    	
	    	int sum1 = 0;
	    	int sum2 = 0;
	    	
	    	for(int i = 0; i < temp_arr.length;i++) { 
	    		sum1+=temp_arr[i];
	    	}
	    	
	    	for(int p = 0; p < rest_arr.length;p++) { 
	    		sum2+=rest_arr[p];
	    	}
	    	
	    	if(sum1 == sum2) { 
	    		count = x;
	    		return count;
	    	}
	    	
	    	
	    }
	    
	    return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {10, 20, 30};
		System.out.println(splitIndex(arr));
	}

}
