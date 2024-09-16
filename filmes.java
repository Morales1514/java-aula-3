public class filmes{

  private String titulo;
  private int  anoLancamento;
  private int duracao;


  public filmes(String titulo, int anoLancamento, int duracao){
    this.titulo = titulo;
    this.anoLancamento = anoLancamento;
    this.duracao = duracao;
  }

  public String exibirInfo(){
    return "Titulo: " + titulo + " Ano de Lançamento: " + anoLancamento + " Duraçao: " + duracao;
   }
  
  
}