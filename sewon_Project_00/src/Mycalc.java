/*
* args로 2개의 값을 받아서 사칙연산하기
* java Mycalc 20 10
*/

public class Mycalc {

	public static void main(String[] args) {
//	아규먼트의 길이가 2보다 작으면 사용법메세지를 출력하고 종료해야 한다.
		if (args.length < 2) {
//			System.err.println("java Mycalc 20 10");
			System.exit(-1);

		}
		String operStr1 = args[0];
		String operStr2 = args[1];
//		int oper1 = Integer.parseInt(args[0]);     <--- 이게 정석
		
//		첫번째  args의 값을 숫자로 변환하기
		
		int oper1 = Integer.parseInt(operStr1);
		int oper2 = Integer.parseInt(operStr2);
		
		//덧셈
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
