package ArrayClass;

import java.util.Arrays;

public class P1 {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8};
		int ind = Arrays.binarySearch(num, 3);
		
		System.out.println(ind);
		
		int[] nums = {2,4,1,5,7,3};
		Arrays.sort(nums);
		
		Arrays.fill(nums, -1);
		
		for(int i : nums) {
			System.out.print(i+" ");
		}
	}

}
