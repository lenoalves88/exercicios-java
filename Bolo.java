public class Bolo {

	int quatidadeAcucar = 288;

	public static void main(String[] args) {

	  Bolo boloDeChocolate = new Bolo();

      boloDeChocolate.quantidadeAcucar = 200;

      Bolo boloDeBaunilha = new Bolo();

      boloDeBaunilha.quantidadeAcucar = 150;

      System.out.println("Quantidade de açúcar no Bolo de chocolate: "
        + boloDeChocolate.quantidadeAcucar);
      System.out.println("Quantidade de açúcar no Bolo de baunilha: "
        + boloDeBaunilha.quantidadeAcucar);
    }
  
}