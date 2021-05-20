
public class TestCalcurator {

	public static void main(String[] args) {
		// 객체를 생성하지 않고 바로 호줄할 수있다.
		// Calcurator.My();
		// static을 붙이면 Calcurator.My();이렇게 간단해진다.하지만 정말 꼭 필요할 때만! , 메모리에 상주해서 속도가 느리기때문.
        String Oper1 = args[0];
        String Oper2 = args[1];
        int Per1 = Integer.parseInt(Oper1);
        int Per2 = Integer.parseInt(Oper2);
        
        
		Calcurator calcur1 = new Calcurator();
        // int result = calcur1.add(30 , 40);
//		System.out.println(calcur1.add(10, 20));
//		System.out.printf("더하기 한 결과 %d %n", calcur1.add(10, 20));
		System.out.println(calcur1.add(Per1,Per2));
		System.out.println(calcur1.minus(10, 20));
		System.out.println(calcur1.multiply(10, 20));
//		System.out.println(calcur1.divide(10, 20));
		System.out.printf("나누기 한 결과 %d %n", calcur1.divide(77, 3));
	    // %d : integer , %s : string? , %n : 줄바꿈 , %f : float ....
		System.out.println(calcur1.remainder(10, 20));
		
		// printf("~~~ %d " , ???)  => 문자열과 같이 쓸수 있다. 간단하게

	}

}
