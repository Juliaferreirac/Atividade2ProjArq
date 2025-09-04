import java.util.ArrayList;
import java.util.List;

public class Turma {
    private List<Aluno> alunos = new ArrayList<>();

    public double calcMedia() {
        if (alunos.isEmpty()) return 0.0;
        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.getNota();
        }
        return soma / alunos.size();
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void add(Aluno aluno) {
        alunos.add(aluno);
    }

    public void delete(Aluno aluno) {
        alunos.remove(aluno);
    }
}
