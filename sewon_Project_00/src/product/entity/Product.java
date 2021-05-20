package product.entity;

//product.entity ��Ű���� Product.java Ŭ������ ���弼��

public class Product {

	// Product (��ǰ)
	public String name; // ��ǰ�̸�
	public int price; // ��ǰ����
	public int quantity; // ��ǰ����
	public String getName; // ��ǰ�̸� ��ȯ
	public int getTotalPrice;
	
// ========================================================================================
	
	// **�⺻�����ڸ� ���弼��
	public Product() {

	}
	
// ========================================================================================

	// **�̸��� ������ ���ڷ� �޴� �����ڸ� ���弼��
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

// ========================================================================================

	// **�̸��� ���ݰ� ������ ���ڷ� �޴� �����ڸ� ���弼��
	public Product(String name, int price, int quantity) {
		this(name, price);
		this.quantity = quantity;
	}

// ========================================================================================

	// Source -> Generate constructor using field
	//	public Product(String name, int price) {
//		super();
//		this.name = name;
//		this.price = price;
//	}
	
// ========================================================================================
	
	// *****���������� ����Ÿ�� �޼����(){....}
	
	/*
	 * ��ǰ�̸��� ��ȯ�ϴ� �޼��带 �ۼ��ϼ��� 
	 * ����Ÿ�� : String 
	 * �޼���� : getName 
	 * �ƱԸ�Ʈ : ����
	 */

	public String getName() {
		return name;
	}

// ========================================================================================

	/*
	 * ��ǰ�� �Ѱ����� ��ȯ�ϴ� �޼��带 �ۼ��ϼ��� price * quantity ����Ÿ�� : int �޼���� : getTotalPrice
	 * �ƱԸ�Ʈ : ����
	 * 
	 */

	public int getTotalPrice() {
		int totalPrice = (price * quantity);
		return totalPrice;
		

	}

}
