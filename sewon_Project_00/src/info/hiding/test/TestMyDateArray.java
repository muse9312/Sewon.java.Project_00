package info.hiding.test;

import info.hiding.MyDate;

public class TestMyDateArray {

	public static void main(String[] args) {

		MyDate[] mD = new MyDate[3];
//		System.out.println(mD);
//		System.out.println(mD[0]);
		
		TestMyDateArray test = new TestMyDateArray();
		
		test.fillArray(mD);
		
		

		test.printArray(mD);

		

		// enhanced for loop

		for (MyDate date : mD) {
			System.out.println(date.getYear() + "-" + date.getMonth() + "-" + date.getDay());
		}

	}//main
	
	// ������ ����� ���� ����ϱ�
	public void printArray(MyDate[] mD) {
		for (int i = 0; i < mD.length; i++) {
			// mD[i] == MyDate
			System.out.println(mD[i].getYear());
			System.out.println(mD[i].getMonth());
			System.out.println(mD[i].getDay());
		}
		
	}// printArray
	
	// ������ �迭�� ���� �ʱ�ȭ
	public void fillArray(MyDate[] mD) {
		mD[0] = new MyDate(2021, 5, 20);
		mD[1] = new MyDate(2021, 6, 1);
		mD[2] = new MyDate(2022, 1, 1);
		
		
		
	}

}
