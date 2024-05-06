package day5;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapRunner {
	

	public static void main(String[] args) {
		HashMap<String , Integer>marks = new HashMap<String , Integer>();
		marks.put("john",66);
		marks.put("oliver",46);
		marks.put("Antony",88);
		
		Iterator<String> iterator = marks.keySet().iterator();
		
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str + "===>" + marks.entrySet());
		
		}
}
}