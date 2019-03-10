package pc.lism.learn.abstractfactory;

public class MainTest {

	public static void main(String[] args) {
		//AbstractFactory factory = new NomalFactory();
		AbstractFactory factory = new MagicFactory();
		Vehicle vehicle = factory.createVehicle();
		vehicle.run();
		Weapon weapon = factory.createWeapon();
		weapon.shoot();
		Food food = factory.createFood();
		food.eatSomething();
		//抽象工厂添加系列产品麻烦，要改很多类，但是添加起来很爽，做到了统一管理
		//简单工厂添加产品方便，但是每类产品会创建一个工厂，导致工厂泛滥
	}

}
