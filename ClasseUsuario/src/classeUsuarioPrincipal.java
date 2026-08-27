public class classeUsuarioPrincipal {
     public static void main(String[] args) {


          classeUsuario u1 = new classeUsuario();
          classeUsuario u2 = new classeUsuario();

          u1.nome = "Daniele";
          u1.sexo = 'F';
          u1.dataNascimento = "25/01/89";
          u1.estadoCivil = "Casada";

          System.out.println("\n" + "Nome: " + u1.nome + "\n" + "Sexo: " + u1.sexo + "\n" + "");
     }
}
