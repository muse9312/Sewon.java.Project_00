

// ������ ��� : javac HelloJava.java (�ڵ����� ��)
// ���� ��ɾ� : java HelloJava ������ 1
public class HelloJava {
	// ������ ������ �ڹ� Ŭ������ �Ƿ��� main �޼��尡 ����Ǿ� �־�� �Ѵ�.
	public static void main(String[] args) {
//		System.out.println(args.length);
		if (args.length == 0) {
			// �ȳ� �޽����� ����ϱ�
			System.out.println("Usages : java HelloJava ������");
			// ���α׷� ���� ��Ű��
			System.exit(-1);
		} // if
			// �ι�° �ƱԸ�Ʈ�� 1 or 3�̸� ����, 2 or 4�̸� ����
		String name = args[0];
//		System.out.println(args[0]);
//		System.out.println(args[1]);
		System.out.println("Hello " + name );

		String genderStr = args[1];
		// ���ڿ� Ÿ���� ���� Ÿ������ ��ȯ�ϱ�
		int gender = Integer.parseInt(genderStr);
		// �� ��° args�� 1�̰ų� 3�̸� ����, 2�̰ų� 4�̸� ����
		if (gender == 1 || gender == 3) {
			System.out.println("����");
		} else if (gender == 2 || gender == 4) {
			System.out.println("����");

		}

	}// main

}// class
