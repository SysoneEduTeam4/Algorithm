package hyukkyu.boj.array._2577;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int random1 = sc.nextInt();
		int random2 = sc.nextInt();
		int random3 = sc.nextInt();
		int result = random1 * random2 * random3;
		
		String a = String.valueOf(result);
		String[] array = a.split("");
		
		int count = 0;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < array.length; j++) {
				if(i == Integer.parseInt(array[j])) {
					count++;
				}
			}
			System.out.println(count);
			count = 0;
		}
	}

}
