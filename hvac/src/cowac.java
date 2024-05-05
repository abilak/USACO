import java.util.*;
import java.io.*;
public class cowac {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] stalls = new int[100];
		for(int i = 0; i < n; i++) { 
			int start = in.nextInt();
			int end = in.nextInt(); 
			int ci = in.nextInt(); 
			for(int d = start; d <= end; d++) { 
				stalls[d] = ci;
			}
		}
		
	}
}
