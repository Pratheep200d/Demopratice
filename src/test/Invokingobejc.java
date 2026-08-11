package test;

public class Invokingobejc {
	public static void main(String args[]) {
		student mm = new student("pratheep",23,10,12);
		student mm1 =new student("Pratheep" ,12,11,122);
		
	System.out.println(	mm.name +" " + mm.roll +" " + mm.markstotl());
	System.out.println(	mm1.name +" " + mm1.roll +" " + mm1.markstotl());

	}

}

class student{
	 String name;
	 int roll;
	 int marksubject1;
		 int marksubject2;

	student(String n,int r,int m2,int m1){
		marksubject1 = m1;
       name =n;
       marksubject2 =m2;
       roll =r;
       
       
	}
	 int markstotl() {
	     return marksubject1 + marksubject2 ;

	     
	 }
	 
	 
	 
}