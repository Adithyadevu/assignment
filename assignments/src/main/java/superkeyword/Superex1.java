package superkeyword;

public class Superex1 extends Superex {
	public void add() {
		super.add();
		if (sum%10==0) {
			System.out.println(sum+" is divisible by 10");
		}
		else {
			System.out.println(sum+" is not divisible by 10");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Superex1 obj=new Superex1();
obj.add();
	}

}
