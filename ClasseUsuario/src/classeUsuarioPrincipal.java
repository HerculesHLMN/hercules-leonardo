public class classeUsuarioPrincipal {
     public static void main(String[] args) {


          classeUsuario u1 = new classeUsuario();
          classeUsuario u2 = new classeUsuario();

          u1.nome = "Daniele";
          u1.sexo = 'F';
          u1.dataNascimento = "25/01/89";
          u1.estadoCivil = "Casada";

          u2.nome = "Lucas";
          u2.sexo = 'M';
          u2.dataNascimento = "11/02/2010";
          u2.estadoCivil = "Solteiro";

          System.out.println("\n" + "Nome: " + u1.nome + "\n" + "Sexo: " + u1.sexo);
          System.out.println("Data Nascimento: " + u1.dataNascimento + "\n" + "Estado Civíl: " + u1.estadoCivil);
          System.out.println("\n" + "Nome: " + u2.nome + "\n" + "Sexo: " + u2.sexo);
          System.out.println("Data Nascimento: " + u2.dataNascimento + "\n" + "Estado Civíl: " + u2.estadoCivil);

     }
}
