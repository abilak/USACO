import java.util.*;
import java.io.*;
public class blocks {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new File("blocks.in"));
		int n = in.nextInt() * 2;
		String[] words = new String[n];
		
		for(int i = 0; i < n; i++) { 
			words[i] = in.next();
		}
	    
	    // could have been made more efficient by making an array of size 26, and then doing Array[charAt(i)-a]++;
	    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	    PrintWriter out = new PrintWriter(new File("blocks.out"));
	    for(int x = 0; x < alphabet.length; x++) { 
	    	int result = 0; 
	    	for(int d = 0; d < words.length; d++) { 
	    		if(d % 2 == 0) { 
	    			int true_count1 = 0;
	    			int true_count2 = 0;
	    			int to_add = 0;
	    			for(int p = 0; p < words[d].length();p++) { 
	    				if(words[d].charAt(p) == alphabet[x]) { 
	    					true_count1++;
	    				}
	    			}
	    			for(int c = 0; c < words[d+1].length();c++) { 
	    				if(words[d+1].charAt(c) == alphabet[x]) { 
	    					true_count2++;
	    				}
	    			}
	    			
	    			to_add = Math.max(true_count1, true_count2);
	    			
	    			result += to_add;
	    		}
	    	}
	    	out.println(result);
	    }
	    out.close();
	}
}
