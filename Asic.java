//package MinerSimulator.Asic;
import java.util.Scanner;
public class Asic {
	public  String HOSTNAME;
	private String CPU; // Модель CPU вроде Intel i3-2350m
	private double  CPU_FREQUENCY; // Частота CPU
	private String RAM_NAME;
	private int RAM_COUNT;
	private double RAM_FREQUENCY;
	//[
	public void reboot() {
		System.out.println("Reboot");
	}
	public void enable() {
	}
	public void toBIOS() {
		loadBIOS();
	}

	private void loadBIOS() {
		System.out.println("UEFI (2015)");
		System.out.println("~---------~");
		System.out.println("(1) Загрузить систему");
		System.out.println("(2) Разгон");
		System.out.println("(3) Сброс настроек");
		System.out.println("~==========~");
		Scanner shit = new Scanner(System.in);
		String string = shit.nextLine();
		switch (string) {
		case "1": System.out.println("Just do it, popozshe");
		case "2":
		case "3":
		}
	}
}
