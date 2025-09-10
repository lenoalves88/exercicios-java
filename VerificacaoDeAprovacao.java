public class VerificacaoDeAprovacao {
	public static void main(String[] args) { 
    		int nota1 = 5;
            int nota2 = 5;
            int frequencia = 55;

            double media = (nota1 + nota2) / 2.0;
            boolean aprovado = media >=7 && frequencia >= 75;
            

        if (aprovado) {

            System.out.println("Aluno aprovado!");
        }  else {
            System.out.println("Aluno não aprovado.");
        }   
    }
}
