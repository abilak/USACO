import java.io.*;
import java.util.*;
public class socdisty {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new File("socdist2.in"));
		int n = in.nextInt(); 
		Cow[] cows = new Cow[n];
		
		for(int i = 0; i < n; i++) { 
			cows[i] = new Cow(in);
		}
		
		Arrays.sort(cows);
		
		int radius = Integer.MAX_VALUE;
		
		for(int i = 0; i < cows.length-1; i++) { 
			if((cows[i].infected == true && cows[i+1].infected == false) || (cows[i].infected == false && cows[i+1].infected == true)) { 
				radius = Math.min(radius, Math.abs(cows[i+1].x-cows[i].x)-1);
			}
		}
		System.out.println(radius);
		int cluster = 1;
		for(int i = 0; i < cows.length-1; i++) { 
			if((cows[i+1].infected == true || cows[i].infected == true) && (cows[i+1].x - cows[i].x > radius)) { 
				System.out.println(cows[i] + " " + cows[i+1]);
				cluster++;
			}
		}
		
		PrintWriter out = new PrintWriter(new File("socdist2.out"));
		out.println(cluster);
		out.close();
	}
}

class Cow implements Comparable<Cow> {
    int x;
    boolean infected;
    
    Cow(Scanner in) throws Exception {
        x = in.nextInt();
        infected = (in.nextInt() == 1);
    }
    
    public String toString() { 
    	return "x: " + x + " " + "infected: " + infected;
    }
    
    public int compareTo(Cow other) {
        if (this.x < other.x) return -1;
        if (this.x > other.x) return +1;
        return 0;
    }
}

