public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma();
        TurmaDao dao = new TurmaDao();
        TurmaView view = new TurmaView();

        Aluno a1 = new Aluno("Maria", "001", 8.5);
        Aluno a2 = new Aluno("João", "002", 7.0);
        Aluno a3 = new Aluno("Ana", "003", 9.2);

        turma.add(a1);
        turma.add(a2);
        turma.add(a3);

        dao.save(a1);
        dao.save(a2);
        dao.save(a3);

        view.mostraDados(turma);
        view.imprimeDados(turma);

        dao.update("002", new Aluno("João Silva", "002", 8.0));
        dao.delete(a3);

        view.mostraDados(turma);
        view.imprimeDados(turma);
    }
}
