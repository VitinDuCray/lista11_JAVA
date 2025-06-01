package lista11_JAVA;

public class E10_Primos1a100 {
	public static void main(String[] args) {
		int totalPrimos = 0;

		for (int i = 2; i <= 100; i++) {
			boolean ehPrimo = true;

			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					ehPrimo = false;
					break;
				}
			}

			if (ehPrimo) {
				System.out.print(i + " ");
				totalPrimos++;
			}
		}

		System.out.println("\nTotal de números primos entre 1 e 100: " + totalPrimos);
	}
}
