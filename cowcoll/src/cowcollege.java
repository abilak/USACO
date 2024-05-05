import java.util.*;
public class cowcollege {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] arr = new long[n];
		long tot_money = Long.MIN_VALUE;
		long tuition = Long.MAX_VALUE;
		long max_tuition = Long.MIN_VALUE;
		for(int i = 0; i < n; i++) { 
			arr[i] = (long)in.nextInt();
			max_tuition = Long.max(arr[i], max_tuition);
		}
		Arrays.sort(arr);
		for(long i = 0; i < arr.length; i++) { 
			long tot_money2 = 0;
			tot_money2 += arr[(int)i]*(arr.length - (i+1)+1);
			
			if(tot_money2 == tot_money) { 
				if(arr[(int)i] < tuition) { 
					tot_money = tot_money2;
					tuition = arr[(int)i];
				}
			}
			else if(tot_money2 > tot_money) { 
				tot_money = tot_money2;
				tuition = arr[(int)i];
			}
			
		}
		System.out.println(tot_money + " " + tuition);
	}
}
