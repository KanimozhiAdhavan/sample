package taskFunction;

public class UseTaskPrice {
	public static void main(String[] args) {
		TaskPrice t=new TaskPrice();
		t.price=500;
		t.disAmount=5;
		t.taxAmount=100;
		t.taxPercentage=10;
		t.disPercentage=15;
		System.out.println(t.findNetPrice());
		System.out.println(t.findTaxPercentage(25000,10));
		System.out.println(t.findDisPercentage());
	}

}
