import java.util.*;
import java.io.*;
public class cander {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int n = in.nextInt(); 
		int m = in.nextInt(); 
		long[] cow_heights = new long[n];
		Interval[] cane_heights = new Interval[m];
		
		for(int i = 0; i < n; i++) { 
			cow_heights[i] = in.nextLong();
		}
		for(int i = 0; i < m; i++) { 
			cane_heights[i] = new Interval(0L,in.nextLong());
		}
		for(int i = 0; i < cane_heights.length; i++) { 
			for(int d = 0; d < cow_heights.length; d++) { 
				if((cane_heights[i].max >= cow_heights[d]) && (cow_heights[d] >= cane_heights[i].min)) { 
					long orig_size = cane_heights[i].size();
					cane_heights[i].min = cow_heights[d];
					long new_size = cane_heights[i].size();
					cow_heights[d] += (orig_size-new_size);
				}

				else if(cow_heights[d] >= cane_heights[i].max) { 
					cow_heights[d] += (cane_heights[i].size());
					break;
				}
			}
		}
		for(int i = 0; i < cow_heights.length; i++) { 
			System.out.println(cow_heights[i]);
		}
	}
}

class Interval { 
	long min;
	long max;
	Interval(long min, long max) { 
		this.min = min;
		this.max=max;
	}
	
	public long size() { 
		return this.max-this.min;
	}
	
	public String toString() { 
		StringBuilder sb = new StringBuilder();;
		sb.append("[");
		for(long i = this.min; i <= this.max; i++) { 
			if(i != this.max) { 
				sb.append(i);
				sb.append(", ");
			}
			else { 
				sb.append(i);
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
