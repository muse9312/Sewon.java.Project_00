package array;

public class EnhancedForLoop {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };

		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);

		int sum = 0;
//		for (int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//			// sum = sum + scores[i]
//		}

		sum = 0;
		// Enhanced For Loop ���
		for (int score : scores) {
			sum += score;
			// sum = sum + score;
		}
		System.out.println("���� : " + sum);
		int avg = (int) sum / scores.length;
		System.out.println("��� : " + avg);
		//foreach
	}
}