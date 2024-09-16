//Definir a classe Pessoa
public class Pessoa{
  //Atributos da classe 
  private String nome;
  private int idade;

  //Construtor para inicializar a classe
  public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }

  //Métodos da classe
  public String exibiInfo(){
    return "Nome: " + nome + ", Idade: " + idade;
  }
  public String getNome(){
    return nome;
  }

  public int getIdade(){
    return idade;
  }
}