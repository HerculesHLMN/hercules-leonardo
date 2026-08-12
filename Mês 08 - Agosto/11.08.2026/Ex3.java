import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira a sua massa");
		double massa = input.nextDouble();

		System.out.println("Insira a sua altura");
		double altura = input.nextDouble();

		double imc = massa / Math.pow(altura, 2);

		// Se esta condição for verdadeira, nenhuma das condições
		// seguintes será verificada.
		if (imc < 18.5) {
			System.out.println("Magreza");

			// Se chegamos aqui, significa que imc < 18.5 foi falso.
			// Portanto, já sabemos que imc >= 18.5.
			// Assim, basta verificar se imc <= 24.9.
			// Na prática: 18.5 <= imc <= 24.9
		} else if (imc <= 24.9) {
			System.out.println("Saudável");

			// Para chegar aqui, as duas condições anteriores foram falsas.
			// Sabemos que imc > 24.9.
			// Basta verificar se imc <= 29.9.
			// Na prática: 24.9 < imc <= 29.9
		} else if (imc <= 29.9) {
			System.out.println("Sobrepeso");

			// As condições anteriores foram falsas, então imc > 29.9.
			// Basta verificar se imc <= 34.9.
			// Na prática: 29.9 < imc <= 34.9
		} else if (imc <= 34.9) {
			System.out.println("Obesidade I");

			// As condições anteriores foram falsas, então imc > 34.9.
			// Basta verificar se imc <= 39.9.
			// Na prática: 34.9 < imc <= 39.9
		} else if (imc <= 39.9) {
			System.out.println("Obesidade II");

			// Se chegou ao else, todas as condições anteriores foram falsas.
			// Portanto, sabemos que imc > 39.9.
		} else {
			System.out.println("Obesidade III");
		}

	}
}