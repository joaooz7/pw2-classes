
public class TestaAluno {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.nome = "Luciano Calleri Gomes Ceni";
		aluno.dtnasc = "25/01/2005";
		
		Turma trm = new Turma();
		trm.periodo = "Manh�";
		trm.serie = "2a s�rie";
		trm.sigla = "A";
		trm.tipo = "Ensino M�dio";
		aluno.turma = trm;
		
		System.out.println("O nome do aluno �: " + aluno.nome);
		System.out.println("Este aluno nasceu em " + aluno.dtnasc);
		System.out.println("Tipo do ensino: " + aluno.turma.tipo);
		System.out.println("S�rie do aluno: " + aluno.turma.serie);
	}
}
