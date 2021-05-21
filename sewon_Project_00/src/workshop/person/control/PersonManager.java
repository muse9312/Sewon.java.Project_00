package workshop.person.control;

import workshop.person.entity.PersonEntity;

public class PersonManager {

	public PersonManager() {

	}

	public static void main(String[] args) {

//		PersonManager.java : Person�� ������ ��� Ŭ����
//		1) package�� workshop.person.control �̴�.
//		2) PersonEntity Ŭ������ import �Ѵ�.

		PersonEntity[] persons = new PersonEntity[10];

		PersonManager pManager = new PersonManager();

		System.out.println(" @@@ �ι� ���� ��ȸ �ý���@@@");
		System.out.println("==================================================================");

		pManager.fillPersons(persons);

		pManager.showPerson(persons);

		char gender = '여';

		System.out.printf("���� : \' %c \' (��)�� %d �Դϴ�%n", gender, pManager.findbyGender(persons, gender));

		pManager.printTileLine();
		
		String name2 = "���ϴ�";
		pManager.showPerson2(name2);
		
		pManager.printItemLine();
		
		String name = "���ϴ�";
	
				
		pManager.showPerson(persons, name);

	} // main

	// �迭�� ���� �ʱ�ȭ
	public void fillPersons(PersonEntity[] persons) {
		persons[0] = new PersonEntity("�̼�ȣ", "7212121028102", "��õ ��籸", "032-392-2932");
		persons[1] = new PersonEntity("���ϴ�", "7302132363217", "���� ������", "02-362-1932");
		persons[2] = new PersonEntity("�ڿ���", "7503111233201", "���� ���ϱ�", "02-887-1542");
		persons[3] = new PersonEntity("���μ�", "7312041038988", "���� ������", "032-384-2223");
		persons[4] = new PersonEntity("ȫ����", "7606221021341", "���� ��õ��", "02-158-7333");
		persons[5] = new PersonEntity("�̹̼�", "7502142021321", "���� ������", "02-323-1934");
		persons[6] = new PersonEntity("�ڼ���", "7402061023101", "���� ���α�", "02-308-0932");
		persons[7] = new PersonEntity("������", "7103282025101", "���� ����", "02-452-0939");
		persons[8] = new PersonEntity("Ȳ����", "7806231031101", "��õ �߱�", "032-327-2202");
		persons[9] = new PersonEntity("��ö��", "7601211025101", "��õ ��籸", "032-122-7832");

	} //

//	 �� �迭�� �� ����ϱ�
	public void showPerson(PersonEntity[] persons) {
//		for (int i = 0; i < persons.length; i++) {
//			x = persons[i]
//			System.out.println(persons[i].getName());
//			System.out.println(persons[i].getSsn());
//			System.out.println(persons[i].getAddress());
//			System.out.println(persons[i].getPhone());
//		}
//		persons[i] = i
		for (PersonEntity i : persons) {
			System.out.printf("[�̸�] %s    [����] %s    [��ȭ��ȣ] %s    [�ּ�] %s%n", i.getName(), i.getGender(), i.getPhone(),
					i.getAddress());
			printItemLine();

		}
	}

	public int findbyGender(PersonEntity[] persons, char gender) {
		int count = 0;
		for (PersonEntity x : persons) {
			if (gender == x.getGender()) {
				count++;
//				count +=1;
//				count = count +1;
				
			}
		}
		
		return count;

	}

//	showPerson(PersonEntity[] persons, String name)�� ȣ���Ͽ� Ư�� person�� �������� display
//	�Ѵ�. �̶� �̸� ������ �����ϴá� �� �Ѵ�.
	public void showPerson2(String name2) {
		System.out.printf("-- �̸� : \' %s \' (��)�� ã�� ����Դϴ�. --%n" , name2);
	}
	
	
	public void showPerson(PersonEntity[] persons, String name) {
		
		
		
		
		for (PersonEntity C : persons) {
			if (name == C.getName()) {
				System.out.printf("[�̸�] %s%n[����] %s%n[��ȭ��ȣ] %s%n[�ּ�] %s%n", C.getName(), C.getGender(), C.getPhone(),
						C.getAddress());

			}
			
			

		}

	}

	public void prinTitle(String title) {
		System.out.println("\n + title + \n");

	}

	public void printTileLine() {
		System.out.println("======================================================");

	}

	public void printItemLine() {
		System.out.println("-----------------------------------------------------");

	}

}// class
