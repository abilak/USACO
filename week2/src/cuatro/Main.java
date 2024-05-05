package cuatro;

public class Main {
	
	static boolean isLucky(int[] array, int n) {
		int count = 0;
	    if(n > array.length) { 
	    	for(int x : array) { 
	    		if(x == 9) { 
	    			count++;
	    		}
	    		
	    		else { 
	    			;
	    		}
	    	}
	    }
	    
	    else { 
	    	for(int i = 0; i < n; i++) { 
	    		if(array[i] == 9) { 
	    			count++;
	    		}
	    		
	    		else { 
	    			;
	    		}
	    	}
	    }
	    
	    if(count == 0) { 
	    	return false;
	    }
	    
	    else { 
	    	return true;
	    }
	}

	public static void main(String[] args) {
		
	}

}
