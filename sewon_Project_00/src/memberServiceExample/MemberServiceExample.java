package memberServiceExample;

import java.util.Scanner;

//import javax.swing.JOptionPane;

import memberService.MemberService;

public class MemberServiceExample {
	public static void main(String[] args) {
//		JOptionPane.showMessageDialog(null, "id를 입력해주세요"); ===> 입력창 
		
		// 정답
//		boolean result = MS.login("hong", "12345");
//		MS.logout();
		
		
		Scanner scanner = new Scanner(System.in);

		MemberService ms = new MemberService();
		
		while (true) {
			
			System.out.println("ID와 PASSWORD를 입력해 주십시오");
			System.out.print(" id : ");
			String id = scanner.next();
			System.out.print(" password : ");
			String password = scanner.next();
			
			if(ms.login(id, password)) break;
			
	}
		
		



		
		
		
		
		
		
		System.out.println("로그아웃 하시겠습니까");
		String x = scanner.next();
		ms.logout(x);
		

	}

}
