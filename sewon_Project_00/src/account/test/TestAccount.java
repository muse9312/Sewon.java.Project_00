package account.test;

import account.entity.Account;

public class TestAccount {

	public static void main(String[] args) {
		
		Account aC = new Account();
		
		// 첫번째 계좌번호 123-20-7890 잔액 50000
		// 첫번째 계좌의 계좌번호와 잔액을 출력하세요
		
		aC.setAccountld("123-20-7890");
		aC.setBalance(50000);
		
		
		// 첫번째 계좌번호 123-20-5678 잔액 70000
		// 첫번째 계좌의 계좌번호와 자액을 출력하세요
		
		Account aC2 = new Account();
		
		aC2.setAccountld("123-20-5678");
		aC2.setBalance(70000);
		
		System.out.printf("첫번째 계좌번호 = %s%n잔액 = %d%n", aC.getAccountld(),aC.getBalance());
		System.out.println("=====================================================");
		System.out.printf("두번째 계좌번호 = %s%n잔액 = %d%n", aC2.getAccountld(),aC2.getBalance());
		

		
		
	}

}
