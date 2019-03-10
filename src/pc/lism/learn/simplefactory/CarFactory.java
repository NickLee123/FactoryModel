package pc.lism.learn.simplefactory;

public class CarFactory extends VehicleFactory {

	@Override
	public Movable create() {
		return new Car();
	}

}
