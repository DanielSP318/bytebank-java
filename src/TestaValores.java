
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(2223, 242236);

		// conta.setAgencia(-50);
		// conta.setNumero(-330);

		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(2223, 21212121);		
		Conta conta3 = new Conta(2223, 202020);
		Conta conta4 = new Conta(2223, 122121212);

		System.out.println("Total de contas cadastradas: " + Conta.getTotal());
	}
}
