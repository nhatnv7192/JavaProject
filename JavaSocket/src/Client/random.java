package Client;

import java.util.Random;

public class random {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(100);
		System.out.println(a);
	}
}
