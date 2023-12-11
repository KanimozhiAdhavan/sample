package taskFunction;

public class Student {
	public int total(int s1,int s2,int s3,int s4,int s5) {
		return s1+s2+s3+s4+s5;
	}
	public int average(int s1,int s2,int s3,int s4,int s5) {
		return (s1+s2+s3+s4+s5)/5;
		
	}
	public void display(int tamil,int maths,int science) {
		System.out.println("tamil:"+tamil+"\n"+"maths:"+maths+"\n"+"science:"+science);
	}


}
