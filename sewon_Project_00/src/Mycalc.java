/*
* args�� 2���� ���� �޾Ƽ� ��Ģ�����ϱ�
* java Mycalc 20 10
*/

public class Mycalc {

	public static void main(String[] args) {
//	�ƱԸ�Ʈ�� ���̰� 2���� ������ �����޼����� ����ϰ� �����ؾ� �Ѵ�.
		if (args.length < 2) {
//			System.err.println("java Mycalc 20 10");
			System.exit(-1);

		}
		String operStr1 = args[0];
		String operStr2 = args[1];
//		int oper1 = Integer.parseInt(args[0]);     <--- �̰� ����
		
//		ù��°  args�� ���� ���ڷ� ��ȯ�ϱ�
		
		int oper1 = Integer.parseInt(operStr1);
		int oper2 = Integer.parseInt(operStr2);
		
		//����
		// 3 + 6 = 9
		int plus = oper1 + oper2;
		int minus = oper1 - oper2;
		int multiply = oper1 * oper2;
		int divide = oper1 / oper2;
		int remainder = oper1 % oper2;
		
		System.out.println(oper1 + "*" + oper2 + "=" + multiply );
		System.out.println(oper1 + "-" + oper2 + "=" + minus );
		System.out.println(oper1 + "/" + oper2 + "=" + divide );
		System.out.println(oper1 + "%" + oper2 + "=" + remainder );
		System.out.println(oper1 + "+" + oper2 + "=" + plus );
		
		
		

	}//main

}//class
