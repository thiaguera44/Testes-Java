import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Coca lata = new Coca();
    Scanner leitura = new Scanner(System.in);
    int cedula, quantlat, comp;
    System.out.printf("Escolha a Cédula(R$1, R$2, R$5, R$10): ");
    cedula = leitura.nextInt();
    lata.setCedula(cedula);
    System.out.printf("\n");
    System.out.printf("Informe a quantidade de latas: ");
    quantlat = leitura.nextInt();
    lata.setQuantidade(quantlat);
    System.out.printf("\n");
    System.out.printf("Você deseja comprar?(1=SIM 2=NÃO) ");
    comp = leitura.nextInt();
    System.out.printf("\n");
    if(comp==1){
      if(lata.PermCompra()== true){
        System.out.printf("Retire suas latas e o seu troco de R$"+lata.troco());
      }else{
        System.out.printf("O valor da cédula insuficiente para a compra da quantidade de latas");
      }
    }else{
      System.exit(0);
    }
  }
}
