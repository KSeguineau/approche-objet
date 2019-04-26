package fr.diginamic.tp6.operation;

public class TestExecuterOperation {

	public static void main(String[] args) {

		OperationAddition add = new OperationAddition();
		OperationMultiplication mult = new OperationMultiplication();

		System.out.println(ExecuterOperation.operation(add, 2, 3));
		System.out.println(ExecuterOperation.operation(mult, 7, 9));

	}

}
