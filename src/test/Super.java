package test;
class A{
	public A () {
		super();
		System.out.println("IN MANIN CALSS A");
	}
	public void pratheeep() {
		System.out.println("find the way");
	}
}
class b extends A{
	public b() {
		super.pratheeep();
		System.out.println("in b cons");
	}
	public b(int a) {
		super();
		System.out.println("in int constr");
	}
}
public class Super {
    public static void main(String args[]) {
    	b in = new b();
    	
    }

}
