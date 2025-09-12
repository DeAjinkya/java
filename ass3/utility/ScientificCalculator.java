package utility;
import utility.SimpleCalculator;
import utility.iScientificCalculator;
public class ScientificCalculator extends SimpleCalculator implements iScientificCalculator {
	private double angle;
	
	

	public ScientificCalculator() {
		super();
	}

	@Override
	public double sin(double angle) {
		// TODO Auto-generated method stub
		return Math.sin(angle);
	}

	@Override
	public double cos(double angle) {
		// TODO Auto-generated method stub
		return Math.cos(angle);
	}

	@Override
	public double tan(double angle) {
		// TODO Auto-generated method stub
		return Math.tan(angle);
	}
	
	
}
