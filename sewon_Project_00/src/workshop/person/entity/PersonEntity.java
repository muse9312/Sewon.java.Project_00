package workshop.person.entity;

public class PersonEntity {

//	PersonEntity.java : Person�� ������ ��� Ŭ����
//	1) package���� workshop.person.entity �Դϴ�.
//	2) Ŭ���� ���̾�׷��� �����Ͽ� PersonEntity Ŭ������ ������ �� ����������� �����Ѵ�.
//	3) PersonEntity() : Default Constructor�� �����Ѵ�.
//	4) PersonEntity(String name, String ssn, String address, String phone)
//	: �̸�, �ֹε�Ϲ�ȣ, �������ּ�, ������ ��ȭ��ȣ�� �ش��ϴ� ����������� �ʱ�ȭ �ϴµ� , �̶�
//	5)������ �ۼ��ϰ� ��, ������ ���������� �����ִ� setter �޼��带 ����Ѵ�.
//	5) ��������鿡 ���� getXXX() �޼���� setXXX() �޼��带 �ۼ��Ѵ�.

	private String name;
	private char gender;
	private String ssn;
	private String address;
	private String phone;
	// ========================= *������* =============================

	// �⺻������
	public PersonEntity() {

	}

	public PersonEntity(String name, String ssn, String address, String phone) {

		setAddress(address);
		setName(name);
		setPhone(phone);
		setSsn(ssn);

	}

	// ========================= *�޼���* =============================

	// ===============================================================

	// �޼���

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

	// �޼���

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

//	6) setSSN(String ssn) : ������� ssn�� setter �޼���
//	: ���޹��� �ƱԸ�Ʈ ������ ��� ���� ssn�� �����ϰ�, �ֹε�Ϲ�ȣ(ssn)�� 6��° ���ڰ� ��1�� �Ǵ�
//	��3���̸� ������� gender�� ���������� �����ϰ�, ��2�� �Ǵ� ��4���̸� �������� �����Ѵ�.(���� �б⹮(if) �� ��
//	���ϸ�, API���� String Ŭ������ charAt() �޼��带 ����)

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
