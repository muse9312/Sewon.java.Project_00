package account.test;

import account.entity.Account;

public class TestAccount {

	public static void main(String[] args) {
		
		Account aC = new Account();
		
		// ù��° ���¹�ȣ 123-20-7890 �ܾ� 50000
		// ù��° ������ ���¹�ȣ�� �ܾ��� ����ϼ���
		
		aC.setAccountld("123-20-7890");
		aC.setBalance(50000);
		
		
		// ù��° ���¹�ȣ 123-20-5678 �ܾ� 70000
		// ù��° ������ ���¹�ȣ�� �ھ��� ����ϼ���
		
		Account aC2 = new Account();
		
		aC2.setAccountld("123-20-5678");
		aC2.setBalance(70000);
		
		System.out.printf("ù��° ���¹�ȣ = %s%n�ܾ� = %d%n", aC.getAccountld(),aC.getBalance());
		System.out.println("=====================================================");
		System.out.printf("�ι�° ���¹�ȣ = %s%n�ܾ� = %d%n", aC2.getAccountld(),aC2.getBalance());
		

		
		
	}

}
