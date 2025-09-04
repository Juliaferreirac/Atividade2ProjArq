public class TurmaView {

    public void mostraDados(Turma turma) {
        System.out.println("Lista de alunos:");
        for (Aluno aluno : turma.getAlunos()) {
            System.out.println(aluno);
        }
    }

    public void imprimeDados(Turma turma) {
        System.out.println("Média da turma: " + turma.calcMedia());
    }
}
