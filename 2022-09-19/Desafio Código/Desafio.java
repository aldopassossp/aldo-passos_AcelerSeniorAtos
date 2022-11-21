public class Desafio{
	public static void main(String[] args){

		Professor professor1 = new Professor("Luciano - Impacta" , "123.456.789-00");
		professor1.setDisciplina("Java");
		professor1.setSalario("R$15.000,00");

		Aluno aluno1 = new Aluno("Aldo de Oliveira Passos" , "987.654.321-00");
		aluno1.setTurma("Java - Acelera Sênior");
		aluno1.setAdvertencia("Maus tratos ao código");

		System.out.println("Primeiro Desafio Acelera Sênior!");
		System.out.println("Professor: " + professor1.getNome());
		System.out.println("CPF: " + professor1.getCpf());
		System.out.println("Disciplina: " + professor1.getDisciplina());
		System.out.println("Salário: " + professor1.getSalario());
		System.out.println("");
		System.out.println("Aluno: " + aluno1.getNome());
		System.out.println("CPF: " + aluno1.getCpf());
		System.out.println("Turma: " + aluno1.getTurma());
		System.out.println("Advertência: " + aluno1.getAdvertencia());
}
}