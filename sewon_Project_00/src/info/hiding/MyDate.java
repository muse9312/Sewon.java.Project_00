package info.hiding;

/*
 * 
 * Information Hiding (��������)
 * 
 * 1) �ʵ��� ���������ڴ� private ���� �����Ѵ�.
 * 2) �ʵ��� ���� ������ �� �ִ� setter method�� �����Ѵ�
 *   : setter method�� ����Ÿ���� ����(void), �ƱԸ�Ʈ���� �����Ϸ��� ���� �޴´�.
 * 3) �ʵ��� ���� ��ȸ�� �� �ִ� getter method�� �����Ѵ�.
 *   : getter method�� ����Ÿ���� �ְ� ,�ƱԸ�Ʈ�� ����.  
 * 
 */

public class MyDate {
	// ��
	private int year;

	// ��
	private int month;

	// ��
	private int day;
	
	//====================================================
	
	
	// =========================     *������*    ===========================
	
	public MyDate() {
		
	}
		
	// �� ,�� , ���� �ƱԸ�Ʈ�� �޴� ������ ����
	
	public MyDate(int year, int month, int day) {
//		this.year = year;
//		this.month = month;
//		this.day = day;
		
		setYear(year);
		setMonth(month);
		setDay(day);
		
	
		
		
		
		
	}	
	
	

	
	
	
	// =========================     *�޼���*    ===========================	
	
	// year �ʵ带 ��ȸ�ϴ� �޼���	
	public int getYear() {
		return year;
	}

	//====================================================	
	
	

	// year �ʵ带 �����ϴ� �޼���
	public void setYear(int year) {
		if (year >= 2000) {
			this.year = year;
		} else {
			System.out.println("�⵵�� 2000 ���� ���� �����մϴ�.");
		}
	}
	
	//====================================================
 
	// month �ʵ带 ��ȸ�ϴ� �޼��� 
	public int getMonth() {
		return month;
	}
	
	//====================================================

	// month �ʵ带 �����ϴ� �޼���
	public void setMonth(int month) {
		if (month >=1 & month <= 12) {
			this.month = month;
		} else {
			System.out.println("���� 1 ~ 12�� ������ ���� �����մϴ� ");
		}
	}
	
	//====================================================

	// day �ʵ带 ��ȸ�ϴ� �޼��� getter method
	public int getDay() {
		return day;
	}
	
	//====================================================

	// day �ʵ带 �����ϴ� �޼��� 
	public void setDay(int day) {
		if (day >=1 & day <= 31) {
			this.day = day;
		} else {
			System.out.println("���� 1 ~ 31�� ������ ���� �����մϴ�");
		}
	}
	
	//====================================================

	

}
