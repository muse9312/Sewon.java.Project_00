/* 1. TestGreeting Ŭ���� ����
 * 2. TestGreetingdml main() �޼��尡 ����Ǿ�����.
 * 3. Greeting Ŭ������ ���� ��ü�� �����Ǿ �޸𸮻� Loading�� �Ǿ�����.
 *    Greeting greeting = new Greeting();
 * 4. Greeting Ŭ���� greet() �޼��尡 ȣ��Ǿ� ����.
 *    greeting.greet();

*/
public class TestGreeting {

	public static void main(String[] args) {
		// Greeting.greet();
		// Greeting �̶�� Ŭ������ ���� �޸𸮻� Loading �ϱ� ���ؼ� new��� �����ڸ� ����ؼ� ��ü�� �����ؾ� �Ѵ�.
		Greeting greeting = new Greeting();
		// System.out.println(greeting);
		greeting.greet();

	}

}
