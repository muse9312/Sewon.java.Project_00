package product.test;

//import java.util.ArrayList;

import java.util.Scanner;

import product.entity.Product;

public class TextProduct {

	public static <E> void main(String[] args) {

		
		// Product 객체생성		
		Product product = new Product();
		
		
		// Product의 기본생성자를 호출하세요
		// 상품이름은 “자전거” 가격은 10000 수량은 1로 초기화 하세요
		// 상품이름과 가격, 수량을 출력하세요
		
		product.name = "자전거";
		product.price = 10000;
		product.quantity = 2;
 
		
//================================================================================		
	
		Product product1 = new Product("냉장고", 20000);
		
		Product product2 = new Product("가방", 10000, 2);
		
		
		
		
		
		
		
//================================================================================
		Scanner sc = new Scanner(System.in);
		System.out.println("뭐살건데");
		String name = sc.nextLine();

//		ArrayList<E> a = ["자전거", "냉장고" , "가방" ]
//				
//		if (a.contains(name)) {
//			System.out.println("있습니다. 주문가능");
//		}
		
//		switch (name) {
//		case : name.equals("자전거"):
//			System.out.println("주문 가능합니다");
//			break;
//		case : .name.equals(anObject)
//			break;
//
//		default:
//			System.out.println();
//			break;
//		}
		
		
		
		
		if (name.equals("자전거") || name.equals("냉장고")) {
			System.out.println("주문가능합니다");
		} else {
			System.out.println("저희는 그런 상품은 취급하지 않습니다");

		}
		System.out.printf("가격은 각 = %d,%d,%d 입니다 ", product.price, product1.price, product2.price);
		
		

		
		
		
		
		
		
		System.out.printf("가격은 = %d%n ", product.price);
		System.out.println("수량을 입력하십시요");
		int quantity = sc.nextInt();
		
		if (quantity == 1 ) {
			System.out.println("주문 가능합니다");
		} else if (quantity > 1 ) {
			System.out.println("재고가 부족합니다");
		}
		
			
		
		



//		System.out.println("상품명을 입력하세요");
//
//		System.out.printf("상품이름 = %s%n가격 = %d%n수량 = %d%n", product.name, product.price, product.quantity);
//		System.out.printf("상품합 = %d%n" , product.getTotalPrice());
//
//		
//		System.out.println("========================================================");

		
//		// Product의 이름과 가격을 인자로 받는 생성자를 호출하세요
//		// 상품이름은 “냉장고” 가격은 200000 인 값을 전달하세요
//		// 상품이름과 가격을 출력하세요
//		System.out.printf("상품이름 = %s%n가격 = %d%n", product1.name, product1.price);
//		System.out.printf("상품합 = %d%n" , product1.getTotalPrice());
//
//		
//		System.out.println("========================================================");

		
//		// Product의 이름,가격,수량을 인자로 받는 생성자를 호출하세요
//		// 상품이름은 “가방” 가격은 10000 수량은 2 로 전달하세요
//		// 상품이름,가격,수량을 출력하세요

		
//		System.out.printf("상품이름 = %s%n가격 = %d%n수량 = %d%n", product2.name, product2.price, product2.quantity);
//		System.out.printf("상품합 = %d" , product2.getTotalPrice());

	}

}
