package zyanken;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		name();
	}

	public static void name() {
		System.out.println("じゃんけんの手を入力してください（０：グー　１：チョキ　2：パー）");
		Scanner scanner = new Scanner(System.in);
		int a = Integer.valueOf(scanner.next());
		if (a == 0) {
			System.out.println("あなたの手はグーです");
		} else if (a == 1) {
			System.out.println("あなたの手はチョキです");
		} else {
			System.out.println("あなたの手はパーです");
		}
		Random random = new Random();
		int b = random.nextInt(2);
		if (b == 0) {
			System.out.println("あいての手はグーです");
		} else if (b == 1) {
			System.out.println("あいての手はチョキです");
		} else {
			System.out.println("あいての手はパーです");
		}

		if (a == b) {
			System.out.println("あいこです");
		} else if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0)) {
			System.out.println("あなたの勝ちです");
		} else {
			System.out.println("あなたの負けです");
		}

	}

}
