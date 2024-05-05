import java.util.*;
import java.io.*;

public class balancing {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(new File("balancing.in"));
    int n = in.nextInt();
    int b = in.nextInt();
    int[] x_coords = new int[n];
    int[] y_coords = new int[n];
    
    for(int i = 0; i < 2*n; i++) { 
    	if(i % 2 == 0) { 
    		x_coords[i/2] = in.nextInt();
    	}
    	
    	else { 
    		y_coords[(i-1)/2] = in.nextInt();
    	}
    }
    
    // System.out.println(Arrays.toString(x_coords));
    // System.out.println(Arrays.toString(y_coords));
    HashSet<Integer> cols_to_check = new HashSet<Integer>();
    HashSet<Integer> rows_to_check = new HashSet<Integer>();
    
    for(int i = 0; i < x_coords.length; i++) { 
    	cols_to_check.add(x_coords[i]+1);
    }
    for(int z = 0; z < y_coords.length; z++) { 
    	rows_to_check.add(y_coords[z]+1);
    }
    
    in.close();
    int result = Integer.MAX_VALUE;
    for(Integer r : rows_to_check) { 
    	for(Integer c : cols_to_check) { 
    		int sec1 = 0;
    		int sec2 = 0;
    		int sec3 = 0;
    		int sec4 = 0;
    		for(int cr = 0; cr < x_coords.length; cr++)  { // cow row / x var
				if(x_coords[cr] < c && y_coords[cr] < r) { 
					sec1++;
				}
				
				else if(x_coords[cr] > c && y_coords[cr] > r) { 
					sec4++;
				}
				
				else if(x_coords[cr] > c && y_coords[cr] < r) { 
					sec3++;
				}
				
				else { 
					sec2++;
				}
    			
    		}
    		// System.out.println(r + " " + c);
    		// System.out.println(sec1 + " " + sec2 + " " + sec3 + " " + sec4);
    		int m = Math.max(sec1, Math.max(sec2, Math.max(sec3, sec4)));
    		result = Math.min(m, result);
    	}
    }

    PrintWriter out = new PrintWriter(new File("balancing.out"));
    System.out.println(result);
    out.println(result);
    out.close();
  }
}
