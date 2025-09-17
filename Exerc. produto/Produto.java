public class Produto.{

 private String nome;
 private double preco;
 private int quantidadeEmEstoque;

  public Produto(String nome, double salario, double quantidadeEmEstoque) {

 this.nome = nome;
 this.preco = preco;
 this.quantidadeEmEstoque = quantidadeEmEstoque;
}

  public void(); {
  	System.out.println("nome: " + nome);
  	System.out.println("preco: " + preco);
  	System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }
}
 public class main {
 	public static void main(String[] args ) {

 		Produto produto1 = new Produto("Geladeira", 2000.00, 5);
 		Produto produto2 = new Produto("Celular", 1500.00, 3);

 		produto1.exibirInformacoes();
 		produto2.exibirInformacoes();

}  
    }