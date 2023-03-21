public class Main {
  public static void main(String[] args) {
    Tesla carro1 = new Tesla("Model S", "555 km", 30 );

    carro1.carregarCarro();

    System.out.println(carro1.toString());

    CarroModelY carro2 = new CarroModelY("Model Y", "450 km", 30.5, 600000.99);
  
    carro2.carregarCarro();

    System.out.println(carro2.toString());


    CarroModel3 carro3 = new CarroModel3("Model 3", "499 km", 7.6, 225);
    carro3.carregarCarro();

    System.out.println(carro3.toString());
  }
}
