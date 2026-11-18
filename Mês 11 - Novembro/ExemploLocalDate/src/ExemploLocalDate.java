import java.time.LocalDate;
import java.time.Period;

public class ExemploLocalDate {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        System.out.println("\nData: " + hoje);

        LocalDate dataNascimentoHercules = LocalDate.of(2008,2,10);
        LocalDate dataNascimentoDaniele = LocalDate.of(1989,1, 25 );

        int idadeDaniele = Period.between(dataNascimentoDaniele, hoje).getYears();
        System.out.println("\nDaniele tem " + idadeDaniele + " anos");

        int idadeHercules = Period.between(dataNascimentoHercules, hoje).getYears();
        System.out.println("Hercules tem " + idadeHercules + " anos");

        if(dataNascimentoHercules.isAfter(dataNascimentoDaniele)) {
            System.out.println("\nHércules é Mais Novo");

        } else {
            System.out.println("\nDaniele é mais nova");

        }
    }
}
