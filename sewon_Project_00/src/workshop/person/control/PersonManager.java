package workshop.person.control;

import workshop.person.entity.PersonEntity;

public class PersonManager {

	public PersonManager() {

	}

	public static void main(String[] args) {

//		PersonManager.java : Person의 정보를 담는 클래스
//		1) package는 workshop.person.control 이다.
//		2) PersonEntity 클래스를 import 한다.

		PersonEntity[] persons = new PersonEntity[10];

		PersonManager pManager = new PersonManager();

		System.out.println(" @@@ 인물 정보 조회 시스템@@@");
		System.out.println("==================================================================");

		pManager.fillPersons(persons);

		pManager.showPerson(persons);

		char gender = '여';

		System.out.printf("성별 : \' %c \' (은)는 %d 입니다%n", gender, pManager.findbyGender(persons, gender));

		pManager.printTileLine();
		
		String name2 = "김하늘";
		pManager.showPerson2(name2);
		
		pManager.printItemLine();
		
		String name = "김하늘";
	
				
		pManager.showPerson(persons, name);

	} // main

	// 배열의 값을 초기화
	public void fillPersons(PersonEntity[] persons) {
		persons[0] = new PersonEntity("이성호", "7212121028102", "인천 계양구", "032-392-2932");
		persons[1] = new PersonEntity("김하늘", "7302132363217", "서울 강동구", "02-362-1932");
		persons[2] = new PersonEntity("박영수", "7503111233201", "서울 성북구", "02-887-1542");
		persons[3] = new PersonEntity("나인수", "7312041038988", "대전 유성구", "032-384-2223");
		persons[4] = new PersonEntity("홍정수", "7606221021341", "서울 양천구", "02-158-7333");
		persons[5] = new PersonEntity("이미숙", "7502142021321", "서울 강서구", "02-323-1934");
		persons[6] = new PersonEntity("박성구", "7402061023101", "서울 종로구", "02-308-0932");
		persons[7] = new PersonEntity("유성미", "7103282025101", "서울 은평구", "02-452-0939");
		persons[8] = new PersonEntity("황재현", "7806231031101", "인천 중구", "032-327-2202");
		persons[9] = new PersonEntity("최철수", "7601211025101", "인천 계양구", "032-122-7832");

	} //

//	 각 배열의 값 출력하기
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
			System.out.printf("[이름] %s    [성별] %s    [전화번호] %s    [주소] %s%n", i.getName(), i.getGender(), i.getPhone(),
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

//	showPerson(PersonEntity[] persons, String name)을 호출하여 특정 person의 상세정보를 display
//	한다. 이때 이름 정보는 “김하늘” 로 한다.
	public void showPerson2(String name2) {
		System.out.printf("-- 이름 : \' %s \' (으)로 찾기 결과입니다. --%n" , name2);
	}
	
	
	public void showPerson(PersonEntity[] persons, String name) {
		
		
		
		
		for (PersonEntity C : persons) {
			if (name == C.getName()) {
				System.out.printf("[이름] %s%n[성별] %s%n[전화번호] %s%n[주소] %s%n", C.getName(), C.getGender(), C.getPhone(),
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
