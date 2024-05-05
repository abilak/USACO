import java.util.*;
import java.io.*;
public class photoshoot {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new File("photo.in"));
		int n = in.nextInt(); 
		boolean[] checker = new boolean[n+1]; // index 1 corresponds to cow 1, so on and so forth. cow 0 doesn't exist
		int[] bessie = new int[n-1];
		
		for(int i = 0; i < n-1; i++) { 
			bessie[i] = in.nextInt(); 
		}
		in.close();
		
		PrintWriter out = new PrintWriter(new File("photo.out"));
		for(int i = 1; i < bessie[0]; i++) { 
			Arrays.fill(checker, false);
			int[] sequence = new int[n];
			sequence[0] = i;
			checker[i] = true;
			int count = 0;
			for(int d = 0; d < bessie.length; d++) { 
				sequence[d+1] = bessie[d]-sequence[d];
				if(checker[sequence[d+1]] == true) { 
					count++;
					break;
				}
				checker[sequence[d+1]] = true;
			}
			
			if(count == 0) { 
				for(int k = 0; k < sequence.length; k++) { 
					if(k != sequence.length - 1) { 
						out.print(sequence[k] + " ");
					}
					else { 
						out.print(sequence[k]);
					}
				}
				break;
			}
		}
		out.close();
	}
}
