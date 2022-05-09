
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.cargo = "Professor de Educação Física";
		func.salario = 1100;
		
		Endereco endr = new Endereco();
		endr.bairro = "Pimentas";
		endr.estado = "SP";
		func.endereco = endr;
		
		System.out.println("O cargo do funcionário é: " + func.cargo);
		System.out.println("Salário por mês: " + func.salario);
		System.out.println("Estado onde mora: " + func.endereco.estado);
		System.out.println("Bairro onde mora: " + func.endereco.bairro);

	}

}
