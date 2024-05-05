
import java.util.*;
import java.io.*;


public class diamond {

	public static void main(String[] args) throws Exception{
		// have an array inside a for loop looping through the diamonds. For each value, check if the abs of the differences is greater than k, 
		// and then don't append it to an arraylist
		// then, we will get the length of the arraylist
		// then find the max of the result(Integer.MIN_VALUE) and the size of arraylist
		
		// INPUT //
		String FILE_NAME = "diamond";
		
	    Scanner in = new Scanner(new File(FILE_NAME + ".in"));
	    int n = in.nextInt();
	    int k = in.nextInt();
	    
	    int[] diamonds = new int[n];
	    
	    
	    for(int i = 0; i < n; i++) { 
	    	diamonds[i] = in.nextInt();
	    }
	    in.close();
	    ArrayList<Integer> temp2 = new ArrayList<Integer>();
	    
	    int result = 0;
	    
	    Arrays.sort(diamonds);
	    
	    for(int x = 0; x < diamonds.length; x++) { 
	    	ArrayList<Integer> temp = new ArrayList<Integer>();
	    	
	    	temp.add(diamonds[x]);
	    	
	    	for(int i = 0; i < diamonds.length; i++) { 
	    		if(i == x) { 
	    			;
	    		}
	    		
	    		else { 
	    			int count = 0; 
	    			for(int d = 0; d < temp.size(); d++) { 
	    				if(Math.abs(diamonds[i]-temp.get(d)) > k) {
	    					count++;
	    				}
	    			}
	    			
	    			if(count == 0) { 
	    				temp.add(diamonds[i]);
	    			}
	    		}
	    	}
	    	
	    	temp2.add(temp.size());
	    }
	    
	    for(int x = 0; x < temp2.size(); x++) { 
	    	result = Math.max(temp2.get(x), result);
	    }
	    
	    // CALCULATION //
	    

	    // OUTPUT //
	    PrintWriter out = new PrintWriter(new File(FILE_NAME + ".out"));
	    out.println(result);
	    System.out.println(result);
	    out.close();
	}

}
