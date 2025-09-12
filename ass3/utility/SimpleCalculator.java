package utility;

public class SimpleCalculator implements iCalculator{
	private int a;
	private int b;
	
	
	
	public SimpleCalculator() {}
	

	@Override
	public double add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double muliply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double divide(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	
	
}
