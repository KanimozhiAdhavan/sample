package taskFunction;

public class College {
	String name;
	int fees;
	char grade;
	String code;
	public College findMinimumFees(College[] clgs) {
		College min=clgs[0];
		for(int i=0;i<clgs.length;i++) {
			if(clgs[i].fees<min.fees) {
				min=clgs[i];
				
			}
		}
		return min ;
	}

}
