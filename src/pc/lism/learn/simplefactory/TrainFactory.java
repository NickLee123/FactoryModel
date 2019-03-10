package pc.lism.learn.simplefactory;

public class TrainFactory extends VehicleFactory {

	@Override
	public Movable create() {
		return new Train();
	}

}
