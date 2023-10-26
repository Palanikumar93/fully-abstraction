package Fullabstra;

public class Package extends Food {

	@Override
	public void chicken() {
		System.out.println("Chicken");
	}

	@Override
	public void mutton() {
		System.out.println("Mutton");
	}

	@Override
	public void beef() {
		System.out.println("Beef");
		
	}
	public static void main (String[]args) {
		Package a = new Package();
		 a.chicken();
		 a.beef();
		 a.mutton();
		 a.one();
		
	}

}
