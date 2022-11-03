import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		int i, anoAtual, anoNasc, idade;
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.println("Informe o ano atual");
			anoAtual = leia.nextInt();
			System.out.println("Informe o ano do seu nascimento");
			anoNasc = leia.nextInt();
			
			idade = anoAtual - anoNasc;
			
			if(idade>=18) {
				System.out.println("Você é maior de idade");
			}
			else {
				System.out.println("Você é menor de idade");
			}
			System.out.println("Deseja continuar com a execução?");
			i = leia.nextInt();
		}
		while(i==1);
	}

}
