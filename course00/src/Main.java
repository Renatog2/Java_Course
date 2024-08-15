import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String y = "Olá mundo";
		
		System.out.println(y);
		System.out.println("Olá mundo");
		System.out.print("Olá ");
		System.out.print("mundo");
		System.out.println("");
		
		
		double x = 10.007;
		System.out.println(x);
		/* Essa função antes da variável limita as casas após a virgula
		 * Mesmo que Você não tenha tantas casas ele preenche com zeros para ficar a quantidade de casas solicitadas
		 * */
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		/* Já esse cara aqui muda a localidade, simulando um sistema em outro País para não usar a "," nas casas decimais
		 * Note que esse print vai sair com "." diferente dos anteriores que sairam com ","
		 * */
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		
		
		System.out.println("CONCAT que todos conheçemos: X é " + x + "!!!");
		System.out.printf("CONCAT diferenciado: X é %.2f !!!%n", x);
		System.out.printf("CONCAT String y que vale '%s' e o Double x que vale '%.2f'%n", y, x);
		

		int a, b;
		double resultado;
		a = 5;
		b = 2;
		/* Mesmo sendo a variável resultado sendo Double ele não irá retornar a divisão de 2 inteiros como double se não indicar ao Java para não truncar
		 * Essa indicação é feita escrevendo o '(double)' no momento da operação
		 * */
		resultado = (double) a/b;
		System.out.println(resultado);
		double aa;
		int bb;
		aa = 5.0;
		/* Nesse caso estou forçando o Java a truncar*/
		bb = (int) aa;
		System.out.println(bb);
	}
}
