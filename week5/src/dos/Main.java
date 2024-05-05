package dos;
import java.util.*;
public class Main {
	static int tossBall(int[] cows, int n) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
	    int count = 0;
	    int curr_index = 0;
	    while(count < n) { 
	    	int nextPos = ((cows[curr_index] + curr_index + cows.length) % (cows.length));
	    	curr_index = nextPos;
	    	arr.add(curr_index);
	    	count++;
	    }
	    
	    return arr.get(arr.size()-1);
	}
	public static void main(String[] args) {
		int[] arr = {3,3,0,-2};
		int n = 2;
		System.out.println(tossBall(arr, n));;
	}
}
//asdasdasdasdasdasdasdasdas -- top test keyboard
// time to have a lot of satisfying sounbdws :) 