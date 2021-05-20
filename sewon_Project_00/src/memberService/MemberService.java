package memberService;

public class MemberService {

	public String ld;
	public String password;
	public String x;

	public boolean login(String id, String password) {
		this.ld = id;
		this.password = password;

		if (id.equals("muse9312") && password.equals("12345")) {
			System.out.println("로그인 되었습니다");
			return true;
		} else {

			System.out.println("id나 password가 일치하지 않습니다");
			System.out.println("다시 입력해주십시오");

			return false;

		}

	}

	public boolean logout(String x) {
		this.x = x;
		if (x.equals("네")) {
			System.out.println("로그아웃 되었습니다");
			return true;

		} else {
			if (x.equals("아니요")) {
				System.out.println("로그아웃 하지 않았습니다");

			}
		}
		return false;

	}

}
