
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.cargo = "Professor de Educação Física";
		func.salario = 1100;
		
		System.out.println("O cargo do funcionário é: " + func.cargo);
		System.out.println("Salário por mês: " + func.salario);

	}

}
