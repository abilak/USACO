import java.util.*;
public class drain {
	public static long determine_drought(long[] arr) { 
		if(arr[0] > arr[1]) { 
			return -1L;
		}
		
		else { 
			long bags = 0;
			for(int i = 1; i < arr.length-1; i++) { 
				long diff = arr[i]-arr[i-1];
				if(diff < 0) { 
					continue;
				}
				bags += diff*2;
				arr[i] = arr[i]-diff;
				arr[i+1] = arr[i+1]-diff;
				if(arr[i+1] < 0) { 
					return -1L;
				}
			}
			if(arr[arr.length-1] > arr[arr.length-2]) { 
				return -1L; 
			}
			
			else { 
				for(int i = arr.length-2; i > 0; i--) { 
					long diff = arr[i]-arr[i+1];
					if(diff < 0) { 
						continue;
					}
					bags += diff*2;
					arr[i] = arr[i] - diff;
					arr[i-1] = arr[i-1]-diff;
					if(arr[i-1] < 0) { 
						return -1L; 
					}
				}
			}
			
			for(int i = 0; i < arr.length-1; i++) { 
				if(arr[i] != arr[i+1]) { 
					return -1L;
				}
			}
			return bags;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int top_n = in.nextInt(); 
		ArrayList<long[]> problems = new ArrayList<long[]>();
		
		for(int i = 0; i < top_n; i++) { 
			int new_n = in.nextInt(); 
			long[] arr = new long[new_n];
			for(int d = 0; d < new_n; d++) { 
				arr[d] = in.nextLong();
			}
			problems.add(arr);
		}
		
		for(int i = 0; i < problems.size(); i++) { 
			System.out.println(determine_drought(problems.get(i)));
		}
	}
}
