package array;

public class Test2DimensionArray {

	public static void main(String[] args) {
		// 2차원 배열 선언
		int[][] scores;
		// 2차원 배열 생성 (2행 3열의 행렬)
		scores = new int[2][3];
		System.out.println("Scores length" + scores.length);
		System.out.println("Scores[0] length" + scores.length);
		System.out.println("Scores[1] length" + scores.length);

		scores[0][0] = 1;
		scores[0][1] = 2;
		scores[0][2] = 3;

		scores[1][0] = 4;
		scores[1][1] = 5;
		scores[1][2] = 6;

//		for (int i = 0; i < scores.length; i++) {
//			System.out.printf("i =%d, scores[%d].length = %d%n ", i, i, scores[i].length);
//		}

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				//System.out.println(scores[i][j]);
				 System.out.printf("[%d][%d] = %d%n",  i ,j, scores[i][j]);

			}
		}
		
		int[][] javascores = {{95,80},{75,85,95}};
		System.out.println(javascores.length);
		System.out.println(javascores[0].length);
		System.out.println(javascores[1].length);
		
		for (int i = 0; i < javascores.length; i++) {
			for (int j = 0; j < javascores[i].length; j++) {
				System.out.printf("[%d][%d] = %d%n" , i ,j ,javascores[i][j]);
			}
		}
		

	}

}
