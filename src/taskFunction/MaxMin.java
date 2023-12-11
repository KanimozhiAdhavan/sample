package taskFunction;

public class MaxMin {
	public int findMin(int[] ab) {
		int min=ab[0];
		for(int i=0;i<ab.length;i++) {
			if(ab[i]<min) {
				min=ab[i];
			}
			
		}
		return min;
		
	}
	public void findOdd(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) {
				System.out.println(a[i]);
			}
		}
			
		}
	}


