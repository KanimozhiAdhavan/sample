package taskFunction;

public class Car {
	String barnd;
	int price;
	String color;
	int tax;
	
	public int findNetPrice(Car[] cc) {
		int total=0;
		for(int i=0;i<cc.length;i++) {
			total=total+cc[i].price;
		}   
		return total;
	}
//	public Car findMaxPrice(Car[] car) {
//		Car max=car[0];
//		for(int i=0;i<car.length;i++) {
//			if(car[i].price > max.price) {
//				max=car[i];
//			}
//		}
//		return max;
//	}
//	public void findColor(Car[] aa) {
//		for(int i=0;i<aa.length;i++) {
//			if(aa[i].equals("yellow")) {
//				System.out.println(aa[i].barnd);
//			}
//		}  
//		
//	}
	
	public void findColor(Car[] aa) {
		for(int i=0;i<aa.length;i++) {
			if(aa[i].color.equalsIgnoreCase("Yellow")) {
				System.out.println(aa[i].barnd);
			} 
		}  
		
	}
	
}



