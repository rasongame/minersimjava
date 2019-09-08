import java.util.Scanner;
public class Main {
	public static void callMenu(Player player, Asic asic) {
		
		System.out.println("Баланс: " + player.balance);
		System.out.println("(1) Купить оборудование ");
		System.out.println("(2) Перейти в консоль компьютера");
		System.out.println("(3) Выйти ");
		System.out.println("===========");
		System.out.println("Твой выбор (цифра) ::");
		Scanner her = new Scanner(System.in);
		String input = her.nextLine();
		switch (input) {
			// case 1: goMarket();
		case "2": asic.toBIOS();
		}
	}		
	public static void main(String[] args) {
		System.out.print("Введи свой ник :: ");
		Scanner shit = new Scanner(System.in);
		
		Asic asic = new Asic();
		String username = shit.nextLine();
		
		Player player = new Player();
		player.set_name(username);
		player.change_count_of_money(0.0); //  Ставим баланс и ник игрока
		System.out.println("Добро пожаловать в симулятор майнера, " + player.name);
		callMenu(player, asic);
	}
}
