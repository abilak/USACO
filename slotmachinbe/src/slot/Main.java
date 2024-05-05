package slot;

public class Main {
	static double avgSlotPrize(double[] prizes) {
		double n = prizes.length;
		double combs = n * n *n;
		double sum = 0;
		for(int i = 0; i < prizes.length; i++) { 
			sum += prizes[i]; 
			System.out.println(prizes[i]);
			System.out.println(((double)(prizes.length)-1) - (0.5*i));
			sum += (prizes[i]*((double)(prizes.length)-1)-(0.5*i));
		}
		System.out.println(sum);
		sum = sum / combs;
		return sum;
	}
	
	static double avgSlotPrize2(double[] prizes) {
	    int n = prizes.length;
	    int numCombos = n*n*n;
	    
	    double sumPrize = 0;
	    
	    for (int i = 0; i < n; i++) {
	        sumPrize += prizes[i];
	        sumPrize += prizes[i];
	        sumPrize += prizes[i] / 2;
	    }
	    System.out.println(sumPrize);
	    return sumPrize / numCombos;
	}
	public static void main(String[] args) {
		double[] arr = {100, 400, 200, 50, 150};
		System.out.println(avgSlotPrize(arr));
		System.out.println(avgSlotPrize2(arr));
	}
}
