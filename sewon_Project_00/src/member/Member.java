package member;

public class Member {
	public String name;
	public String id;
	public String password;
	public int age;

	// 기본생성자(default construction) 선언
	// ********생성자의 이름은 반드시 클래스명과 같아야 한다.**********
	// 생성자는 리턴타입이 없다. (void도 아니다)
	// 생성자가 호출되는 시점은 new 연산자를 이용해 객체를 생성 할때 호출!
	// 기본 생성자가 있을때는 자동적으로 생성되지 않음

	public Member() {
		System.out.println("기본생성자 호출됨!!");
		name = "김멤버";
		age = 10;

	}
	// 생성자 중복정의(constructor overloading)
	// 중복 정의 할때 아규먼트의 갯수나 타입을 다르게!!!!

	public Member(String name, int age) {

		// this는 필드명 앞에 붙힌다

		this.name = name;
		this.age = age;

	}

	public Member(String name, int age, String password) {
//		this.name = name;
//		this.age = age;
		this(name, age);
		this.password = password;
	}

}
