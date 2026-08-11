package busproject;
public class bus {
  private int busno;
  private boolean AC;
  private int capacity;  

  
  bus(int busno,boolean AC,int capacity){
	  this.busno =busno;
	  this.AC =AC;
	  this.capacity = capacity;
	  
  }

  public void setcapcity(int capacity) {
	   this.capacity =capacity;
	   
   }
  public void setbus(int busno) {
	   this.busno =busno;
	   
  }
  
  public int getCapactiy() {
	  return this.capacity;
  }
  public int getbusno() {
	  return this.busno;
  }
  
  
  void displaybusinfo() {
	  System.out.println("busNo: " + this.busno +"  AC :" + this.AC +" capacatiy  :" + this.capacity);
  }
  

}
