package dateType;

public class TestPre {

	public static void main(String[] args) {
		// 1. �������� ���� �Ҽ� �ִ� ������ Ÿ�� : byte < short < int < long (�⺻Ÿ���� int)
		short n1 = 10;
		short n2 = 20;
		// n1,n2 ������ ������ short Ÿ��������,������ ����� int Ÿ��
		int result = n1 + n2;
		// int Ÿ���� short Ÿ������ ����ȯ(type conversion) =Type Casting
		short result2 = (short) (n1 + n2);
		System.out.println(result);
		System.out.println(result2);
		
		//myMEthod()ȣ��
		myMEthod(10l);
		myMEthod(n1);
		
		// 1. �Ǽ����� ���� �Ҽ� �ִ� ������ Ÿ�� : float < double (�⺻Ÿ���� double)
		//float pie = 3.14;  //3.14�� double Ÿ���̹Ƿ� float Ÿ�Ժ����� �����Ҽ� ����.
		float pie = 3.14f;
		float pie2 =(float)3.14;
		System.out.printf("pei = %.2f, pie2 = %.2f", pie ,pie2);

	}

	public static void myMEthod(short val) {
		System.out.println("I'm short");

	}

	public static void myMEthod(int val) {
		System.out.println("I'm int");

	}

	public static void myMEthod(long val) {
		System.out.println("I'm long");
	}
}