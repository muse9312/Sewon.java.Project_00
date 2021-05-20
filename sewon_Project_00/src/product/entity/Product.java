package product.entity;

//product.entity 패키지에 Product.java 클래스를 만드세요

public class Product {

	// Product (상품)
	public String name; // 상품이름
	public int price; // 상품가격
	public int quantity; // 상품수량
	public String getName; // 상품이름 반환
	public int getTotalPrice;
	
// ========================================================================================
	
	// **기본생성자를 만드세요
	public Product() {

	}
	
// ========================================================================================

	// **이름과 가격을 인자로 받는 생성자를 만드세요
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

// ========================================================================================

	// **이름과 가격과 수량을 인자로 받는 생성자를 만드세요
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
	
	// *****접근제한자 리턴타입 메서드명(){....}
	
	/*
	 * 상품이름을 반환하는 메서드를 작성하세요 
	 * 리턴타입 : String 
	 * 메서드명 : getName 
	 * 아규먼트 : 없음
	 */

	public String getName() {
		return name;
	}

// ========================================================================================

	/*
	 * 상품의 총가격을 반환하는 메서드를 작성하세요 price * quantity 리턴타입 : int 메서드명 : getTotalPrice
	 * 아규먼트 : 없음
	 * 
	 */

	public int getTotalPrice() {
		int totalPrice = (price * quantity);
		return totalPrice;
		

	}

}
