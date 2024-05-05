import java.util.*;
import java.io.*;
public class swapity {
	public static int[] morning_routine(int[] arr, int start, int end, int start1, int end1, int k) { 
		int[] new_arr = new int[arr.length];
		for(int i = 0; i < arr.length; i++) { 
			new_arr[i] = arr[i];
		}
		for(int i = start-1; i <= end-1; i++) { 
			new_arr[i] = arr[end-i-1];
		}
		
		int[] new_arr2 = new int[new_arr.length];
		// 
		for(int i = 0; i < arr.length; i++) { 
			new_arr2[i] = new_arr[i];
		}
		
		for(int i = start1-1; i <= end1-1; i++) { 
			new_arr2[i] = new_arr[end1-i-1];
		}
		
		return new_arr2;
	}
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new File("swap.in")); 
		int n  = in.nextInt();
		int k = in.nextInt();
		
		ArrayList<int[]> contain_arrays = new ArrayList<int[]>();
		
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++ ) { 
			arr[i] = i+1;
		}
		
		contain_arrays.add(arr);
		
		int start1 = in.nextInt();
		int end1 = in.nextInt();
		int start2 = in.nextInt();
		int end2 = in.nextInt();
		PrintWriter out = new PrintWriter(new File("swap.out"));
		
		
		
	}
}
