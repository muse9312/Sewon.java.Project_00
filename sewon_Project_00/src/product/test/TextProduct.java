package product.test;

//import java.util.ArrayList;

import java.util.Scanner;

import product.entity.Product;

public class TextProduct {

	public static <E> void main(String[] args) {

		
		// Product ��ü����		
		Product product = new Product();
		
		
		// Product�� �⺻�����ڸ� ȣ���ϼ���
		// ��ǰ�̸��� �������š� ������ 10000 ������ 1�� �ʱ�ȭ �ϼ���
		// ��ǰ�̸��� ����, ������ ����ϼ���
		
		product.name = "������";
		product.price = 10000;
		product.quantity = 2;
 
		
//================================================================================		
	
		Product product1 = new Product("�����", 20000);
		
		Product product2 = new Product("����", 10000, 2);
		
		
		
		
		
		
		
//================================================================================
		Scanner sc = new Scanner(System.in);
		System.out.println("����ǵ�");
		String name = sc.nextLine();

//		ArrayList<E> a = ["������", "�����" , "����" ]
//				
//		if (a.contains(name)) {
//			System.out.println("�ֽ��ϴ�. �ֹ�����");
//		}
		
//		switch (name) {
//		case : name.equals("������"):
//			System.out.println("�ֹ� �����մϴ�");
//			break;
//		case : .name.equals(anObject)
//			break;
//
//		default:
//			System.out.println();
//			break;
//		}
		
		
		
		
		if (name.equals("������") || name.equals("�����")) {
			System.out.println("�ֹ������մϴ�");
		} else {
			System.out.println("����� �׷� ��ǰ�� ������� �ʽ��ϴ�");

		}
		System.out.printf("������ �� = %d,%d,%d �Դϴ� ", product.price, product1.price, product2.price);
		
		

		
		
		
		
		
		
		System.out.printf("������ = %d%n ", product.price);
		System.out.println("������ �Է��Ͻʽÿ�");
		int quantity = sc.nextInt();
		
		if (quantity == 1 ) {
			System.out.println("�ֹ� �����մϴ�");
		} else if (quantity > 1 ) {
			System.out.println("��� �����մϴ�");
		}
		
			
		
		



//		System.out.println("��ǰ���� �Է��ϼ���");
//
//		System.out.printf("��ǰ�̸� = %s%n���� = %d%n���� = %d%n", product.name, product.price, product.quantity);
//		System.out.printf("��ǰ�� = %d%n" , product.getTotalPrice());
//
//		
//		System.out.println("========================================================");

		
//		// Product�� �̸��� ������ ���ڷ� �޴� �����ڸ� ȣ���ϼ���
//		// ��ǰ�̸��� ������� ������ 200000 �� ���� �����ϼ���
//		// ��ǰ�̸��� ������ ����ϼ���
//		System.out.printf("��ǰ�̸� = %s%n���� = %d%n", product1.name, product1.price);
//		System.out.printf("��ǰ�� = %d%n" , product1.getTotalPrice());
//
//		
//		System.out.println("========================================================");

		
//		// Product�� �̸�,����,������ ���ڷ� �޴� �����ڸ� ȣ���ϼ���
//		// ��ǰ�̸��� �����桱 ������ 10000 ������ 2 �� �����ϼ���
//		// ��ǰ�̸�,����,������ ����ϼ���

		
//		System.out.printf("��ǰ�̸� = %s%n���� = %d%n���� = %d%n", product2.name, product2.price, product2.quantity);
//		System.out.printf("��ǰ�� = %d" , product2.getTotalPrice());

	}

}
