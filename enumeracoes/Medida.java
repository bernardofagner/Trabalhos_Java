package enumeracoes;

public enum Medida
{
  MM("Metro"), CM("Cent�metro"), M("Metro");
  public String titulo;
  // Cria o construtor para a enumera��o
  private Medida(String titulo)
  {
    this.titulo = titulo;
  }  
}
