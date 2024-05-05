package week8uno;

import java.util.ArrayList;

public class Main {
	static char relativelyMost(String a, String b) {
	    ArrayList<Character> common_chars = new ArrayList<Character>();
	    for(int i = 0; i < a.length(); i++) { 
	        for(int x= 0; x < b.length(); x++) { 
	            if(a.charAt(i) == b.charAt(x)) {
	                common_chars.add(a.charAt(i));
	            }
	        }
	    }
	    
	    if(common_chars.size() == 0) { 
	        return '!';
	    }
	    
	    int[] diffs = new int[common_chars.size()];
	    
	    for(int d = 0; d < common_chars.size(); d++) {
	        int count_a = 0;
	        int count_b = 0;
	        for(int c = 0; c < a.length(); c++) { 
	            if(a.charAt(c) == common_chars.get(d)) { 
	                count_a++;
	            }
	        }
	        
	        for(int c = 0; c < a.length(); c++) { 
	            if(b.charAt(c) == common_chars.get(d)) { 
	                count_b++;
	            }
	        }
	        
	        diffs[d] = count_a-count_b;
	    }
	    
	    int max2 = Integer.MIN_VALUE;
	    
	    for(int x = 0; x < diffs.length; x++) { 
	        max2 = Math.max(max2, diffs[x]);
	    }
	    char chara = 'c';
	    for(int x = 0; x < diffs.length; x++) { 
	        if(diffs[x] == max2) { 
	            chara = common_chars.get(x);
	        }
	    }
	    
	    return chara;
	}
	public static void main(String[] args) {
		System.out.println(relativelyMost("computerbyte", "ettin"));
	}
}
