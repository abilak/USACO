import java.util.*;
import java.io.*;
public class measurement {
	public static void main(String[] args) throws Exception {
	    Scanner in = new Scanner(new File("measurement.in"));
	    int n = in.nextInt();
	    CowEvent[] progress = new CowEvent[n];
	    
	    for(int i = 0; i < n; i++) { 
	    	int day2 = in.nextInt();
	    	String name2 = in.next();
	    	int inc2 = in.nextInt();
	    	if(name2 == "0") { 
	    		continue;
	    	}
	    	progress[i] = new CowEvent(day2, name2, inc2, 7);
	    }
	    
	    Arrays.sort(progress);


	    in.close();
	    
	    CowEvent bessie = new CowEvent(0, "Bessie", 1, 7);
	    CowEvent elsie = new CowEvent(0, "Elsie", 1, 7);
	    CowEvent mildred = new CowEvent(0, "Mildred", 1, 7);

	    int result = 0;
	    List<CowEvent> leaders = new ArrayList<CowEvent>();
	    
	    for(int i = 0; i < progress.length; i++) { 
	    	System.out.println(i);
	    	if(progress[i].name.contains("Bessie")) { 
	    		bessie.production += progress[i].inc;
	    	}
	    	
	    	else if(progress[i].name.contains("Elsie")) { 
	    		elsie.production += progress[i].inc;
	    	}
	    	
	    	else { 
	    		mildred.production += progress[i].inc;;
	    	}
	    	
	    	if(i == 0) { 
	    		result++;
	    		CowEvent[] leader_deter1 = {bessie, elsie, mildred};
	    		Arrays.sort(leader_deter1, new ProdComp());
	    		int max = leader_deter1[leader_deter1.length-1].production;
	    		for(int x = 0; x < leader_deter1.length; x++) { 
	    			if(leader_deter1[x].production == max) { 
	    				leaders.add(leader_deter1[x]);
	    			}
	    		}
	    	}
	    	
	    	else { 
	    		CowEvent[] leader_deter = {bessie, elsie, mildred};
		    	
		    	Arrays.sort(leader_deter, new ProdComp());
		    	
		    	int max = leader_deter[leader_deter.length-1].production;
		    	
		    	ArrayList<CowEvent> leaders_orig = new ArrayList<CowEvent>();
		    	
		    	for(int x = 0; x < leaders.size();x++) { 
		    		leaders_orig.add(leaders.get(x));
		    	}
		    	
		    	for(int p = 0; p < leaders_orig.size(); p++) { 
		    		System.out.println("leaders_orig " + leaders_orig.get(p).name + " " + leaders_orig.get(p).production);
		    	}
		    	leaders.clear();
		
		    	for(int d = 0; d < leader_deter.length; d++) { 
		    		if(leader_deter[d].production == max) { 
		    			leaders.add(leader_deter[d]);
		    		}
		    	}
		    	
		    	for(int k = 0; k < leaders.size(); k++) { 
		    		System.out.println("leaders " + leaders.get(k).name + " " + leaders.get(k).production);
		    	}
		    	Collections.sort(leaders);
		    	Collections.sort(leaders_orig);
		    	
		    	if(leaders.equals(leaders_orig) == false) { 
		    		result++;
		    	}
		    	
		    	
	    	}
	    
	    	
	    }
	    
	    PrintWriter out = new PrintWriter(new File("measurement.out"));
	    System.out.println(result);
	    out.println(result);
	    out.close();
	 }
	
	public static class CowEvent implements Comparable<CowEvent>{ 
		int day;
		String name;
		int inc;
		int production;
		
		CowEvent(int day, String name, int inc, int production) { 
			this.day = day;
			this.name = name; 
			this.inc = inc;
			this.production = production;
		}
		
		public int compareTo(CowEvent other) { 
			return this.day - other.day;
		}
		
	}
	
	public static class ProdComp implements Comparator<CowEvent> { 
		public int compare(CowEvent one, CowEvent two) {
			 return one.production - two.production;
		}
	}
}
