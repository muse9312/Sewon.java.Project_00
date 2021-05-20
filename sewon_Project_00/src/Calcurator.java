/**
 * 
 * ��Ģ���� ����� �����ϴ� Ŭ�����Դϴ�.
 * 
 * @version 11.02
 * @since 2021.5.10
 * @author Sewon
 * 
 *
 */
public class Calcurator {
	/**
	 * 
	 * �ΰ��� ���� �Է����� �޾Ƽ����ϱ� ������ �����ϴ� �޼����Դϴ�. 
	 *  
	 * @param oper1
	 * @param oper2
	 * @return
	 */
	// 2���� �Է��� �޾Ƽ� ���ϱ� ������ �� ����� ��ȯ�ϴ� �޼��� ����
	public int add(int oper1, int oper2) {
		// ��������() => �޼��� ���ο� �����ϴ� �޼���
		// void�� return���� �ʴ´�.
//		int result = oper1 + oper2;		
//		return result;
		return oper1 + oper2;
		// System.out.println(result);
	}

	public int minus(int oper1, int oper2) {
		return oper1 - oper2;
	}

	public int multiply(int oper1, int oper2) {
		return oper1 * oper2;
	}

	/**
	 * 
	 * �ΰ��� ���� �Է����� �޾Ƽ� ������ ������ �����ϴ� �޼����Դϴ�.
	 * 
	 * @param oper1
	 * @param oper2
	 * @return
	 */

	public int divide(int oper1, int oper2) {
		return oper1 / oper2;
	}

	public int remainder(int oper1, int oper2) {
		return oper1 % oper2;
	}

	/*
	 * public static void My() { System.out.println("���� static �޼����Դϴ�."); static��
	 * ���̸� Calcurator.My();�̷��� ����������.������ ���� �� �ʿ��� ����! , �޸𸮿� �����ؼ� �ӵ��� �����⶧��.
	 * 
	 * }
	 */
}