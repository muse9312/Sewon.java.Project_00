package dateType;

public class TestReferanceType {

	public static void main(String[] args) {
		
		// == 얀신지와 != 연산자를 사용
		// 1. Primitive Type 의 값 비교
		int n1 = 30;
		int n2 = 30;
		int n3 = 50;
		
		System.out.println("n1 == n2 " + (n1 == n2));
		System.out.println("n1 !== n2 " + (n1 != n2));
		System.out.println("n1 !== n3 " + (n1 != n3));
		
		// 2. Referance Type 의 주소 비교
		String str1 = new String("java");
		String str2 = new String("java");
		String str3 = new String("Java");
		String str3_1 = str3;
		
		
		
		System.out.println("str1 == str2 " + (str1 == str2));
		System.out.println("str3 == str3_1 " + (str3 == str3_1));
		str3_1 = new String("java");
		
		System.out.println("str3 == str3_1 " + (str3 == str3_1));
		
		// 3. Reference Type인 String 의 값 비교 
		System.out.println("str1.equals(str1)" + str1.equals(str2));
		System.out.println("str1.equals(str3)" + str1.equals(str3));
		
		// 대소문자 구분을 무시하고 값을 비교한다.
		System.out.println(str1.equalsIgnoreCase(str3));
		
		
		String str4 = "java";
		String str5 = "Java";
		
		System.out.println("str4 == str5 " + (str4 == str5));
		
		
		
		
		
		

	}

}
