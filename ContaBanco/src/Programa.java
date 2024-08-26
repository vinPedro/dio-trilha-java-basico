import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO: criando o Scanner
		Scanner input = new Scanner(System.in);
		
		// TODO: Criando Objeto ContaTerminal
		ContaTerminal conta = new ContaTerminal();
		
		// TODO: Recebendo as entradas ContaTerminal
		System.out.println("Por favor, digite o seu Nome!");
		conta.setNomeCliente(input.nextLine());
		System.out.println("Por favor, digite o número da Agência !");
		conta.setAgencia(input.nextLine());
		System.out.println("Por favor, digite o número da Conta!");
		conta.setNumero(Integer.parseInt(input.nextLine()));
		System.out.println("Por favor, digite o Saldo da Conta!");
		conta.setSaldo(Double.parseDouble(input.nextLine()));
		
		// TODO: Imprimindo a mensagem com as informações
		System.out.println(conta.toString());
		

	}

}
