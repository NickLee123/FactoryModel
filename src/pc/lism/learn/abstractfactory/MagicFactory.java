package pc.lism.learn.abstractfactory;

public class MagicFactory extends AbstractFactory {

	@Override
	public Vehicle createVehicle() {
		return new Broom();
	}

	@Override
	public Weapon createWeapon() {
		return new MagicStick();
	}

	@Override
	public Food createFood() {
		return new Mushroom();
	}

}
