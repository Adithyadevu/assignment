package aggregation;

public class Address {
	String addrs;
	Studentex s;
	public Address(String addrs,Studentex s) {
		this.addrs=addrs;
		this.s=s;
	}
public void print() {
	System.out.println(s.name+" "+s.rollno);
	System.out.println("Address: "+addrs);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Studentex obj=new Studentex("Devu",44);
Address ob=new Address("Diamond flat ,kollam,695584",obj);
ob.print();

	}

}
