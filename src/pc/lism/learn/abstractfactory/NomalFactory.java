package pc.lism.learn.abstractfactory;

public class NomalFactory extends AbstractFactory {

	@Override
	public Vehicle createVehicle() {
		return new Airship();
	}

	@Override
	public Weapon createWeapon() {
		return new Handgun();
	}

	@Override
	public Food createFood() {
		return new Banana();
	}

}
