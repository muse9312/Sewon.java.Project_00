package dateType;

public class TestPre {

	public static void main(String[] args) {
		// 1. 정수값을 저장 할수 있는 데이터 타입 : byte < short < int < long (기본타입이 int)
		short n1 = 10;
		short n2 = 20;
		// n1,n2 각각의 변수는 short 타입이지만,연산한 결과는 int 타입
		int result = n1 + n2;
		// int 타입을 short 타입으로 형변환(type conversion) =Type Casting
		short result2 = (short) (n1 + n2);
		System.out.println(result);
		System.out.println(result2);
		
		//myMEthod()호출
		myMEthod(10l);
		myMEthod(n1);
		
		// 1. 실수값을 저장 할수 있는 데이터 타입 : float < double (기본타입이 double)
		//float pie = 3.14;  //3.14는 double 타입이므로 float 타입변수에 대입할수 없다.
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