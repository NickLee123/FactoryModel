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
		//���󹤳����ϵ�в�Ʒ�鷳��Ҫ�ĺܶ��࣬�������������ˬ��������ͳһ����
		//�򵥹�����Ӳ�Ʒ���㣬����ÿ���Ʒ�ᴴ��һ�����������¹�������
	}

}
