package guessgame;

import java.util.Scanner;

public class GuessNumber {

	/*
	 * 1 ~ 100 사이의 값 중 하나의 값을 추측하는 게임 5번 이상 시도 했는데도 못 맞추면 게임종료 입력받은 값은 scanner를 사용
	 * 랜덤한 값 발생은 Math.randon() 메서드를 사용한다.
	 * 
	 */
	public static void main(String[] args) {
		// 게임 코인 갯수
		int attempt = 1;

		// 사용자가 추측한 값
		int userGuessNumber = 0;

		// 추측해야 할 답에 해당하는 값
		int secretNumber = (int) (Math.random() * 99 + 1);
		System.out.println(secretNumber);

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Enter a huess number 1 ~ 100");
			if (scanner.hasNextInt()) {
				userGuessNumber = scanner.nextInt();
				// System.out.println("입력한 값 " + userGuessNumber);
				// 정답을 맞췄을 경우
				if (userGuessNumber == secretNumber) {
					System.out.println("Your Number is Corret!!");
					break;
				}
				// 2. 입력한 값이 정답보다 작으면 값이 작다는 메시지 출력
				else if (userGuessNumber < secretNumber) {
					System.out.println("Your Number is Smaller");
				}
				// 3. 입력학 값이 정답보다 크면 값이 크다는 메시지 출력
				else if (userGuessNumber > secretNumber) {
					System.out.println("Your Number is Greater");
				}

				// 게임 횟수가 5이면 게임종료
				if (attempt == 5) {
					System.out.println("Your have exceeded the maximum attempt");
					break;

				}

			} else {
				System.out.println("Enter a Valid Integer Number");
				break;
			}
		} while (userGuessNumber != secretNumber);

		scanner.close();

	}

}
