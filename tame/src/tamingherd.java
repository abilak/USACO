import java.io.File;
import java.util.*;
import java.io.*;
public class tamingherd {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new File("taming.in")); 
		int n = in.nextInt();
		int[] log = new int[n];
		for(int i = 0; i < n; i++) { 
			log[i] = in.nextInt(); 
		}
		in.close();
		log[0] = 0;
		int min = 0;
		int max = 0;
		for(int i = 0; i < log.length; i++) { 
			if(log[i] == 1) { 
				log[i-1] = 0;
			}
		}
		
		for(int i = 0; i < log.length; i++) { 
			if(log[i] > 0) { 
				int index = i;
				while(log[index] != 0) { 
					index--;
					log[index] = log[index+1]-1;
				}
			}
		}
		
		for(int i = 0; i < log.length; i++) { 
			if(log[i] == -1) { 
				max++;
			}
			else if(log[i] == 0) { 
				min++;
				max++;
			}
		}
		
		PrintWriter out = new PrintWriter(new File("taming.out"));
		out.println(min + " " + max);
		out.close();
	}
}
