import java.util.*;
import java.io.*;
public class leader {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int n = in.nextInt(); 
		int guerneys = 0;
		int holstein = 0;
		String cowline = in.next();
		int[] arr = new int[n]; // ranges for each cow
		for(int i = 0; i < n; i++) { 
			if(cowline.charAt(i) == 'G') { 
				guerneys++;
			}
			
			else { 
				holstein++; 
			}
			arr[i] = in.nextInt();
		}
		
	}
}
