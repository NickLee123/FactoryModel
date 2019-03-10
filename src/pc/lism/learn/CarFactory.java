package pc.lism.learn;

public class CarFactory extends VehicleFactory {

	@Override
	public Movable create() {
		return new Car();
	}

}
