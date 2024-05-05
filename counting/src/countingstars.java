import java.util.*;
public class countingstars {
	public static LinkedHashSet<Integer> make_interval_incboth(int start, int end) { 
		LinkedHashSet<Integer> thing = new LinkedHashSet<Integer>();
		for(int i = start; i<=end; i++) { 
			thing.add(i);
		}
		return thing;
	}
	
	public static LinkedHashSet<Integer> get_intersection(LinkedHashSet<Integer> first, LinkedHashSet<Integer>  second) { 
		first.retainAll(second);
		return first;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		LinkedHashSet<Integer> starting_set = make_interval_incboth((int)(-1*Math.pow(10, 10)), (int)Math.pow(10, 10));
		System.out.println("Done");
	}
}
