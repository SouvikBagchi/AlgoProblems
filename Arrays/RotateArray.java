/*
 * Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: [-1,-100,3,99] and k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */


public class RotateArray {




	public static void main(String[] args) {

		//Run to check the function
		int []k = {1,2};

		rotate(k,3);


	}

	//This code runs in O(n) and takes O(n) extra space
	public static void rotate(int[] nums, int k) {

		//We first get the 
		int len = nums.length;

		//if length is 1 then return the array 
		if(len != 1) {

			//We mod so that if the number of rotations is greater than the lenght of the array it still works
			int rot = k%len;

			//Don't rotate the array if rotation is 0
			if(rot!=0) {

				//This is the auxiliary array we have created to hold the rotated digits
				int []res =new int[len];

				//We will go to the element which will be in the beginning of the rotated array
				int j = len-rot;
				int i=0;

				//Keep add the numbers from the rotation point to the array
				while(j<len){

					res[i]=nums[j];
					j++;
					i++;
				}
				
				//Add rest of the elements to the array
				for(j=0;j<len-rot;j++){

					res[i]=nums[j];
					i++;


				}

				//Copy back original array
				for(i=0;i<len;i++){
					nums[i] = res[i];
				}

				//Print the array
				for(i =0;i<nums.length;i++) {
					System.out.print(nums[i]+" ");
				}
			}


		}

	}
}
