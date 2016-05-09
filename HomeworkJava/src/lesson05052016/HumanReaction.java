package lesson05052016;

public class HumanReaction {

	public static void main(String[] args) {

		Human humanOne = new Human("Петя");

		humanOne.getPocketMoney(false);
		humanOne.eatCompany();

		Human humanTwo = new Human("Ваня");
		humanTwo.getPocketMoney(true);
		humanTwo.eatCompany();
		humanTwo.eatCompany();
	}
}
