package member;

public class Member {
	public String name;
	public String id;
	public String password;
	public int age;

	// �⺻������(default construction) ����
	// ********�������� �̸��� �ݵ�� Ŭ������� ���ƾ� �Ѵ�.**********
	// �����ڴ� ����Ÿ���� ����. (void�� �ƴϴ�)
	// �����ڰ� ȣ��Ǵ� ������ new �����ڸ� �̿��� ��ü�� ���� �Ҷ� ȣ��!
	// �⺻ �����ڰ� �������� �ڵ������� �������� ����

	public Member() {
		System.out.println("�⺻������ ȣ���!!");
		name = "����";
		age = 10;

	}
	// ������ �ߺ�����(constructor overloading)
	// �ߺ� ���� �Ҷ� �ƱԸ�Ʈ�� ������ Ÿ���� �ٸ���!!!!

	public Member(String name, int age) {

		// this�� �ʵ�� �տ� ������

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
