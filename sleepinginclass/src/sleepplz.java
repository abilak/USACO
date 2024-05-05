import java.util.*;
public class sleepplz { 
	public static int get_min(int[] arr) { 
		int sum = 0; 
		for(int i = 0; i < arr.length; i++) { 
			sum+=arr[i]; 
		}
		ArrayList<Integer> divisors = new ArrayList<Integer>(); // has the number that we want it to be condensed into
		
		// for example, if the sum is 12, we would have {1,2,3,4,6,12}. The first one would try to make every number 1, the second would make every number 2, so on and so forth. 
		
		for(int i = 1; i <= Math.sqrt((double) sum);i++) { 
			if(sum % i == 0) { 
				if(i == sum / i) { 
					divisors.add(i);
				}
				
				else { 
					divisors.add(i);
					divisors.add(sum/i);
				}
			}
		}
		
		Collections.sort(divisors);
		
		for(int i = 0; i < divisors.size(); i++) { 
			
			int div = divisors.get(i);
			int running_sum = 0;
			int index = 0;
			int count = 0;
			int actual_count = 0;
			int prev_ind = 0;
			while((running_sum < div) && (index < arr.length)) { 
				running_sum += arr[index];
				
				if(running_sum == div) { 
					count++;
					running_sum = 0;
					actual_count+=(index-prev_ind);
					prev_ind = index+1;
				}
				else if(running_sum > div) { 
					count = -57;
					break;
				}
				index++;
			}
			if(count > 0) { 
				return actual_count;
			}
				
		}
		
		return 0; 
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<int[]> logs = new ArrayList<int[]>();
		int n = in.nextInt(); 
		for(int i = 0; i < n; i++) { 
			int new_num = in.nextInt(); 
			int[] arr = new int[new_num];
			for(int d = 0; d < new_num; d++) { 
				arr[d] = in.nextInt();
			}
			logs.add(arr);
		}
		in.close();
		
		for(int i = 0; i < logs.size(); i++) { 
			System.out.println(get_min(logs.get(i)));
		}
		
	}
}


