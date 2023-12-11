package taskFunction;

public class UseAtm {
	public static void main(String[] args) {
		Atm atm=new Atm();
		atm.mainBalance=500000;
		System.out.println(atm.findCredit( 200000));
		System.out.println(atm.findDebit( 700000));
		}
	}


