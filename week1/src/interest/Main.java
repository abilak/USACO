package interest;

public class Main {
	public static int altSum(int n) {
	    return (int)(((n*(n+1))/2) - 2*((Math.floor(n/2)*(Math.floor(n/2)+1))));
	}
	
	public static int altSumalt(int n) {
	    return (int)(Math.pow(n-(Math.floor(n/2)),2) - ((Math.floor(n/2))*(Math.floor(n/2)+1)));
	}

	public static void main(String[] args) {
		int x = 94;
		System.out.println(altSum(x));
		System.out.println(altSumalt(x));
	}
}
