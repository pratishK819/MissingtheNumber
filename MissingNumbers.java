package missingnumbers;

public class MissingNumbers {
	public static int findMissingNumbers(int[] nums) {
		int n = nums.length;
		
		int expectedSum = n*(n + 1)/ 2;
		
		int actualSum = 0;
		for (int num : nums) {
			actualSum+= num;
		}
				
			return expectedSum-actualSum;
		}
	public static void main(String[] args) {
		int [] nums = {0,1,3,4,5};
		int missingNumber = findMissingNumbers(nums);
		System.out.println("The missing number is: + 2");
	}
		
		
	}


