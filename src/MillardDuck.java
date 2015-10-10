
public class MillardDuck extends Duck {

	public MillardDuck()
	{
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a real Mallard Duck.");
	}

}
