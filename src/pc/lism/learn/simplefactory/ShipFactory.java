package pc.lism.learn.simplefactory;

public class ShipFactory extends VehicleFactory{

	@Override
	public Movable create() {
		return new Ship();
	}

}
