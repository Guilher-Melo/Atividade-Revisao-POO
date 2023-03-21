public class Tesla {
  String modelo;
  String autonomia;
  double nivelBateria;


  public Tesla(String modelo, String autonomia, double nivelBateria) {
    this.modelo = modelo;
    this.autonomia = autonomia;
    this.nivelBateria = nivelBateria;
  }

  public double carregarCarro() {
    return nivelBateria++;
  }

  @Override
  public String toString() {
    return "Tesla [modelo=" + modelo + ", autonomia=" + autonomia + ", nivelBateria=" + nivelBateria + "]";
  }

  
}