package member_example;

import member.Member;

public class MemberExample {

	public static void main(String[] args) {
		Member member = new Member();
		
		System.out.println(member.name); // ±è¸â¹ö
		System.out.println(member.age); // 10
		
		Member member2 =new Member("±è¾Æ±Ô¸ÕÆ®", 100);
		System.out.println(member2.name);
		System.out.println(member2.age);
		
		Member member3 = new Member("¿À¼¼¿ø" , 29 , "wushuchj");
		System.out.println(member3.name);
		System.out.println(member3.age);
		System.out.println(member3.password);

		member.name = "ÃÖÇÏ¾á";
		member.id = "muse9132";
		member.password = "osw1443";
		member.age = 24;
		
		

		System.out.printf("NAME = %s%n", member.name); // ÃÖÇÏ¾á
		System.out.printf("id = %s%n", member.id);
		System.out.printf("PASSWORD = %s%n", member.password);
		System.out.printf("AGE = %d", member.age);
		
		
		
		
	}

}
