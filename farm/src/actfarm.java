import java.math.BigDecimal;
import java.util.*;
public class actfarm {
	public static long farming(Plant[] plants) { 
		double max_equal_days_least = Double.MIN_VALUE;
		double max_equal_days_most = Double.MAX_VALUE;
		for(int i = 0; i < plants.length; i++) { 
			for(int d = 0; d < plants.length; d++) { 
				if((i > d) && (plants[i].height < plants[d].height)) { 
					if(plants[i].grow_rate <= plants[d].grow_rate) { 
						return -1;
					}
					else { 
						max_equal_days_least = Math.max((double)(((plants[i].height-plants[d].height)/(plants[d].grow_rate-plants[i].grow_rate))), (double)max_equal_days_least);
					}
				}
				else if((i > d) && (plants[i].height > plants[d].height)) { 
					if(plants[i].grow_rate <= plants[d].grow_rate) { 
						return -1;
					}
					else { 
						max_equal_days_most = Math.min((double)(((plants[i].height-plants[d].height)/(plants[d].grow_rate-plants[i].grow_rate))), (double)max_equal_days_least);
					}
				}
				
				else if((i < d) && (plants[i].height > plants[d].height)) { 
					if(plants[i].grow_rate <= plants[d].grow_rate) { 
						return -1;
					}
					else { 
						max_equal_days_most = Math.min((double)(((plants[i].height-plants[d].height)/(plants[d].grow_rate-plants[i].grow_rate))), (double)max_equal_days_least);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0; i < t; i++) { 
			int n = in.nextInt(); 
			long[] heights = new long[n];
			long[] grow_rate = new long[n];
			long[] tall_than_other = new long[n];
			for(int f = 0; f < n; f++) { 
				heights[f] = in.nextInt(); 
			}
			for(int f = 0; f < n; f++) { 
				grow_rate[f] = in.nextInt(); 
			}
			for(int f = 0; f < n; f++) { 
				tall_than_other[f] = in.nextInt(); 
			}
			System.out.println(farming(heights, grow_rate, tall_than_other));
			System.out.println(Arrays.toString(heights));
			System.out.println(Arrays.toString(grow_rate));
			System.out.println(Arrays.toString(tall_than_other));
		}
				
	}
	
}

class Plant implements Comparable<Plant> { 
	long height;
	long grow_rate;
	long taller_than;
	Plant(long height, long grow_rate, long taller_than) { 
		this.height = height;
		this.grow_rate = grow_rate;
		this.taller_than = taller_than;
	}

	public int compareTo(Plant o) {
		return ((int)this.taller_than - (int)o.taller_than);
	}
}


