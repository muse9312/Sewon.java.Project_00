package array;

public class TestPrimitiveTypeArray {
	public static void name(String[] args) {
		// �迭 ����

		int[] nums;
		// �迭 �ʱ�ȭ
		nums = new int[3];

		System.out.println(nums);
		System.out.println(nums.length);
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		// for �ʱ�ġ;���ǽ�;������;
		
		printArray(nums);
		// ���� �迭 �濡 ���� ����
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
