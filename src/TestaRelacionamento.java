
public class TestaRelacionamento {

	public static void main(String[] args) {
		Cliente cli = new Cliente();
		CartaoCliente card = new CartaoCliente();
		
		card.cliente = cli;
	}

}
