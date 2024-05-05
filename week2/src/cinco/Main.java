package cinco;



public class Main {
	
	static int innerRange(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {

		      max = Math.max(max, array[i]);

		}
		
		int min = array[0];
		
		for (int p = 1; p < array.length; p++) {

		      min = Math.min(min, array[p]);

		}
		
		int[] arr2 = new int[array.length-2];
		
		
		int max_index = 0;
		for(int x = 0;x < array.length; x++) { 
			if((array[x] == max)) { 
				max_index = x;
				break;
			}
		}
		int min_index = 0;
		for(int d = 0; d < array.length; d++) { 
			if((array[d] == min)) { 
				min_index = d;
				break;
			}
		}


        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != min_index && i != max_index) {
                arr2[newIndex] = array[i];
                newIndex++;
            }
        }
		
		
		int max2 = arr2[0];
		for (int i = 1; i < arr2.length; i++) {

		      max2 = Math.max(max2, arr2[i]);

		}
		
		int min2 = arr2[0];
		
		for (int p = 1; p < arr2.length; p++) {

		      min2 = Math.min(min2, arr2[p]);

		}
		
		int thing = Math.abs(max2-min2);
		
		return thing;
	}
	
	
	public static void main(String[] args) {
		
		int[] ap = {3,3,7,10};
		
		System.out.println(innerRange(ap));
		
	}
}
