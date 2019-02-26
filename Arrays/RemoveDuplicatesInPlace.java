/*
 * Remove Duplicates from Sorted Array
 * 
Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.
Example 2:

Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.
Clarification:

Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.

Internally you can think of this:

// nums is passed in by reference. (i.e., without making a copy)
int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for (int i = 0; i < len; i++) {
    print(nums[i]);
}
 */


public class RemoveDuplicatesInPlace {
	
	public static void main(String []args) {
		
		int [] test = {0,0,1,1,1,2,2,3,3,4};
		
		int ans = removeDuplicates(test);
		System.out.println(ans);
		
	}
	
	public static int removeDuplicates(int [] nums) {
		
		//This is the unique number of elements
		int unique = 0;
		
		//This holds the previous character
		//Note how this is set to null since we are using a Integer class and not int to represent it
		Integer prev = null;
		
		if(nums.length==0) {
			return 0;
		}
		
		if(nums.length ==1) {
			return 1;
		}
		
		//This variable holds the position of the element which still is unique
		int j = 0;
		//Traverse the array and check if 
		for(int i =0;i<nums.length;i++) {
			
			//check if it's the first element
			//If yes then set the prev to this element and add 1 to unique
			if(i==0) {
				prev = nums[i];
				unique+=1;
				j++;
			}
			
			//else
			
			else {
				//we check if the previous element is same
				//if it is then we don't increment j
				//we can either set previous to nums[i] or leave it as is
				if(nums[i]==prev) {
					prev=nums[i];
				}else {
					
					//add it to the current jth position
					//j++
					prev = nums[i];
					unique+=1;
					nums[j]=nums[i];
					j++;
				}
				
			}
		}
		return unique;
	}

}
