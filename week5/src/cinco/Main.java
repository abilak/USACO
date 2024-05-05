package cinco;

public class Main {
	static double avgUV(int[] uvByLatitude, int[] bessieLatitudes) {
		double sum = 0;
		int index = 0;
		for(int i = 0; i < bessieLatitudes.length; i++) { 
			if(bessieLatitudes[i] >= 0) { 
				index = ((int) Math.floor(Math.abs(-90 - bessieLatitudes[i])/10));
				System.out.println(uvByLatitude[index]);
				sum += uvByLatitude[index];
			}
			
			else { 
				index = ((int) Math.floor(Math.abs(-90 - bessieLatitudes[i])/10));
				System.out.println(uvByLatitude[index]);
				sum += uvByLatitude[index];
			}
		}
		
		return (double)(sum/(bessieLatitudes.length));
	}
	
	public static void main(String[] args) { 
		int[] uvByLatitude = {2,3,4,5,7,9,12,12,12,10,8,6,3,1,1,0,0,0};
		int[] bessieLatitudes = {3, -41};
		
		System.out.println(avgUV(uvByLatitude, bessieLatitudes));
	}
}
