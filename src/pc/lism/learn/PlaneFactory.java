package pc.lism.learn;

public class PlaneFactory extends VehicleFactory {

	@Override
	public Movable create() {
		return new Plane();
	}

}
