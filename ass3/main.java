package apps;
import utility.SimpleCalculator;
import utility.ScientificCalculator;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCalculator s1 = new SimpleCalculator();
		System.out.println(s1.add(2, 3));
		System.out.println(s1.divide(2, 2));
		System.out.println(s1.muliply(2, 2));
		System.out.println(s1.subtract(2, 2));
		
		ScientificCalculator sc1 = new ScientificCalculator();
		System.out.println(sc1.sin(30));
		System.out.println(sc1.cos(30));
		System.out.println(sc1.tan(30));
		
		

	}

}
