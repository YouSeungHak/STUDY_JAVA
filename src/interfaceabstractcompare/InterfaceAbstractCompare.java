package interfaceabstractcompare;

public class InterfaceAbstractCompare {

	public static void main(String[] arg) {
		TestInterfaceImpl testInterface = new TestInterfaceImpl();
		testInterface.testCompareMethod();

		TestInterfaceNotImpl testAbstarct = new TestInterfaceNotImpl();
		testAbstarct.testCompareMethod();
	}
}