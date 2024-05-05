package uno;

public class Main {
	int max3(int[] vals) { 
		int result = Integer.MIN_VALUE;
		try { 
			for(int i = 0; i < vals.length; i++) { 
				int compare = vals[i] + vals[i+1] + vals[i+2];
				result = Math.max(compare, result);
			}
		}
		
		catch(Exception e) { 
			return result;
		}
		
		
		return result;
	}
	
	public static void main(String[] args) {
		
	}
}
