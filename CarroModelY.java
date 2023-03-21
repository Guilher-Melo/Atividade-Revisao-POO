public class CarroModelY extends Tesla {
  
  double preco;

  public CarroModelY(String modelo, String autonomia, double nivelBateria, double preco) {
    super(modelo, autonomia, nivelBateria);
    this.preco = preco;
  }

 
  @Override
  public double carregarCarro() {
    while (nivelBateria < 50) {
      nivelBateria++;
    }
    return nivelBateria;
  }

  @Override
  public String toString() {
    return "Tesla [modelo=" + modelo + ", autonomia=" + autonomia + ", nivelBateria=" + nivelBateria + ", preço= " + preco + "]";
  }
}
