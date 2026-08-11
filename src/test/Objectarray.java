package test;


public class Objectarray {
public static void main(String args[]) {
	students aa = new students();
	aa.mark=23;
	aa.name="pratheep";
	
	students aa1 = new students();
	aa1.mark=63;
	aa1.name="SATHIYA";
	
	students a[]=new students[2];
	a[0]=aa;
	a[1]=aa1;
	
	for(students qn: a) {
		System.out.println(qn.name +"" + qn.mark);
	}
}
}



class students{
	int mark;
	String name;
	
}