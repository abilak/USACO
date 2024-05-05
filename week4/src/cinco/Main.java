package cinco;

public class Main {
	
	int findCost(int targetWeight, int targetSpots,int[] pounds, int[] spots){
		
		if(pounds.length == 0 || spots.length == 0) { 
			return 0;
		}
		
		int cost = 0;
		for(int i = 0; i < pounds.length; i++) { 
			cost+=(Math.abs(pounds[i]-targetWeight));
		}
		for(int a = 0; a < spots.length; a++) { 
			cost+=(5*Math.abs(spots[a]-targetSpots));
		}
		
		return cost;
		
	}
	
	public static void main(String[] args) {
		
	}
}
