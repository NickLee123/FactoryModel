package pc.lism.learn;

public class MainTest {

	public static void main(String[] args) {
		//VehicleFactory factory = new CarFactory();
		//VehicleFactory factory = new PlaneFactory();
		//VehicleFactory factory = new TrainFactory();
		VehicleFactory factory = new ShipFactory();
		/** ����˴��벻�䣬ֻ����õĿͻ��˴��뷢���仯 */
		Movable vehicle = factory.create();
		vehicle.run();

	}

}
