class Contador; {

	static int contagem = 0;

	public Contador() {
    

      contagem++;
	}
}

public class TestContador {
	
	public static void main(String[] args) {

	 Contador c1 = new contador();

	 Contador c2 = new contador();

	 Contador c3 = new contador();

	 System.out.println("Numero de objetos criados: " + Contador.contagem);
	}
}