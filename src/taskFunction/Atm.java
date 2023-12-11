package taskFunction;

public class Atm {
	int mainBalance;
	public int findCredit(int depositeAmount) {
		return mainBalance+depositeAmount;
	}
	public int findDebit(int depositeAmount) {
		return mainBalance-depositeAmount;
	}

}
