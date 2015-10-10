
public abstract class Duck {

	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	public Duck(){}
	
	public abstract void display();
	
	public void swim()
	{
		System.out.println("All ducks float, even decoys!");
	}
	
	public void setFlyBehaviour(FlyBehaviour newFlyBehaviour)
	{
		this.flyBehaviour = newFlyBehaviour;
	}
	
	public void setQuackBehaviour(QuackBehaviour quackBehaviour)
	{
		this.quackBehaviour = quackBehaviour;
	}

	public void performQuack() {
		quackBehaviour.quack();
		
	}

	public void performFly() {
		flyBehaviour.fly();
	}

}
