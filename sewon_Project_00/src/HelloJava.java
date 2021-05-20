

// 컴파일 명령 : javac HelloJava.java (자동으로 됨)
// 실행 명령어 : java HelloJava 오세원 1
public class HelloJava {
	// 실행이 가능한 자바 클래스가 되려면 main 메서드가 선언되어 있어야 한다.
	public static void main(String[] args) {
//		System.out.println(args.length);
		if (args.length == 0) {
			// 안내 메시지를 출력하기
			System.out.println("Usages : java HelloJava 오세원");
			// 프로그램 종료 시키기
			System.exit(-1);
		} // if
			// 두번째 아규먼트가 1 or 3이면 남자, 2 or 4이면 여자
		String name = args[0];
//		System.out.println(args[0]);
//		System.out.println(args[1]);
		System.out.println("Hello " + name );

		String genderStr = args[1];
		// 문자열 타입을 숫자 타입으로 변환하기
		int gender = Integer.parseInt(genderStr);
		// 두 번째 args가 1이거나 3이면 남자, 2이거나 4이면 여자
		if (gender == 1 || gender == 3) {
			System.out.println("남자");
		} else if (gender == 2 || gender == 4) {
			System.out.println("여자");

		}

	}// main

}// class
