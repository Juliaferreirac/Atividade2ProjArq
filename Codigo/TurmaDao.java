import java.util.ArrayList;
import java.util.List;

public class TurmaDao {
    private List<Aluno> listaDao = new ArrayList<>();

    public void save(Aluno aluno) {
        listaDao.add(aluno);
        System.out.println("Aluno salvo: " + aluno.getNome());
    }

    public void update(String matricula, Aluno alunoAtualizado) {
        for (int i = 0; i < listaDao.size(); i++) {
            if (listaDao.get(i).getMatricula().equals(matricula)) {
                listaDao.set(i, alunoAtualizado);
                System.out.println("Aluno atualizado: " + alunoAtualizado.getNome());
                return;
            }
        }
        System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
    }

    public void delete(Aluno aluno) {
        listaDao.remove(aluno);
        System.out.println("Aluno removido: " + aluno.getNome());
    }

    public List<Aluno> getListaDao() {
        return listaDao;
    }
}
