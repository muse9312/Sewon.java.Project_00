package memberServiceExample;

import java.util.Scanner;

//import javax.swing.JOptionPane;

import memberService.MemberService;

public class MemberServiceExample {
	public static void main(String[] args) {
//		JOptionPane.showMessageDialog(null, "id�� �Է����ּ���"); ===> �Է�â 
		
		// ����
//		boolean result = MS.login("hong", "12345");
//		MS.logout();
		
		
		Scanner scanner = new Scanner(System.in);

		MemberService ms = new MemberService();
		
		while (true) {
			
			System.out.println("ID�� PASSWORD�� �Է��� �ֽʽÿ�");
			System.out.print(" id : ");
			String id = scanner.next();
			System.out.print(" password : ");
			String password = scanner.next();
			
			if(ms.login(id, password)) break;
			
	}
		
		



		
		
		
		
		
		
		System.out.println("�α׾ƿ� �Ͻðڽ��ϱ�");
		String x = scanner.next();
		ms.logout(x);
		

	}

}
