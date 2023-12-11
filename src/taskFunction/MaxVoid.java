package taskFunction;

public class MaxVoid {
	public void findMaximum(int[] a) {
		int ab=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>ab) {
				ab=a[i];
			}
		}
		System.out.println(ab);
		
	}

}
