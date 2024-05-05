import java.util.*;
import java.io.*;

public class blo {
	public static boolean equaler(String word1, String word2) { 
		Set<Character> word1set = new HashSet<>();
		Set<Character> word2set = new HashSet<>();
		for(int i = 0; i < word1.length(); i++ ) { 
			word1set.add((Character)word1.charAt(i));
		}
		for(int i = 0; i < word2.length(); i++ ) { 
			word2set.add((Character)word2.charAt(i));
		}
		return word1set.equals(word2set);
	}
	public static String determine(String[] blocks, String word) {
		if(word.length() == 1) { 
			for(int i = 0; i < blocks.length; i++) { 
				for(int d = 0; d < blocks[i].length(); d++) { 
					Character letter = (Character)blocks[i].charAt(d);
					Character word_letter = (Character)word.charAt(0);
					if(letter.equals(word_letter) == true)  {
						return "YES"; 
					}
				}
			}
		}
		
		else if(word.length() == 2) { 
			for(int i = 0; i < blocks[0].length(); i++) { 
				for(int d = 0; d < blocks[1].length(); d++) { 
					StringBuilder builder = new StringBuilder(); 
					builder.append(blocks[0].charAt(i));
					builder.append(blocks[1].charAt(d));
					if(equaler(builder.toString(), word) == true) { 
						return "YES";
					}
				}
			}
			for(int i = 0; i < blocks[0].length(); i++) { 
				for(int d = 0; d < blocks[2].length(); d++) { 
					StringBuilder builder = new StringBuilder(); 
					builder.append(blocks[0].charAt(i));
					builder.append(blocks[2].charAt(d));
					if(equaler(builder.toString(), word) == true) { 
						return "YES";
					}
				}
			}
			for(int i = 0; i < blocks[0].length(); i++) { 
				for(int d = 0; d < blocks[3].length(); d++) { 
					StringBuilder builder = new StringBuilder(); 
					builder.append(blocks[0].charAt(i));
					builder.append(blocks[3].charAt(d));
					if(equaler(builder.toString(), word) == true) { 
						return "YES";
					}
				}
			}
			for(int i = 0; i < blocks[1].length(); i++) { 
				for(int d = 0; d < blocks[2].length(); d++) { 
					StringBuilder builder = new StringBuilder(); 
					builder.append(blocks[1].charAt(i));
					builder.append(blocks[2].charAt(d));
					if(equaler(builder.toString(), word) == true) { 
						return "YES";
					}
				}
			}
			for(int i = 0; i < blocks[1].length(); i++) { 
				for(int d = 0; d < blocks[3].length(); d++) { 
					StringBuilder builder = new StringBuilder(); 
					builder.append(blocks[1].charAt(i));
					builder.append(blocks[3].charAt(d));
					if(equaler(builder.toString(), word) == true) { 
						return "YES";
					}
				}
			}
			for(int i = 0; i < blocks[2].length(); i++) { 
				for(int d = 0; d < blocks[3].length(); d++) { 
					StringBuilder builder = new StringBuilder(); 
					builder.append(blocks[2].charAt(i));
					builder.append(blocks[3].charAt(d));
					if(equaler(builder.toString(), word) == true) { 
						return "YES";
					}
				}
			}
		}
		
		else if(word.length() == 3) { 
			for(int i = 0; i < blocks[0].length(); i++) { 
				for(int d = 0; d < blocks[1].length(); d++) { 
					for(int f = 0; f < blocks[2].length(); f++) { 
						StringBuilder builder = new StringBuilder(); 
						builder.append(blocks[0].charAt(i));
						builder.append(blocks[1].charAt(d));
						builder.append(blocks[2].charAt(f));
						if(equaler(builder.toString(), word) == true) { 
							return "YES";
						}
					}
				}
			}
			for(int i = 0; i < blocks[0].length(); i++) { 
				for(int d = 0; d < blocks[1].length(); d++) { 
					for(int f = 0; f < blocks[3].length(); f++) { 
						StringBuilder builder = new StringBuilder(); 
						builder.append(blocks[0].charAt(i));
						builder.append(blocks[1].charAt(d));
						builder.append(blocks[3].charAt(f));
						if(equaler(builder.toString(), word) == true) { 
							return "YES";
						}
					}
				}
			}
			for(int i = 0; i < blocks[0].length(); i++) { 
				for(int d = 0; d < blocks[2].length(); d++) { 
					for(int f = 0; f < blocks[3].length(); f++) { 
						StringBuilder builder = new StringBuilder(); 
						builder.append(blocks[0].charAt(i));
						builder.append(blocks[2].charAt(d));
						builder.append(blocks[3].charAt(f));
						if(equaler(builder.toString(), word) == true) { 
							return "YES";
						}
					}
				}
			}
			for(int i = 0; i < blocks[1].length(); i++) { 
				for(int d = 0; d < blocks[2].length(); d++) { 
					for(int f = 0; f < blocks[3].length(); f++) { 
						StringBuilder builder = new StringBuilder(); 
						builder.append(blocks[1].charAt(i));
						builder.append(blocks[2].charAt(d));
						builder.append(blocks[3].charAt(f));
						if(equaler(builder.toString(), word) == true) { 
							return "YES";
						}
					}
				}
			}
		}
		
		else if(word.length() == 4) { 
			for(int i = 0; i < blocks[1].length(); i++) { 
				for(int d = 0; d < blocks[2].length(); d++) { 
					for(int f = 0; f < blocks[3].length(); f++) { 
						for(int g = 0; g < blocks[0].length(); g++) { 
							StringBuilder builder = new StringBuilder(); 
							builder.append(blocks[0].charAt(g));
							builder.append(blocks[1].charAt(i));
							builder.append(blocks[2].charAt(d));
							builder.append(blocks[3].charAt(f));
							if(equaler(builder.toString(), word) == true) { 
								return "YES";
							}
						}
					}
				}
			}
		}
		
		return "NO";
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] blocks = new String[4];
		for(int i = 0; i < 4; i++) { 
			blocks[i] = in.next(); 
		}
		String[] words = new String[n]; 
		
		for(int i = 0; i < n; i++) { 
			words[i] = in.next(); 
		}
		
		for(int x = 0; x < words.length; x++) { 
			System.out.println(determine(blocks, words[x]));
		}
	}
}
