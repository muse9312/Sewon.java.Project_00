
public class TestCalcurator {

	public static void main(String[] args) {
		// ��ü�� �������� �ʰ� �ٷ� ȣ���� ���ִ�.
		// Calcurator.My();
		// static�� ���̸� Calcurator.My();�̷��� ����������.������ ���� �� �ʿ��� ����! , �޸𸮿� �����ؼ� �ӵ��� �����⶧��.
        String Oper1 = args[0];
        String Oper2 = args[1];
        int Per1 = Integer.parseInt(Oper1);
        int Per2 = Integer.parseInt(Oper2);
        
        
		Calcurator calcur1 = new Calcurator();
        // int result = calcur1.add(30 , 40);
//		System.out.println(calcur1.add(10, 20));
//		System.out.printf("���ϱ� �� ��� %d %n", calcur1.add(10, 20));
		System.out.println(calcur1.add(Per1,Per2));
		System.out.println(calcur1.minus(10, 20));
		System.out.println(calcur1.multiply(10, 20));
//		System.out.println(calcur1.divide(10, 20));
		System.out.printf("������ �� ��� %d %n", calcur1.divide(77, 3));
	    // %d : integer , %s : string? , %n : �ٹٲ� , %f : float ....
		System.out.println(calcur1.remainder(10, 20));
		
		// printf("~~~ %d " , ???)  => ���ڿ��� ���� ���� �ִ�. �����ϰ�

	}

}
