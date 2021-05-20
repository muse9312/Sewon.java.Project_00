package dateType;

public class TestReferanceType {

	public static void main(String[] args) {
		
		// == ������� != �����ڸ� ���
		// 1. Primitive Type �� �� ��
		int n1 = 30;
		int n2 = 30;
		int n3 = 50;
		
		System.out.println("n1 == n2 " + (n1 == n2));
		System.out.println("n1 !== n2 " + (n1 != n2));
		System.out.println("n1 !== n3 " + (n1 != n3));
		
		// 2. Referance Type �� �ּ� ��
		String str1 = new String("java");
		String str2 = new String("java");
		String str3 = new String("Java");
		String str3_1 = str3;
		
		
		
		System.out.println("str1 == str2 " + (str1 == str2));
		System.out.println("str3 == str3_1 " + (str3 == str3_1));
		str3_1 = new String("java");
		
		System.out.println("str3 == str3_1 " + (str3 == str3_1));
		
		// 3. Reference Type�� String �� �� �� 
		System.out.println("str1.equals(str1)" + str1.equals(str2));
		System.out.println("str1.equals(str3)" + str1.equals(str3));
		
		// ��ҹ��� ������ �����ϰ� ���� ���Ѵ�.
		System.out.println(str1.equalsIgnoreCase(str3));
		
		
		String str4 = "java";
		String str5 = "Java";
		
		System.out.println("str4 == str5 " + (str4 == str5));
		
		
		
		
		
		

	}

}
