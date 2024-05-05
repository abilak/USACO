import java.util.*;
import java.io.*;
public class famil {
	public static void main(String[] args) throws Exception {
	    Scanner in = new Scanner(new File("family.in"));
	    HashMap<String, String> relations = new HashMap<>();
	    
	    // cow to mother
	    
	    int n = in.nextInt();
	    
	    String cow1 = in.next();
	    
	    String cow2 = in.next();
	    
	    for(int i = 0; i < n; i++) { 
	    	String a = in.next();
	    	String b = in.next();
	    	relations.put(b, a);
	    }
	    
	    in.close();
	    String result = "NOT RELATED";
	    
	    for(int i = 0; i < 4; i++) { 
	    	if(i==0) { 
	    		if(relations.get(cow1).equals(relations.get(cow2))) { 
	    	    	result = "SIBLINGS";
	    	    	break;
	    	    }
	    	}
	    	
	    	else if(i == 1) { 
	    		String curr_cow = cow1;
	    		int levels1 = 0;
	    		int count1 = 0;
	    		while(relations.get(curr_cow) != null) { 
	    			levels1++;
	    			curr_cow = relations.get(curr_cow);
	    			if(curr_cow.equals(cow2)) { 
	    				result = cow2 + "is the ";
	    				for(int d = 0; d < levels1-2; d++) { 
	    					result = result + "great-";
	    				}
	    				result = result + "grandmother";
	    				result = result + "of " +cow1;
	    				count1++;
	    				break;
	    			}
	    		}
	    		if(count1 > 0) { 
	    			break;
	    		}
	    		count1 = 0;
	    		curr_cow = cow2;
	    		levels1 = 0;
	    		while(relations.get(curr_cow) != null) { 
	    			levels1++;
	    			curr_cow = relations.get(curr_cow);
	    			if(curr_cow.equals(cow1)) { 
	    				result = cow1 + "is the ";
	    				for(int d = 0; d < levels1-2; d++) { 
	    					result = result + "great-";
	    				}
	    				result = result + "grandmother";
	    				result = result + "of " +cow2;
	    				count1++;
	    				break;
	    			}
	    	}
	    		if(count1 > 0) { 
	    			break;
	    		}
	    }
	    	else if(i == 2) { 
	    		String curr_cow_2 = cow1;
	    		int levels_1 = 0;
	    		String other_cow_mother = relations.get(cow2);
	    		int count = 0;
	    		while(relations.get(curr_cow_2) != null) { 
	    			levels_1++;
	    			curr_cow_2 = relations.get(curr_cow_2);
	    			
	    			if(curr_cow_2.equals(other_cow_mother)) { 
	    				
	    				result = cow2 + " is the ";
	    				for(int d = 0; d < levels_1-2; d++) { 
	    					result = result + "great-";
	    				}
	    				result = result + "aunt";
	    				result = result + " of " + cow1;
	    				count++;
	    				break;
	    			}
	    		}
	    		if(count > 0) { 
	    			break;
	    		}
	    		count = 0;
	    		curr_cow_2 = cow2;
	    		levels_1 = 0;
	    		other_cow_mother = relations.get(cow1);
	    		while(relations.get(curr_cow_2) != null) { 
	    			levels_1++;
	    			curr_cow_2 = relations.get(curr_cow_2);
	    			if(curr_cow_2.equals(other_cow_mother)) { 
	    				result = cow1 + " is the ";
	    				for(int d = 0; d < levels_1-2; d++) { 
	    					result = result + "great-";
	    				}
	    				result = result + "aunt";
	    				result = result + " of " +cow2;
	    				count++;
	    				break;
	    			}
	    		}
	    		if(count > 1) { 
	    			break;
	    		}
	    	}
	    	
	    	else if(i == 3) { 
	    		String top_1 = "";
	    		String top_2 = "";
	    		String curr_cow2 = cow1;
	    		String curr_cow3 = cow2;
	    		
	    		while(relations.get(curr_cow2) != null) { 
	    			curr_cow2 = relations.get(curr_cow2);
	    		}
	    		
	    		top_1 = curr_cow2;
	    		
	    		while(relations.get(curr_cow3) != null) { 
	    			curr_cow3 = relations.get(curr_cow3);
	    		}
	    		
	    		top_2 = curr_cow3;
	    		
	    		if(top_1.equals(top_2)) { 
	    			result = "COUSINS";
	    			break;
	    		}
	    	}
	  }

	    PrintWriter out = new PrintWriter(new File("family.out"));
	    System.out.println(result);
	    out.println(result);
	    out.close();
	  }
}
