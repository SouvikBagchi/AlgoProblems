import java.util.HashMap;

public class WordDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []  s = {"practice", "makes", "perfect", "coding", "makes"};	
		String [] s2 = {"a","c","b","a"};
//		int ans = shortestDistance(s,"coding","practice");
		int ans2 = shortestDistance(s2,"a","b");
		System.out.println(ans2);

	}


	public static int shortestDistance(String[] words, String word1, String word2) {

		//Iterate till you find the first word and second from the back;


		//keep iterating
		//everytime you encounter a word you check if the other is found and 
		//update the value of distance
		//if you see that the word is already found then you update the smaller distance

		boolean firstFound =false;
		boolean secondFound = false;
		int fi=-1;
		int si =-1;
		int dist = words.length;
		for(int i =0;i<words.length;i++) {

			String currentWord = words[i];
			//check the words
			if(currentWord.equals(word1)) {

				fi =i;
				firstFound = true;
				//check if second is found else update fi
				if(secondFound) {
					
					int new_dist = Math.abs(si-fi);

					if(new_dist< dist) {
						dist = new_dist;
					}
				}

			
			}
			if(currentWord.equals(word2)) {
				
				secondFound = true;
				si = i;
				//check if second is found else update fi
				if(firstFound) {
					
					int new_dist = Math.abs(fi-si);

					if(new_dist< dist) {
						dist = new_dist;
					}
				}

				
			}

		}

		return dist;

	}
}
