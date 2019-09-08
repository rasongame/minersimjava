public class Player {
	public String name;
	public double balance;
	public int count_of_asics;
	public void change_count_of_money (double money) {
		balance += money;
	}
	public void set_name(String new_name) {
		name = new_name;
	}
}
