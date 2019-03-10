package pc.lism.learn.simplefactory;

public class PlaneFactory extends VehicleFactory {

	@Override
	public Movable create() {
		return new Plane();
	}

}
