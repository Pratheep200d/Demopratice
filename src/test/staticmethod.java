package test;

public class staticmethod {
	public static void main(String args[]){
		acess as =new acess();
		as.name = "pratheep";
		as.info();
	}
}

	
	class acess{
		String name;
	 static	String school;
	
	 static {
		 school = "capgeino";
		 System.out.println("welcome to my school");
		 
	 }
	 
	 void info() {
		 System.out.println(name +school); 
	 }
	
}

