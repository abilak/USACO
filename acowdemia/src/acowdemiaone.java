import java.util.*;
import java.io.*;
public class acowdemiaone {
	public static int determine_h(int[] arr, int xtra) {
		int h_index = Integer.MIN_VALUE;
			for(int i = 0; i <= arr.length; i++) { // i = h-index
				int count = 0;
				for(int c : arr) { 
					if(c > i) { 
						count++;
					}
				}
				if(count >= i) { 
					h_index = Math.max(h_index, i);
				}
			}
		
		
		
		return h_index;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); 
		int l = in.nextInt(); 
		
		int[] cit_counts = new int[n];
		
		for(int i = 0; i < n; i++) { 
			cit_counts[i] = in.nextInt();
		}
		
		System.out.println(determine_h(cit_counts, l-l));
	}
}
