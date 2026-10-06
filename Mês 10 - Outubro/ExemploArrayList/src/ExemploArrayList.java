import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

        public static void main(String[] args) {

            List<Integer> idades = new ArrayList<>();

            idades.add(21);
            idades.add(20);
            idades.add(54);
            idades.add(36);
            idades.add(27);
            idades.add(18);

            System.out.println("\nQuantidade de Idades: " + idades.size()); // Retorna a quantidade de valores informados no vetor
            System.out.println("\nValores do Vetor: " + idades); // Retorna os valores informados no vetor

            System.out.println("\nValor Existente no Vetor: " + idades.contains(54)); // Retorna se contém o valor informado no vetor
            System.out.println("Posição do Valor no Vetor: " + idades.indexOf(54)); // Retorna a posição do valor informado no vetor
            System.out.println("\núltimo Valor Informado no Vetor: " + idades.getLast()); // Retorna o último valor informado no vetor

            Collections.sort(idades); // Organiza os valores do vetor
            System.out.println("\nLista Ordenada Collections Sort: " + idades);

        }
}
