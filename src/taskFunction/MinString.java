package taskFunction;

public class MinString {
	public void findMin(String[] a) {
		String min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i].length()<min.length()) {
				min=a[i];
			}
			
		}
		System.out.println(min);
	}

}
