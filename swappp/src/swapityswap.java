import java.util.*;
import java.io.*;
public class swapityswap {
	public static int[] algorithm(int[] arr, int a1, int a2) { 
		int[] new_arr = Arrays.copyOf(arr, arr.length);
		float avg = (float)((a2-1)+(a1-1))/2;
		for(int i = a2-1; i >= a1-1; i--) { 
			arr[(int)(avg-(i-avg))] = new_arr[i];
		}
		return arr;
	}
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new File("swap.in"));
		int n = in.nextInt(); 
		int k = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt(); 
		int b1 = in.nextInt(); 
		int b2 = in.nextInt();
		int[] cow_seq = new int[n];
		for(int i = 0; i < cow_seq.length; i++) { 
			cow_seq[i] = i+1;
		}
		
		int[] new_cow_seq = Arrays.copyOf(cow_seq, n);
		int modul = 0;
		boolean ting = true;
		while(ting) { 
			new_cow_seq = Arrays.copyOf(algorithm(new_cow_seq, a1, a2), n);
			new_cow_seq = Arrays.copyOf(algorithm(new_cow_seq, b1, b2), n);
			modul++;
			if(Arrays.equals(new_cow_seq, cow_seq) == true) { 
				ting = false;
				break;
			}
		}
		
		int new_k = k % modul;
		
		for(int d = 0; d < new_k; d++) { 
			cow_seq = Arrays.copyOf(algorithm(new_cow_seq, a1, a2), n);
			cow_seq = Arrays.copyOf(algorithm(new_cow_seq, b1, b2), n);
		}
		PrintWriter out = new PrintWriter(new File("swap.out"));
		for(int i = 0; i < cow_seq.length; i++) { 
			out.println(cow_seq[i]);
		}
		out.close();
	}
	
}
