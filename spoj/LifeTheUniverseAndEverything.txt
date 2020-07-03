/**
 * ID 1
 * NAME Life, the Universe, and Everything
 */

import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		while (true) {
			numero = scanner.nextInt();
			if (numero == 42)
				break;
			System.out.println(numero);
			if (!scanner.hasNext())
				break;
		}
	}
}
