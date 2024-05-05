package powerset;
import java.util.*;
public class powerset {
	public static <T> Set<Set<T>> powerSet(Set<T> originalSet) {
	    Set<Set<T>> sets = new HashSet<Set<T>>();
	    if(originalSet.isEmpty()) { 
	    	sets.add(new HashSet<T>());
	    	return sets;
	    }
	    
	    else { 
	    	ArrayList<T> big_fat = new ArrayList<T>(originalSet);
	    	T head = big_fat.get(0);
	    	Set<T> rest = new HashSet<T>(big_fat.subList(1, big_fat.size()));
	    	for(Set<T> set : powerSet(rest)) { 
	    		Set<T> newSet = new HashSet<T>();
	    		newSet.add(head);
	    		newSet.addAll(set);
	    		sets.add(set);
	    		sets.add(newSet);
	    	}
	    }
	    return sets;
	}  
	public static void main(String[] args) {
		Set<Integer> mySet = new HashSet<Integer>();
		mySet.add(1);
		mySet.add(2);
		mySet.add(3);
		for (Set<Integer> s : powerSet(mySet)) {
		    System.out.println(s.toString());
		}
	}
}
