
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.cargo = "Professor de Educa��o F�sica";
		func.salario = 1100;
		
		Endereco endr = new Endereco();
		endr.bairro = "Pimentas";
		endr.estado = "SP";
		func.endereco = endr;
		
		System.out.println("O cargo do funcion�rio �: " + func.cargo);
		System.out.println("Sal�rio por m�s: " + func.salario);
		System.out.println("Estado onde mora: " + func.endereco.estado);
		System.out.println("Bairro onde mora: " + func.endereco.bairro);

	}

}
