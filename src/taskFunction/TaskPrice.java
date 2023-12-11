package taskFunction;

public class TaskPrice {
	int price;
	int taxAmount;
	int disAmount;
	int taxPercentage;
	int disPercentage;
	public int findNetPrice() {
		return price+taxAmount;
	}
	public int findTaxPercentage(int price,int taxPercentage) {
		return price+ (price*taxPercentage)/100;
	}
	public int findDisPercentage() {
		return price-price*(disPercentage)/100;
	}

}
