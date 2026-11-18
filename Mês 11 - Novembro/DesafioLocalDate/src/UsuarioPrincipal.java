import java.time.LocalDate;

public class UsuarioPrincipal {
    public static void main(String[] args) {

        Usuario u = new Usuario(LocalDate.of(2007, 2, 27));

        if (u.determinarMaiorIdade()) {
            System.out.println("\nUsuário Maior de Idade");

        } else {
            System.out.println("\nUsuario Menor de Idade");

        }
    }
}
