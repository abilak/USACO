import java.util.*;
import java.io.*;
public class candycane {
	public static ArrayList<Long> createArr(long len) { 
		ArrayList<Long> arr = new ArrayList<Long>();
		for(int i = 1; i <= len; i++) { 
			arr.add((long) i);
		}
		return arr;
	}
	public static ArrayList<Long> eat(ArrayList<Long> arr, long cow_height) { 
		int offset = 0;
		for(int i = 0; i < arr.size(); i++) { 
			if(arr.get(i) <= cow_height) { 
				arr.remove(i-offset);
				offset++;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		long n = in.nextInt(); 
		long m = in.nextInt(); 
		long[] cow_heights = new long[(int)n];
		ArrayList<ArrayList<Long>> cane_heights = new ArrayList<ArrayList<Long>>();
		cane_heights.toArray();
		long[] act_cane_height = new long[(int)m];
		
		for(int i = 0; i < n; i++) { 
			cow_heights[i] = in.nextLong();
		}
		for(int i = 0; i < m; i++) { 
			long thing = in.nextLong();
			cane_heights.add(createArr(thing));
			act_cane_height[i] = thing;
		}
		
		for(int i = 0; i < cane_heights.size(); i++) { 
			for(int d = 0; d < cow_heights.length; d++) { 
				ArrayList<Long> bitten = eat(cane_heights.get(i), cow_heights[d]);
				int size1 = cane_heights.get(i).size(); 
				int size2 = bitten.size(); 
				if(size2 == 0) { 
					break;
				}
				else { 
					if(size1 > size2) { 
						cow_heights[d] += (size1-size2);
					}
					cane_heights.set(i, bitten);
				}
				
			}
		}
		for(int i = 0; i < cow_heights.length; i++) { 
			System.out.println(cow_heights[i]);
		}
	}
}
