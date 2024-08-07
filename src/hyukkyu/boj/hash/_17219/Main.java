package hyukkyu.boj.hash._17219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, String> hashMap = new HashMap<String, String>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			hashMap.put(st.nextToken(), st.nextToken());				
		}
		
		for(int i = 0; i < M; i++) {
			list.add(br.readLine());
		}
		
		for(String getStr : list) {
			if(hashMap.containsKey(getStr)) {
				System.out.println(hashMap.get(getStr));
			} 
		}
	}

}
