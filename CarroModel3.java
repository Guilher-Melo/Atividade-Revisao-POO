public class CarroModel3 extends Tesla {

  double velMax;

  public CarroModel3(String modelo, String autonomia, double nivelBateria, double velMax) {
    super(modelo, autonomia, nivelBateria);
    this.velMax = velMax;
  }

  @Override
  public double carregarCarro() {
    while (nivelBateria < 100) {
      nivelBateria+=5;
    }
    if (nivelBateria > 100) {
      nivelBateria = 100;
    }
    return nivelBateria;
  }

  @Override
  public String toString() {
    return "Tesla [modelo=" + modelo + ", autonomia=" + autonomia + ", nivelBateria=" + nivelBateria + ", velocidade máxima= " + velMax+ "]";
  }
}
