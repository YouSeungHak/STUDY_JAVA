package trycatchfinally;

public class TrayCatchFinally {
	
	public static void testTryCatchFinally() {
		try {
			System.out.println("Hello Try");
			if(true)
				return;
			System.out.println("End Try");
		} catch (Exception e) {
			System.out.println("Hello Catch");
		} finally {
			System.out.println("Hello Finally");
		}
	}
	
	public static void main(String[] args) {
		testTryCatchFinally();
	}

}
