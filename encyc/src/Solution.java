import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new File("encyin.txt"));
		
		int n = in.nextInt();
		int q = in.nextInt();
		System.out.println(n + " " + q);
		int[] word_counts = new int[n]; // indices correspond to page nums + 1. so index 0 corresponds to page number 1
		
		int[] quests = new int[q];
		
		for(int i = 0; i < n; i++) { 
			word_counts[i] = in.nextInt();
		}
		
		for(int i = 0; i < q; i++) { 
			quests[i] = in.nextInt();
		}
		in.close();
		
		PrintWriter out = new PrintWriter(new File("encyout.txt"));
		for(int i = 0; i < quests.length; i++) { 
			out.println(word_counts[quests[i]-1]);
		}
		
		out.close();
	}
}
