package pc.lism.learn;

public class MainTest {

	public static void main(String[] args) {
		//VehicleFactory factory = new CarFactory();
		//VehicleFactory factory = new PlaneFactory();
		//VehicleFactory factory = new TrainFactory();
		VehicleFactory factory = new ShipFactory();
		/** 服务端代码不变，只需调用的客户端代码发生变化 */
		Movable vehicle = factory.create();
		vehicle.run();

	}

}
