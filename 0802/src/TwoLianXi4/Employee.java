package TwoLianXi4;

public class Employee extends Printer{
	
	void print(){
		
	}
	public void  makeBook(Printer p){
		if(p instanceof BlackPrinter ){
			BlackPrinter b = (BlackPrinter)p ;
			b.print();
		}else if(p instanceof ColorPrinter){
			ColorPrinter c = (ColorPrinter)p ;
			c.print();
		}
	}
}