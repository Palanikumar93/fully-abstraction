package Fullabstra;

public class Implementation implements Implement{

	@Override
	public void Laptop() {
		System.out.println("Laptop");
	}

	@Override
	public void Charger() {
		System.out.println("Charger");
	}

	@Override
	public void Pen() {
		System.out.println("It is Pen");
		
	}
	public static void main (String[]args) {
		Implementation a = new Implementation();
		a.Charger();
		a.Pen();
		
	}

}
