package workshop.person.entity;

public class PersonEntity {

//	PersonEntity.java : Person의 정보를 담는 클래스
//	1) package명은 workshop.person.entity 입니다.
//	2) 클래스 다이어그램을 참조하여 PersonEntity 클래스가 가져야 할 멤버변수들을 정의한다.
//	3) PersonEntity() : Default Constructor를 정의한다.
//	4) PersonEntity(String name, String ssn, String address, String phone)
//	: 이름, 주민등록번호, 거주지주소, 거주지 전화번호에 해당하는 멤버변수들을 초기화 하는데 , 이때
//	5)번에서 작성하게 될, 각각의 멤버변수들과 관련있는 setter 메서드를 사용한다.
//	5) 멤버변수들에 대한 getXXX() 메서드와 setXXX() 메서드를 작성한다.

	private String name;
	private char gender;
	private String ssn;
	private String address;
	private String phone;
	// ========================= *생성자* =============================

	// 기본생성자
	public PersonEntity() {

	}

	public PersonEntity(String name, String ssn, String address, String phone) {

		setAddress(address);
		setName(name);
		setPhone(phone);
		setSsn(ssn);

	}

	// ========================= *메서드* =============================

	// ===============================================================

	// 메서드

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public String getSsn() {
		return ssn;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	// ===============================================================

	// 메서드

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(char gender) {

		if (gender == '1' || gender == '3') {
			this.gender = '남';
		} else if (gender == '2' || gender == '4') {
			this.gender = '여';
		}
	}

	// ===============================================================

//	6) setSSN(String ssn) : 멤버변수 ssn의 setter 메서드
//	: 전달받은 아규먼트 값으로 멤버 변수 ssn을 변경하고, 주민등록번호(ssn)의 6번째 글자가 ‘1’ 또는
//	‘3’이면 멤버변수 gender를 ‘남’으로 변경하고, ‘2’ 또는 ‘4’이면 ‘여’로 변경한다.(조건 분기문(if) 를 사
//	용하며, API에서 String 클래스의 charAt() 메서드를 참조)

	public void setSsn(String ssn) {
		this.ssn = ssn;
		setGender(ssn.charAt(6));

	}

	// ===============================================================

	public void setAddress(String address) {
		this.address = address;

	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// ===============================================================

}
