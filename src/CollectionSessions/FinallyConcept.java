package CollectionSessions;

public class FinallyConcept {
	
	// write the code finally after try-catch block, finally code will execute even error in the functions(without terminating the prog)

	public static void main(String[] args) {

		//test1();
		test2();
		test3();
	}

	public static void test1() {

		try {
			System.out.println("Try.....test1");
			throw new RuntimeException("test1");
		} catch (Exception e) {
			System.out.println("Catch Inside ....teast1");
		} finally {
			System.out.println("Finally inside...test1");
		}

	}

	public static void test2() {

		try {
			System.out.println("Try Inside----Test2");
		} finally {
			System.out.println("Finally Inside ----Test2");
		}
	}

	@SuppressWarnings("unused")
	public static void test3() {
		int i = 10;
		try {

			System.out.println("Try Inside -----Test3");
			int k = i / 0;
			throw new ArithmeticException("s");
		} catch (ArithmeticException e) {
			System.out.println("Catch Inside----Test3");
		} finally {
			System.out.println("Finally Inside----Test3");
		}
	}
}
