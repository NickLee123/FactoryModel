package pc.lism.learn;

public class ShipFactory extends VehicleFactory{

	@Override
	public Movable create() {
		return new Ship();
	}

}
