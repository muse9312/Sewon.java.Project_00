package memberService;

public class MemberService {

	public String ld;
	public String password;
	public String x;

	public boolean login(String id, String password) {
		this.ld = id;
		this.password = password;

		if (id.equals("muse9312") && password.equals("12345")) {
			System.out.println("�α��� �Ǿ����ϴ�");
			return true;
		} else {

			System.out.println("id�� password�� ��ġ���� �ʽ��ϴ�");
			System.out.println("�ٽ� �Է����ֽʽÿ�");

			return false;

		}

	}

	public boolean logout(String x) {
		this.x = x;
		if (x.equals("��")) {
			System.out.println("�α׾ƿ� �Ǿ����ϴ�");
			return true;

		} else {
			if (x.equals("�ƴϿ�")) {
				System.out.println("�α׾ƿ� ���� �ʾҽ��ϴ�");

			}
		}
		return false;

	}

}
