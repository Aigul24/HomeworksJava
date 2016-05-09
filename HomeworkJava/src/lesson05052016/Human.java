package lesson05052016;

public class Human {

	private boolean hasEnoughMoney; // field
	private String name;

	public Human(String name) {
		this.name = name;
	}

	public void getPocketMoney(boolean isGetMoney) {
		hasEnoughMoney = isGetMoney;
		if (isGetMoney) {
			System.out.println(name + " получил карманные деньги от родителей!");
		} else {
			System.out.println(name + " остался без карманных денег...");
		}

	}

	public void eatCompany() {
		if (hasEnoughMoney) {
			System.out.println(name + " поел в кафе с друзьями!");
			hasEnoughMoney = false;
		} else {
			System.out.println(name + " поел дома c родителями.");
		}
	}
}
