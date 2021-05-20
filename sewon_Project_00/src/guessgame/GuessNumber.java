package guessgame;

import java.util.Scanner;

public class GuessNumber {

	/*
	 * 1 ~ 100 ������ �� �� �ϳ��� ���� �����ϴ� ���� 5�� �̻� �õ� �ߴµ��� �� ���߸� �������� �Է¹��� ���� scanner�� ���
	 * ������ �� �߻��� Math.randon() �޼��带 ����Ѵ�.
	 * 
	 */
	public static void main(String[] args) {
		// ���� ���� ����
		int attempt = 1;

		// ����ڰ� ������ ��
		int userGuessNumber = 0;

		// �����ؾ� �� �信 �ش��ϴ� ��
		int secretNumber = (int) (Math.random() * 99 + 1);
		System.out.println(secretNumber);

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Enter a huess number 1 ~ 100");
			if (scanner.hasNextInt()) {
				userGuessNumber = scanner.nextInt();
				// System.out.println("�Է��� �� " + userGuessNumber);
				// ������ ������ ���
				if (userGuessNumber == secretNumber) {
					System.out.println("Your Number is Corret!!");
					break;
				}
				// 2. �Է��� ���� ���亸�� ������ ���� �۴ٴ� �޽��� ���
				else if (userGuessNumber < secretNumber) {
					System.out.println("Your Number is Smaller");
				}
				// 3. �Է��� ���� ���亸�� ũ�� ���� ũ�ٴ� �޽��� ���
				else if (userGuessNumber > secretNumber) {
					System.out.println("Your Number is Greater");
				}

				// ���� Ƚ���� 5�̸� ��������
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
