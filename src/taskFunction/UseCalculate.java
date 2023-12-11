package taskFunction;

public class UseCalculate {
	public static void main(String[] args) {
		Calculate c1=new Calculate();
	 	System.out.println(c1.add(10, 20));
		//  System.out.println(c1.add(66,88));
		System.out.println(c1.sub());
		System.out.println(c1.add(12,23));
		c1.multiple(10,3);
		c1.div();
	}

}
