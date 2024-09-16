public class Main {
  public static void main(String[] args) {
  filmes filme1 = new filmes("O Poderoso Chefão", 1972, 175);
    filmes filme2 = new filmes("Esse é meu garoto.", 2012, 116);
     filmes filme3 = new filmes("O Senhor dos Anéis", 2001, 178);

    System.out.println(filme1.exibirInfo());
    System.out.println(filme2.exibirInfo());
    System.out.println(filme3.exibirInfo());
    
  }
}