import empresa.dados.*;
public class FolhaDePagamento {
       public static void main(String[] args) {
               Funcionario funcionario = new Funcionario("Arnaldo", 5000.00);
               funcionario.aumentarSalario(1000);
               
               System.out.println(funcionario.obterInfo());
               
       }       
}   