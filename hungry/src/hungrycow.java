import java.util.*;
public class hungrycow {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); 
		int t = in.nextInt(); 
		int curr_day = 0;
		long haybale_eaten = 0;
		long hay_in_barn = 0;
		for(int i = 0; i < n; i++) { 
			long act_curr_day = in.nextInt(); 
			long shipment = in.nextInt(); 
			curr_day += shipment;
			if(curr_day > t) { 
				haybale_count += ((t-act_curr_day+1)*1);
			}
			else { 
				haybale_count += shipment;
				other_haybale_count += shipment--;
			}
		}
		System.out.println(haybale_count);
	}
}
