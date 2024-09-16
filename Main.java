
public class Main {
  public static void main(String[] args) {

    //Instanciando o objeto pessoa
    Pessoa pessoa1 = new Pessoa("Miguel", 17);
    Pessoa pessoa2 = new Pessoa("Sofia", 17);
    Pessoa pessoa3 = new Pessoa("Taua", 18);
    //System.out.println(pessoa1.exibiInfo());
    //System.out.println(pessoa2.exibiInfo());
    System.out.println(pessoa3.exibiInfo());
    System.out.println(pessoa3.getNome());
    System.out.println(pessoa3.getIdade());
  }

}