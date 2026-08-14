package atm;

public class DetailCollection {
	
private String name;
private int password;
private int cash;

DetailCollection(String name,int password,int cash){
	this.name = name;
	this.password=password;
	this.cash =cash;
	
	System.out.println("THe work space ");
	System.out.println("this is a new code ");
	System.out.println("thisis ne code by pratheep");
	System.out.println("thisis ne code by pratheep2");

	System.out.print("this is new code ");
	System.out.print("we have made the code archd dex team");
	System.out.print("we have made the code archd dex team");

	System.out.print("this is the new release code");
	System.out.println("checking");
}
public int getCash() {
	return cash;
}

public void setCash(int cash) {
	this.cash = cash;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}


}
