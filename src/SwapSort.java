import java.util.Arrays;

public class SwapSort {
	// program to show swapping of characters
	// by the usage of toCharArray().

	static char[] SWAP(String str, int i, int j) {
		char ch[] = str.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return ch;
	}

	public static String Sort_TAM(char[] input) {

		char newInput[] = input; // conversion of string to char Array

		Arrays.sort(newInput); // sorting of newInput array

		return new String(newInput); // new sorted string
	}

	public static void main(String args[]) {

		String input = "TAma";
		System.out.println(input);

		char[] TAMUK = SWAP(input, 0, input.length() - 1);

		System.out.println(TAMUK);
		System.out.println(Sort_TAM(TAMUK));

	}

}
