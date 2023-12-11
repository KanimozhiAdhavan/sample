package taskFunction;

public class UseCar {
	public static void main(String[] args) {
		Car c=new Car();
		c.barnd="toyota";
		c.color="yellow";
		c.price=20000;
		c.tax=100;
		Car c1=new Car();
		c1.barnd="bmw";
		c1.color="bule";
		c1.price=40000;
		c1.tax=14;
		Car c2=new Car();
		c2.barnd="tata";
		c2.color="yellow";
		c2.price=50000;
		c2.tax=25;
		Car c3=new Car();
		c3.barnd="hyndai";
		c3.color="white";
		c3.price=55000;
		c3.tax=35;
		Car[] cars= {c,c1,c2,c3};
		int t=c1.findNetPrice(cars);
		System.out.println(t);
    	//Car cv=c1.findMaxPrice(cars);
    	//System.out.println(cv.barnd+cv.color+cv.price+cv.tax);
		//System.out.println(c1.barnd);
		
		//c2.findColor(cars);
	}

}
