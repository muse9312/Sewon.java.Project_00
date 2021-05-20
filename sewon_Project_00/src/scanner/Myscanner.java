package scanner;

import java.util.Scanner;

public class Myscanner {

	public static void main(String[] args) {
		//scanner 객체 생성
	    //inputStream = System.in
		Scanner scanner = new Scanner(System.in);
		System.out.println("당신의 이름을 입력하세요~");
		String name = scanner.next();
		System.out.println(name + "님 환영합니다");
		
		
	    System.out.println("성별에 해당하는 숫자를 입력하세요");
	    int gender = scanner.nextInt();
	    System.out.println(gender);
	    
	    if(gender == 1 || gender == 3) {
	    	System.out.println("남자");
	    }
	    else if (gender == 2 || gender == 4 ) {
			System.out.println("여자");
		}
	    else {
			System.out.println("성별에 해당하는 숫자값이 아닙니다");
		}
	    scanner.close();
	    
	}

}
	
