package array;

public class TestPrimitiveTypeArray {
	public static void name(String[] args) {
		// 배열 선언

		int[] nums;
		// 배열 초기화
		nums = new int[3];

		System.out.println(nums);
		System.out.println(nums.length);
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		// for 초기치;조건식;증감식;
		
		printArray(nums);
		// 각각 배열 방에 값을 대입
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;

		printArray(nums);
	}

	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);

		}
	}

}
