package pc.lism.learn;

public class TrainFactory extends VehicleFactory {

	@Override
	public Movable create() {
		return new Train();
	}

}
