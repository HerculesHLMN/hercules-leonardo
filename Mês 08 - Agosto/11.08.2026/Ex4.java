import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número de inscrição");
		String numIncricao = input.next();

		System.out.println("Insira a altura");
		double altura = input.nextDouble();

		// Inicializa a menor altura com o maior valor possível de um double.
		// Assim, qualquer altura de atleta será menor que esse valor.
		double alturaMaisBaixa = Double.MAX_VALUE;

		// Inicializa a maior altura com o menor valor possível de um double.
		double alturaMaisAlta = Double.MIN_VALUE;

		String inscricaoMaisAlta = "";
		String inscricaoMaisBaixa = "";

		double somaAlturas = 0;
		int qtdAtletas = 0;

		// O número de inscrição "0" indica que não há mais atletas.
		// Enquanto o número for diferente de "0", o programa continua.
		while (!numIncricao.equals("0")) {

			// Adiciona a altura do atleta à soma total.
			somaAlturas += altura;

			// Incrementa a quantidade de atletas.
			qtdAtletas++;

			// Outra forma de escrever qtdAtletas++:
			// qtdAtletas += 1;
			// qtdAtletas = qtdAtletas + 1;

			// Verifica se a altura atual é maior que a maior altura
			// encontrada até o momento.
			if (altura > alturaMaisAlta) {

				// Atualiza a maior altura.
				alturaMaisAlta = altura;

				// Guarda a inscrição do atleta mais alto.
				inscricaoMaisAlta = numIncricao;
			}

			// Verifica se a altura atual é menor que a menor altura
			// encontrada até o momento.
			if (altura < alturaMaisBaixa) {

				// Atualiza a menor altura.
				alturaMaisBaixa = altura;

				// Guarda a inscrição do atleta mais baixo.
				inscricaoMaisBaixa = numIncricao;
			}

			// Solicita o número de inscrição do próximo atleta.
			System.out.println("Insira o número de inscrição");
			numIncricao = input.next();

			// Solicita a altura do próximo atleta.
			System.out.println("Insira a altura");
			altura = input.nextDouble();
		}

		double media = somaAlturas / qtdAtletas;

		System.out.println("Média das alturas: " + media + " metros");
		System.out.println("Quantidade de atletas: " + qtdAtletas);

		System.out.println("Atleta mais alto: " + inscricaoMaisAlta + " Altura: " + alturaMaisAlta);
		System.out.println("Atleta mais baixo: " + inscricaoMaisBaixa + " Altura: " + alturaMaisBaixa);

	}

}
