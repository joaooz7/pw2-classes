
public class TestaAluno {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.nome = "Luciano Calleri Gomes Ceni";
		aluno.dtnasc = "25/01/2005";
		
		System.out.println("O nome do aluno é: " + aluno.nome);
		System.out.println("Este aluno nasceu em " + aluno.dtnasc);
	}
}
