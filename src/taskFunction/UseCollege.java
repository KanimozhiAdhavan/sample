package taskFunction;

public class UseCollege {
	public static void main(String[] args) {
		College clg=new College();
		clg.name="sevanthi";
		clg.fees=55000;
		clg.grade='o';
		clg.code="as203";
		College clg1=new College();
		clg1.name="monisri";
		clg1.fees=78000;
		clg1.grade='a';
		clg1.code="sr098";
		College clg2=new College();
		clg2.name="sowmiya";
		clg2.fees=64000;
		clg2.grade='b';
		clg2.code="rt203";
		College[] clgs= {clg,clg1,clg2};
		College c=clg2.findMinimumFees(clgs);
		System.out.println(c.name+"\n"+c.grade+"\n"+c.code+"\n"+c.fees);
		
		
		
		
	}

}
