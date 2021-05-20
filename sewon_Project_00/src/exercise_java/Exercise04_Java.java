package exercise_java;

public class Exercise04_Java {

	public static void main(String[] args) {
		int max = 0;
		int[] array = new int[5];
		
		array[0] = 1;
		array[1] = 5;
		array[2] = 3;
		array[3] = 8;
		array[4] = 2;
		
		
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				
			}
		}
		
		System.out.println("max: " + max);

	}

}
