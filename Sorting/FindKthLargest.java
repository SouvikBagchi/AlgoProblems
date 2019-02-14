import java.util.HashMap;
import java.util.PriorityQueue;

public class FindKthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int []test =  {2,5,4,3,6,7,3,5}; //2,3,3,4,5,5,6,7 answer for k = 4 : 5
		int k = 4;
		int s = findKthLargest(test,k);
		
		System.out.println(s);
	}
	
	public static int findKthLargest(int[] n, int k) {
		
		//Create a priority queue which will hold all the items coming in
		PriorityQueue<Integer> q = new PriorityQueue<>();
		
		//Keep adding to the priority queue
		for(int num : n) {
			q.add(num);
			
			/*
			 * We need to check if the q grows longer than k
			 * This is because when the queue has reached the length of k
			 * the next one which will entered is the one we want
			 */
			if (q.size()>k) {
				q.poll();
			}
		}
		//Return the last one we want
		return q.peek();
		
	}

}
