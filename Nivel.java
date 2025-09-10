public class Nivel {
	public static void main(String[] args) { 
		 int nivel  = 6;

         String feedback;


         switch (nivel) {
         case 1 -> feedback = "Muito insatisfeito";
         case 2 -> feedback = "Insatisfeito";
         case 3 -> feedback = " Neutro";
         case 4 -> feedback = "Satisfeito";
         case 5 -> feedback = "Muito satisfeito";
         default -> feedback = "Opção invalida (Deve estar entre 1 e 5)";   

		} 
         System.out.println("Nivel de satisfação: " + feedback);
   }
}