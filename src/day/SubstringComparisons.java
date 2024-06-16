package day;

public class SubstringComparisons {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		smallest += s.substring(0, k);
		largest += s.substring(0, k);

		for (int i = 1; i <= s.length() - k; i++) {
			String subStr = s.substring(i, i + k);
			if (subStr.compareTo(smallest) < 0) {
				smallest = subStr;
			}

			if (subStr.compareTo(largest) > 0) {
				largest = subStr;
			}
		}

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		String s = "welcometojava";
		int k = 3;

		String result = getSmallestAndLargest(s, k);
		System.out.println(result);

	}

}
