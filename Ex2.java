package curs6;

public class Ex2 {
	public static void main(String[] args) {

		String line = "Eu invat Java";
		System.out.println(line);
		line = line.toLowerCase();
		char[] lineArray = line.toCharArray();

		char vocalaA = 'a';
		char vocalaE = 'e';
		char vocalaI = 'i';
		char vocalaO = 'o';
		char vocalaU = 'u';

		boolean vocalaFound = false;
		int vocaleCount = 0;

		for (char ch : lineArray) {
			if (ch == vocalaA || ch == vocalaE || ch == vocalaI || ch == vocalaO || ch == vocalaU) {
				vocalaFound = true;
				vocaleCount++;
			}
		}

		if (vocalaFound) {
			System.out.println("Vocale: " + vocaleCount);
		}

	}
}
