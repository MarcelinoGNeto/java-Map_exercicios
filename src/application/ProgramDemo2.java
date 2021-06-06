package application;

import java.util.Map;
import java.util.TreeMap;

public class ProgramDemo2 {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("Username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "91993078309");
		
		cookies.remove("email");
		cookies.put("phone", "91992947483");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("ALL COOKIES:");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}