package scanner;

import java.util.Scanner;

public class Myscanner {

	public static void main(String[] args) {
		//scanner ��ü ����
	    //inputStream = System.in
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� �̸��� �Է��ϼ���~");
		String name = scanner.next();
		System.out.println(name + "�� ȯ���մϴ�");
		
		
	    System.out.println("������ �ش��ϴ� ���ڸ� �Է��ϼ���");
	    int gender = scanner.nextInt();
	    System.out.println(gender);
	    
	    if(gender == 1 || gender == 3) {
	    	System.out.println("����");
	    }
	    else if (gender == 2 || gender == 4 ) {
			System.out.println("����");
		}
	    else {
			System.out.println("������ �ش��ϴ� ���ڰ��� �ƴմϴ�");
		}
	    scanner.close();
	    
	}

}
	
