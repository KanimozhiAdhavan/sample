package taskFunction;

public class FindMaxMin {
	public int findMax(int[] ab) {
		int a=ab[0];
		for(int i=0;i<ab.length;i++) {
			if(ab[i]>a) {
				a=ab[i];
			}
		}
		return a;
	}
	public void findEven(int[] ad) {
		for(int i=0;i<ad.length;i++) {
			if(ad[i]%2==0) {
				System.out.println(ad[i]);
			}
		}
	}

}
