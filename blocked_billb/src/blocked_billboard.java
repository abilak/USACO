import java.io.*;
import java.util.*;


public class blocked_billboard {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("billboard.in"));
		Billboard alfalfa = new Billboard(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
		Billboard grain = new Billboard(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
		Billboard steak = new Billboard(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
		
		int area1 = alfalfa.area_of_bill();
		int area2 = grain.area_of_bill(); 
		int minus_area1 = alfalfa.intersection_area(steak);
		int minus_area2 = grain.intersection_area(steak);
		
		PrintWriter out = new PrintWriter(new File("billboard.out"));
		out.println(area1+area2-(minus_area1 + minus_area2));
		out.close(); 
	}
	
	
}

class Billboard { 
	int x_ll;
	int y_ll;
	int x_ur;
	int y_ur;
	Billboard(int x_ll, int y_ll, int x_ur, int y_ur) { 
		this.x_ll = x_ll;
		this.y_ll = y_ll;
		this.x_ur = x_ur;
		this.y_ur = y_ur;
	}
	
	public int intersection_area(Billboard blocker) { 
		if(this.x_ur < blocker.x_ll || this.y_ur < blocker.y_ll) { 
			return 0;
		}
		
		else if(this.x_ll > blocker.x_ur || this.y_ll > blocker.y_ur) { 
			return 0;
		}
		
		else { 
			return (Math.min(blocker.x_ur, this.x_ur)-Math.max(this.x_ll, blocker.x_ll)) * (Math.min(blocker.y_ur, this.y_ur)-Math.max(this.y_ll, blocker.y_ll));
		}
	}
	
	public int area_of_bill() { 
		return ((this.x_ur-this.x_ll) * (this.y_ur-this.y_ll));
	}
	
}