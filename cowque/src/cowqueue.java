import java.util.*;
import java.io.*;

public class cowqueue {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(new File("cowqueue.in"));
    int loop_num = in.nextInt();
    int[] base_arr = new int[loop_num * 2];
    
    for(int i = 0; i < loop_num * 2; i++) { 
    	base_arr[i] = in.nextInt();
    }
    in.close();
    
    Cow[] cow_sort = new Cow[loop_num];
    
    for(int x = 0; x < base_arr.length - 1; x+=2) {
    	Cow cow = new Cow(base_arr[x], base_arr[x+1]);
    	cow_sort[x/2] = cow;
    }
    Arrays.sort(cow_sort);
    
    
    int result = cow_sort[0].time;
    
    for(int c = 0; c < cow_sort.length; c++)  {
    	if(c == 0) { 
    		result += cow_sort[c].duration;
    	}
    	
    	else { 
    		if(result < cow_sort[c].time) { 
    			result = cow_sort[c].time;
    			result += cow_sort[c].duration;
    		}
    		
    		else { 
    			result += cow_sort[c].duration;
    		}
    	}
    }
    
    PrintWriter out = new PrintWriter(new File("cowqueue.out"));
    System.out.println(result);
    out.println(result);
    out.close();
  }
  
  static class Cow implements Comparable<Cow> {
    int time;
    int duration;
    
    Cow(int time, int duration) { 
    	this.time = time; 
    	this.duration = duration;
    }
    
    public int compareTo(Cow other) {
        return this.time - other.time;
    }
}
}