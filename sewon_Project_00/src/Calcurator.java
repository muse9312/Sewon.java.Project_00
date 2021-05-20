/**
 * 
 * 사칙연산 기능을 제공하는 클래스입니다.
 * 
 * @version 11.02
 * @since 2021.5.10
 * @author Sewon
 * 
 *
 */
public class Calcurator {
	/**
	 * 
	 * 두개의 값을 입력으로 받아서더하기 연산을 수행하는 메서드입니다. 
	 *  
	 * @param oper1
	 * @param oper2
	 * @return
	 */
	// 2개의 입력을 받아서 더하기 연산을 한 결과를 반환하는 메서드 정의
	public int add(int oper1, int oper2) {
		// 지역변수() => 메서드 내부에 선언하는 메서드
		// void는 return하지 않는다.
//		int result = oper1 + oper2;		
//		return result;
		return oper1 + oper2;
		// System.out.println(result);
	}

	public int minus(int oper1, int oper2) {
		return oper1 - oper2;
	}

	public int multiply(int oper1, int oper2) {
		return oper1 * oper2;
	}

	/**
	 * 
	 * 두개의 값을 입력으로 받아서 나누기 연산을 수행하는 메서드입니다.
	 * 
	 * @param oper1
	 * @param oper2
	 * @return
	 */

	public int divide(int oper1, int oper2) {
		return oper1 / oper2;
	}

	public int remainder(int oper1, int oper2) {
		return oper1 % oper2;
	}

	/*
	 * public static void My() { System.out.println("나는 static 메서드입니다."); static을
	 * 붙이면 Calcurator.My();이렇게 간단해진다.하지만 정말 꼭 필요할 때만! , 메모리에 상주해서 속도가 느리기때문.
	 * 
	 * }
	 */
}