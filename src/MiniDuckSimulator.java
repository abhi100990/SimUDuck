
public class MiniDuckSimulator {

	public static void main(String args[])
	{
		Duck millard = new MillardDuck();
		millard.performQuack();
		millard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehaviour(new FlyRocketPowered());
		model.performFly();
	}
}
