package splitarr;
import java.util.*;
public class splitarr {
	static int splitIndex(int[] array) { 
		
		System.out.println(Arrays.toString(array));
		for(int i = 0; i < array.length; i++) { 
			int[] left_arr = Arrays.copyOfRange(array, 0, i);
			int[] right_arr = Arrays.copyOfRange(array, i, array.length);
			int sum1 = 0;
			int sum2 = 0;
			for(int x : left_arr) { 
				sum1 += x;
			}
			
			for(int j: right_arr) { 
				sum2 += j;
			}
			
			if(sum1 == sum2) return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array = {1,1};
		System.out.println(splitIndex(array));
	}
}
