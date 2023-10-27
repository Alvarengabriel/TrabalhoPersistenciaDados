@Service
public class AlunoService {

  @Autowired
  private EntityManager entityManager;

  public void salvar(Aluno aluno) {
    entityManager.persist(aluno);
  }

  public Aluno buscarPorMatricula(String matricula) {
    return entityManager.find(Aluno.class, matricula);
  }

  public List<Aluno> listarTodos() {
    return entityManager.createQuery("SELECT a FROM Aluno a", Aluno.class)
        .getResultList();
  }

  public void excluir(Aluno aluno) {
    entityManager.remove(aluno);
  }

}
