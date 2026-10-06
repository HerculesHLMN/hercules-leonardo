import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeiroArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> valores = new ArrayList<>();

        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);
        valores.add(5);
        valores.add(6);

        System.out.printf("\nInforme um Valor: ");
        int valor = sc.nextInt();

        int indice = valores.indexOf(valor);

        if (indice != -1) {
            System.out.println("O valor Está na " + indice + "º Posição do Vetor");
        } else {
            System.out.println("Valor Não está na lista!");
        }

        sc.close();

    }

}
