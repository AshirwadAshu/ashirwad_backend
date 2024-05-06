package excelsoft;

public class CountEachCharacter {
	public static void main(String[] args) {
		int[] charCount = new int[128];
		String str ="AASSAwewew";
		char[] charArray = str .toCharArray();
		for (char c : charArray) {
			charCount[c]++;
		}

		System.out.println("Count of each character is:");
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > 0) {
				System.out.println((char) i + " : " + charCount[i]);
			}
		}
	}
	}


