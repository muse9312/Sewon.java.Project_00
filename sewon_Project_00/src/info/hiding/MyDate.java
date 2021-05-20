package info.hiding;

/*
 * 
 * Information Hiding (정보은닉)
 * 
 * 1) 필드의 접근제한자는 private 으로 설정한다.
 * 2) 필드의 값을 변경할 수 있는 setter method를 선언한다
 *   : setter method는 리턴타입이 없고(void), 아규먼트에는 변경하려는 값을 받는다.
 * 3) 필드의 값을 조회할 수 있는 getter method를 선언한다.
 *   : getter method는 리턴타입이 있고 ,아규먼트는 없다.  
 * 
 */

public class MyDate {
	// 년
	private int year;

	// 월
	private int month;

	// 일
	private int day;
	
	//====================================================
	
	
	// =========================     *생성자*    ===========================
	
	public MyDate() {
		
	}
		
	// 년 ,월 , 일을 아규먼트로 받는 생성자 선언
	
	public MyDate(int year, int month, int day) {
//		this.year = year;
//		this.month = month;
//		this.day = day;
		
		setYear(year);
		setMonth(month);
		setDay(day);
		
	
		
		
		
		
	}	
	
	

	
	
	
	// =========================     *메서드*    ===========================	
	
	// year 필드를 조회하는 메서드	
	public int getYear() {
		return year;
	}

	//====================================================	
	
	

	// year 필드를 변경하는 메서드
	public void setYear(int year) {
		if (year >= 2000) {
			this.year = year;
		} else {
			System.out.println("년도는 2000 이후 값만 가능합니다.");
		}
	}
	
	//====================================================
 
	// month 필드를 조회하는 메서드 
	public int getMonth() {
		return month;
	}
	
	//====================================================

	// month 필드를 변경하는 메서드
	public void setMonth(int month) {
		if (month >=1 & month <= 12) {
			this.month = month;
		} else {
			System.out.println("월은 1 ~ 12월 사이의 값만 가능합니다 ");
		}
	}
	
	//====================================================

	// day 필드를 조회하는 메서드 getter method
	public int getDay() {
		return day;
	}
	
	//====================================================

	// day 필드를 변경하는 메서드 
	public void setDay(int day) {
		if (day >=1 & day <= 31) {
			this.day = day;
		} else {
			System.out.println("일은 1 ~ 31일 사이의 값만 가능합니다");
		}
	}
	
	//====================================================

	

}
