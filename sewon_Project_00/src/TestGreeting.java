/* 1. TestGreeting 클래스 실행
 * 2. TestGreetingdml main() 메서드가 실행되어진다.
 * 3. Greeting 클래스로 부터 객체가 생성되어서 메모리상에 Loading이 되어진다.
 *    Greeting greeting = new Greeting();
 * 4. Greeting 클래스 greet() 메서드가 호출되어 진다.
 *    greeting.greet();

*/
public class TestGreeting {

	public static void main(String[] args) {
		// Greeting.greet();
		// Greeting 이라는 클래스로 부터 메모리상에 Loading 하기 위해서 new라는 연산자를 사용해서 객체를 생성해야 한다.
		Greeting greeting = new Greeting();
		// System.out.println(greeting);
		greeting.greet();

	}

}
