public class Funcionarioojava {
	
	String nome;
	String cargo;
	int idade;

	// Este é o construtor
	Funcionarioojava (String nomeinit, String cargoinit, int idadeinit) {
		nome = nomeinit;
		cargo = cargoinit;
		idade = idadeinit;
    }

	public static void main (String [] args){

	Funcionarioojava funcionario1 = new Funcionarioojava("João", "Desenvolvedor", 30);

	Funcionarioojava funcionario2 = new Funcionarioojava("maria", "gerente", 50);


	System.out.println("Nome: " + funcionario1.nome);
	System.out.println("Cargo: " + funcionario1.cargo);
	System.out.println("idade: " + funcionario1.idade);
    System.out.println("---------------------------");
	System.out.println("Nome: " + funcionario2.nome);
	System.out.println("Cargo: " + funcionario2.cargo);
	System.out.println("idade: " + funcionario2.idade);

    }

}