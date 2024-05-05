package dos;

public class Main {
	
	static int findPair(int[] arr, int a, int b) {
	    int count = -1; 
	    
	    for(int x = 0; x < arr.length; x++) { 
	    	try { 
	    		if(arr[x] == a) { 
		    		if(arr[x+1] == b) { 
		    			count = x;
		    			return count;
		    		}
		    	}
	    	}
	    	
	    	catch(Exception e) { 
	    		return count;
	    	}
	    	
	    }
	    
	    return count;
	}
	
	public static void main(String[] args) { 
		int arr[] = {17, 18};
		System.out.println(findPair(arr, 17, 12));
	}
}
