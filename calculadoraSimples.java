public class CalculadoraSimples {
	public static void main(String[] args) { 
		int a = 10;
		int b = 20;
		int multiplicacao = a * b; 
		int soma = a + b; 
		int subtracao = a - b; 
		double divisao = a / b;
		int modulo = a % b; 

   
     System.out.println("Multiplicação: " + multiplicacao);
     System.out.println("Soma: " + soma);
     System.out.println("Divisão: " + divisao);
     System.out.println("Subtração: " + subtracao);
     System.out.println("Modulo:" + modulo);
   }
}