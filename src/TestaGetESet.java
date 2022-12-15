
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(2223, 252525);
		// conta.numero = 123; is not visible!
		System.out.println(conta.getNumero());
		System.out.println(conta.getAgencia());

		Cliente paulo = new Cliente();
		// conta.titular = paulo; is not visible!
		paulo.setNome("Paulo Silveira");

		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador Full Stack");
		
		System.out.println(conta.getTitular().getProfissao());
	}
}
