package exercise_java;

public class Exercise05_Java {

	public static void main(String[] args) {
		// int[][] array = {{95,86},{83,92,96},{78,83,93,87,88}};
		int[][] array = new int[3][5];

		array[0][0] = 95;
		array[0][1] = 86;

		array[1][0] = 83;
		array[1][1] = 92;
		array[1][2] = 96;

		array[2][0] = 78;
		array[2][1] = 83;
		array[2][2] = 93;
		array[2][3] = 87;
		array[2][4] = 88;

		int sum = 0;
		double avg = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				// System.out.println(array.length);
				sum += array[i][j];
				// sum = sum + array[i][j];

				avg = (int) (sum / 10);

//				System.out.printf("합계는  %d%n", sum);
//		System.out.printf("평균값은 %d", avg);

			}

		}

		System.out.println("sum:" + sum);
		System.out.println("avg: " + avg);

	}

}
