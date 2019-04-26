package fr.diginamic.tp6.operation;

public class ExecuterOperation {

	public static int operation(IOperation op, int a, int b) {
		return op.calcul(a, b);
	}

}
