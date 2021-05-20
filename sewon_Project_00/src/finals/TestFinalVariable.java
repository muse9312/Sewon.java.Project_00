package finals;

public class TestFinalVariable {
	static final double PIE = 3.14;

	public static void main(String[] args) {

		// 에러사항 : The final field TestFinalVariable.PIE cannot be assigned
		// PIE = 3.78;
	}

}
