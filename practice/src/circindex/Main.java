package circindex;

public class Main {
	static int multiplyAdj(int[] arr) { 
		int sum = 0;
		for(int i = 0; i < arr.length; i++) { 
			System.out.println(i);
			sum+=(arr[i]*arr[((i-1) + arr.length) % (arr.length)]*arr[(i+1) % arr.length]);
		}
		return sum;
	}
 	
	public static void main(String[] args) {
		int[] arr = {-11,-15,14,13,-18,-5,-6,-2,15,-14,-15,3,15,1,-1,-14,-4};
		System.out.println(multiplyAdj(arr));
	}
}
