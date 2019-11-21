package StrategyPattern;

public class mainStrategy_patt {

	public static void main(String[] args) {
		
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 2 = " + context.executeStrategy(10, 2));
		
		
		context = new Context(new OperationSubtract());
		System.out.println("10 - 2 = " + context.executeStrategy(10, 2));
		
		
		context = new Context(new OperationMultiply());
		System.out.println("10 * 2 = " + context.executeStrategy(10, 2));
	}

}
