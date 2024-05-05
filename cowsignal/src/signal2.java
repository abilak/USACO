import java.util.*;
import java.io.*;
public class signal2 {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new File("cowsignal.in"));
		int m = in.nextInt(); // only used for data
		int n = in.nextInt(); // only used for data
		int k = in.nextInt(); // used for rest of problem
		
		char[][] orig_sig = new char[m][n];
		for(int i = 0; i < m; i++) { 
			orig_sig[i] = in.next().toCharArray();
		}
		ArrayList<String> thinger = new ArrayList<String>();
	    in.close();
	    PrintWriter out = new PrintWriter(new File("cowsignal.out"));
	    for(int d = 0; d < orig_sig.length; d++) { 
	    	StringBuffer thing = new StringBuffer();
	    	for(int x = 0; x < orig_sig[d].length; x++) { 
	    		ArrayList<Character> to_add_list = new ArrayList<Character>();
	    		
	    		for(int z = 0; z < k; z++) { 
	    			to_add_list.add(orig_sig[d][x]);
	    		}
	    		
	    		char[] array = new char[to_add_list.size()];
	    		
	    		for(int j = 0; j < to_add_list.size(); j++) { 
	    			array[j] = to_add_list.get(j);
	    		}
	    		
	    		String to_add_thing = new String(array);
	    		
	    		thing.append(to_add_thing);
	    	}
	    	
	    	String rev_str = thing.reverse().toString();
	    	thinger.add(rev_str);
	    }
	    
	    for(int i = 0; i < thinger.size(); i++) { 
	    	for(int x = 0; x < k; x++) { 
	    		out.println(thinger.get(thinger.size()-1-i));
	    	}
	    }
	    out.close();
	}
}
