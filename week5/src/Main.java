
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) { 
			arr[i] = in.nextInt();
		}
		
		in.close();
		
		long max = 0;
		
		for(int x = 0; x < arr.length; x++) { 
			max = Math.max(max, arr[x]);
		}
		
		long[] moneys = new long[(int)(max+1)];
		
		for(int p = 0; p <= max; p++) { 
			int count = 0;
			for(int d = 0; d < arr.length; d++) { 
				if(p <= arr[d]) { 
					count++;
				}
			}
			
			moneys[p] = count*p;
		}
		
		long max2 = 0;
		
		for(int d = 0; d < moneys.length; d++) { 
			max2 = Math.max(max2, moneys[d]);
		}
		
		long index = 0;
		
		for(int l = 0; l < moneys.length; l++) { 
			if(moneys[l] == max2) { 
				index = l; 
				break;
			}
		}
		
		System.out.println(max2 + " " + index);
		
	}
}
